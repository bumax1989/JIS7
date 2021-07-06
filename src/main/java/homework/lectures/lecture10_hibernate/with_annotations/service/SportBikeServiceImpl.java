package homework.lectures.lecture10_hibernate.with_annotations.service;

import homework.lectures.lecture10_hibernate.with_annotations.configuration.HibernateSessionFactoryUtil;
import homework.lectures.lecture10_hibernate.with_annotations.entity.Driver;
import homework.lectures.lecture10_hibernate.with_annotations.entity.Motorcycle;
import homework.lectures.lecture10_hibernate.with_annotations.entity.SportBike;
import homework.lectures.lecture10_hibernate.with_annotations.entity.Type;

import java.util.List;

public class SportBikeServiceImpl implements SportBikeService {

    @Override
    public Motorcycle createSportBike(String brand, String model, Integer year, Integer engineVolume, Integer enginePower,
                                      Type type, Driver driver, boolean plasticCover, boolean clipOn) {
        var session = HibernateSessionFactoryUtil.getSessionFactory().openSession();

        Motorcycle sportBike = new SportBike(brand, model, year, engineVolume, enginePower, type, driver, plasticCover, clipOn);
        var transaction = session.beginTransaction();
        session.save(sportBike);
        transaction.commit();
        session.close();
        return sportBike;
    }

    @Override
    public List findAllSportBikes() {
        var session = HibernateSessionFactoryUtil.getSessionFactory().openSession();

        var transaction = session.beginTransaction();
        List findAll = session.createQuery("FROM SportBike ").list();


        transaction.commit();
        session.close();
        return findAll;
    }

    @Override
    public Motorcycle findSportBikeById(Long sportBikeId) {
        var session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();

        Motorcycle sportBike = (SportBike) session.get(SportBike.class, sportBikeId);

        transaction.commit();
        session.close();
        return sportBike;
    }

    @Override
    public Motorcycle updateSportBike(Long sportBikeId, Integer year) {
        var session = HibernateSessionFactoryUtil.getSessionFactory().openSession();

        var transaction = session.beginTransaction();
        SportBike sportBike = (SportBike) session.get(SportBike.class, sportBikeId);
        sportBike.setYear(2021);

        session.update(sportBike);
        transaction.commit();
        session.close();
        return sportBike;
    }

    @Override
    public void deleteSportBike(Long sportBikeId) {
        var session = HibernateSessionFactoryUtil.getSessionFactory().openSession();

        var transaction = session.beginTransaction();
        SportBike sportBike = (SportBike) session.get(SportBike.class, sportBikeId);

        session.delete(sportBike);
        transaction.commit();
        session.close();
    }
}
