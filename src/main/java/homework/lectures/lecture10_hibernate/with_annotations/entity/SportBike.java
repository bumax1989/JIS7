package homework.lectures.lecture10_hibernate.with_annotations.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)

public class SportBike extends Motorcycle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean plasticCover;
    private boolean clipOn;

    public SportBike(String brand, String model, Integer year, Integer engineVolume, Integer enginePower, Type type, Driver driver, boolean plasticCover, boolean clipOn) {
        super(brand, model, year, engineVolume, enginePower, type, driver);
        this.plasticCover = plasticCover;
        this.clipOn = clipOn;
    }
}
