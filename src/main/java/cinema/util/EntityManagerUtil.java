package cinema.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {
    private static final EntityManagerFactory entityManagerFactory = initEntityManagerFactory();

    private EntityManagerUtil() {
    }

    private static EntityManagerFactory initEntityManagerFactory() {
        try {
            return Persistence.createEntityManagerFactory("mate.academy.ticket_app");
        } catch (Exception e) {
            throw new RuntimeException("Can't create Entity Manager factory ", e);
        }
    }

    public static EntityManagerFactory getSessionFactory() {
        return entityManagerFactory;
    }
}
