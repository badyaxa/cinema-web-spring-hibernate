package cinema.dao.impl;

import cinema.dao.CommentDao;
import cinema.model.Comment;
import cinema.util.EntityManagerUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class JpaCommentDaoImpl implements CommentDao {
    private final EntityManagerFactory entityManagerFactory;

    public JpaCommentDaoImpl() {
        this.entityManagerFactory = EntityManagerUtil.getSessionFactory();
    }

    public JpaCommentDaoImpl(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    @Override
    public Comment create(Comment comment) {
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        try {
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            entityManager.persist(comment);
            entityTransaction.commit();
        } catch (Exception e) {
            if (entityTransaction != null) {
                entityTransaction.rollback();
            }
            throw new RuntimeException("Can't save comment to DB " + comment, e);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
        return comment;
    }

    @Override
    public Comment get(Long id) {
        return null;
    }

    @Override
    public List<Comment> getAll() {
        return null;
    }

    @Override
    public void remove(Comment comment) {
    }
}
