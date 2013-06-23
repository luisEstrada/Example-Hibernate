package org.luis.hibernateexample.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {

            Configuration configuration = new Configuration();
            configuration.configure();
            ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
                    .buildServiceRegistry();
            return configuration.buildSessionFactory(serviceRegistry);
        } catch (Exception e) {
            System.err.println("Session Factory creation failed " + e);
            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionfactory() {
        return sessionFactory;
    }

    public static void shutdown(){
        getSessionfactory().close();
    }

}
