package pl.jano.SpringBootCourse.persistence.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "course")
public class Course extends BaseEntity{


    @Column (name = "name")
    private String name;

}
