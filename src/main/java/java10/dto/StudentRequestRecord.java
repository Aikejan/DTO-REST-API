package java10.dto;

import java.time.LocalDate;

public record StudentRequestRecord(
        String firstName,
        String lastName,
        int age,
        String email,
        LocalDate createDate,
        LocalDate graduationDate,
        boolean isBlocked
) {
}
