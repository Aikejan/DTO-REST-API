package java10.model;

import jakarta.persistence.*;
import java10.dto.StudentResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@Entity
@Table(name = "student")
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_seq")
    @SequenceGenerator(name = "student_seq",
    allocationSize = 1)

    private Long id;
    private String firstName;
    private String lastName;
    private int age;
    private   String email;
    private LocalDate createdDate;
    private LocalDate graduationDate;
    private  boolean osBlocked;

    public Student(String firstName, String lastName, int age, String email, LocalDate createdDate, LocalDate graduationDate, boolean osBlocked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.createdDate = createdDate;
        this.graduationDate = graduationDate;
        this.osBlocked = osBlocked;
    }

    public Student(Long id, String firstName, String lastName, int age, String email, LocalDate createdDate, LocalDate graduationDate, boolean osBlocked) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.createdDate = createdDate;
        this.graduationDate = graduationDate;
        this.osBlocked = osBlocked;
    }
}