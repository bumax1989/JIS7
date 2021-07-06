package homework.lectures.lecture10_hibernate.with_annotations.service;

import homework.lectures.lecture10_hibernate.with_annotations.entity.Helmet;

public interface HelmetService {
    Helmet createHelmet(String brand, String size);
}
