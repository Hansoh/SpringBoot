package pl.jano.SpringBootCourse.persistence.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "user")
public class User extends BaseEntity{


    @Column(name = "id")
    private Long id;

    @Column (name = "firstName")
    private String firstName;

    @Column (name = "lastName")
    private String lastName;

    @Column (name = "emailName")
    private String email;

    @Column (name = "passwordName")
    private String password;

    @Column (name = "adminName")
    private boolean admin;

    @Column (name = "authorName")
    private boolean author;

}