package homework.lectures.lecture10_hibernate.with_annotations.service;

import homework.lectures.lecture10_hibernate.with_annotations.entity.Driver;
import homework.lectures.lecture10_hibernate.with_annotations.entity.Helmet;

public interface DriverService {
    Driver createDriver(Helmet helmet, String firstName, String lastName, Integer age, String license);
}
