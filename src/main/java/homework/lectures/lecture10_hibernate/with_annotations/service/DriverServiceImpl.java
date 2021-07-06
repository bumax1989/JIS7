package homework.lectures.lecture10_hibernate.with_annotations.service;

import homework.lectures.lecture10_hibernate.with_annotations.configuration.HibernateSessionFactoryUtil;
import homework.lectures.lecture10_hibernate.with_annotations.entity.Driver;
import homework.lectures.lecture10_hibernate.with_annotations.entity.Helmet;

public class DriverServiceImpl implements DriverService {
    @Override
    public Driver createDriver(Helmet helmet, String firstName, String lastName, Integer age, String license) {
        var session = HibernateSessionFactoryUtil.getSessionFactory().openSession();

        Driver driver = new Driver(helmet, firstName, lastName, age, license);
        var transaction = session.beginTransaction();

        session.save(driver);
        transaction.commit();
        session.close();
        return driver;
    }
}
