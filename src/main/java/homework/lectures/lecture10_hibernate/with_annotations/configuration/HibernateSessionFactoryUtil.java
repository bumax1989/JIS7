package homework.lectures.lecture10_hibernate.with_annotations.configuration;

import homework.lectures.lecture10_hibernate.with_annotations.entity.*;
import lombok.SneakyThrows;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.io.FileReader;
import java.util.Properties;

public class HibernateSessionFactoryUtil {
    private static SessionFactory sessionFactory;

    @SneakyThrows
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            Configuration configuration = new Configuration();
            Properties properties = new Properties();
            properties.load(new FileReader("src\\main\\resources\\hibernate.properties"));
            configuration.setProperties(properties);
            configuration.addAnnotatedClass(Helmet.class);
            configuration.addAnnotatedClass(Driver.class);
            configuration.addAnnotatedClass(Motorcycle.class);
            configuration.addAnnotatedClass(SportBike.class);
            configuration.addAnnotatedClass(StreetBike.class);

            var serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }
        return sessionFactory;
    }
}
