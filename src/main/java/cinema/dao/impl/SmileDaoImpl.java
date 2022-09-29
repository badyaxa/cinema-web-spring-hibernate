package cinema.dao.impl;

import cinema.dao.SmileDao;
import cinema.model.Smile;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class SmileDaoImpl extends AbstractDao implements SmileDao {
    public SmileDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Smile create(Smile smile) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();
            session.save(smile);
            transaction.commit();
            return smile;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Can't save smile to DB " + smile, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Smile get(Long id) {
        try (Session session = factory.openSession()) {
            return session.get(Smile.class, id);
        } catch (Exception e) {
            throw new RuntimeException("Can't get smile with id=" + id + " from DB", e);
        }
    }

    @Override
    public List<Smile> getAll() {
        String hqlQuery = "FROM Smile";
        try (Session session = factory.openSession()) {
            Query<Smile> query = session.createQuery(hqlQuery, Smile.class);
            return query.getResultList();
        } catch (Exception e) {
            throw new RuntimeException("Can't get all smiles from DB", e);
        }
    }
}