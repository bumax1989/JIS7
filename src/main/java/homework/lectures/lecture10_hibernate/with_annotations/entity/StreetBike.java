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
public class StreetBike extends Motorcycle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean handlebar;

    public StreetBike(String brand, String model, Integer year, Integer engineVolume, Integer enginePower, Type type, Driver driver, boolean handlebar) {
        super(brand, model, year, engineVolume, enginePower, type, driver);
        this.handlebar = handlebar;
    }
}
