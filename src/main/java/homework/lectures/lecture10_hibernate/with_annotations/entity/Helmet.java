package homework.lectures.lecture10_hibernate.with_annotations.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity

public class Helmet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String brand;
    private String size;

    public Helmet(String brand, String size) {
        this.brand = brand;
        this.size = size;
    }
}
