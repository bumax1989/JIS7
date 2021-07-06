package homework.lectures.lecture10_hibernate.with_annotations.service;

import homework.lectures.lecture10_hibernate.with_annotations.entity.Driver;
import homework.lectures.lecture10_hibernate.with_annotations.entity.Motorcycle;
import homework.lectures.lecture10_hibernate.with_annotations.entity.Type;

import java.util.List;

public interface SportBikeService {

    Motorcycle createSportBike(String brand, String model, Integer year, Integer engineVolume, Integer enginePower,
                               Type type, Driver driver, boolean plasticCover, boolean clipOn);

    List findAllSportBikes();

    Motorcycle findSportBikeById(Long sportBikeId);

    Motorcycle updateSportBike(Long sportBikeId, Integer year);

    void deleteSportBike(Long sportBikeId);


}
