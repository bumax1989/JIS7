package homework.lectures.lecture10_hibernate.with_annotations.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;



@Data
@NoArgsConstructor
@Entity
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstname;
    private String lastname;
    private Integer age;
    private String license;

    @OneToOne(fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "helmet_id",unique = true)
    private Helmet helmet;


    public Driver(Helmet helmet, String firstname, String lastname, Integer age, String license) {
        this.helmet = helmet;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.license = license;
    }
}
