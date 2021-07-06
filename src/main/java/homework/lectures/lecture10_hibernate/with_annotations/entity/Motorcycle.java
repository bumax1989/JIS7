package homework.lectures.lecture10_hibernate.with_annotations.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@MappedSuperclass
@Data
@NoArgsConstructor

public abstract class Motorcycle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;
    private String model;
    private Integer year;
    private Integer engineVolume;
    private Integer enginePower;
    private Type type;

    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Driver driver;

    public Motorcycle(String brand, String model, Integer year, Integer engineVolume, Integer enginePower, Type type, Driver driver) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engineVolume = engineVolume;
        this.enginePower = enginePower;
        this.type = type;
        this.driver = driver;
    }
}
