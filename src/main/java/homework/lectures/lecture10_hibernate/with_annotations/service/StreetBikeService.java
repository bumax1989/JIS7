package homework.lectures.lecture10_hibernate.with_annotations.service;

import homework.lectures.lecture10_hibernate.with_annotations.entity.Driver;
import homework.lectures.lecture10_hibernate.with_annotations.entity.Motorcycle;
import homework.lectures.lecture10_hibernate.with_annotations.entity.Type;

public interface StreetBikeService {
    Motorcycle createStreetBike(String brand, String model, Integer year, Integer engineVolume, Integer enginePower, Type type,
                                Driver driver, boolean handlebar);
}
