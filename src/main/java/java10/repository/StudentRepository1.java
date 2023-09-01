package java10.repository;

import java10.dto.StudentResponse;
import java10.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository1 extends JpaRepository<Student, Long> {
    @Query("select  new  java10.dto.SimpleResponse(s.id,s.firstName,s.lastName,s.age,s.email, s.createdDate,s.graduationDate,s.osBlocked) from Student s")
    List<StudentResponse> getAllStudents();

    List<StudentResponse> getStudents();
    @Query("select  new  java10.dto.SimpleResponse(s.id,s.firstName,s.lastName,s.age,s.email, s.createdDate,s.graduationDate,s.osBlocked )from Student  s where  s.id=:id")
    Optional<StudentResponse> getStudentById(Long id);  // QURUEI JAZUU KEREK POLYASIN OZGORTKONYBUZDUN SEBEBINEN REPOZITORI TAANYBAY KALDY
}