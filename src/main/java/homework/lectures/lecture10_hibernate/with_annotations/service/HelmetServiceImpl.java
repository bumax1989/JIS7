package homework.lectures.lecture10_hibernate.with_annotations.service;

import homework.lectures.lecture10_hibernate.with_annotations.configuration.HibernateSessionFactoryUtil;
import homework.lectures.lecture10_hibernate.with_annotations.entity.Helmet;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HelmetServiceImpl implements HelmetService {
    @Override
    public Helmet createHelmet(String brand, String size) {

        var session = HibernateSessionFactoryUtil.getSessionFactory().openSession();

        Helmet helmet = new Helmet(brand, size);
        Transaction transaction = session.beginTransaction();

        session.save(helmet);
        transaction.commit();
        session.close();
        return helmet;
    }
}
