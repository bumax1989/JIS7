package homework.lectures.lecture10_hibernate.with_annotations.service;

import homework.lectures.lecture10_hibernate.with_annotations.configuration.HibernateSessionFactoryUtil;
import homework.lectures.lecture10_hibernate.with_annotations.entity.Driver;
import homework.lectures.lecture10_hibernate.with_annotations.entity.Motorcycle;
import homework.lectures.lecture10_hibernate.with_annotations.entity.StreetBike;
import homework.lectures.lecture10_hibernate.with_annotations.entity.Type;

public class StreetBikeServiceImpl implements StreetBikeService {
    @Override
    public Motorcycle createStreetBike(String brand, String model, Integer year, Integer engineVolume, Integer enginePower, Type type,
                                       Driver driver, boolean handlebar) {
        var session = HibernateSessionFactoryUtil.getSessionFactory().openSession();

        Motorcycle streetBike = new StreetBike(brand, model, year, engineVolume, enginePower, type, driver, handlebar);
        var transaction = session.beginTransaction();
        session.save(streetBike);
        transaction.commit();
        session.close();
        return streetBike;
    }
}
