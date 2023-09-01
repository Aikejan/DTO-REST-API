package java10.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class SimpleResponse {

    private Long id;
    private  String firstName;
    private  String lastName;
    private  int age;
    private  String email;
    private LocalDate createdDate;
    private  LocalDate graduationDate;
    private  boolean isBlocked;

    private HttpStatus httpStatus;
    private  String message;

    public SimpleResponse(Long id, String firstName, String lastName, int age, String email, LocalDate createdDate, LocalDate graduationDate, boolean isBlocked) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.createdDate = createdDate;
        this.graduationDate = graduationDate;
        this.isBlocked = isBlocked;
    }

    public SimpleResponse(HttpStatus httpStatus, String format) {
    }
}
