package java10.service;

import java10.dto.SimpleResponse;
import java10.dto.StudentRequest;
import java10.dto.StudentRequestRecord;
import java10.dto.StudentResponse;


import java.util.List;
import java.util.Optional;

public interface StudentService {
    SimpleResponse saveStudent(StudentRequestRecord studentRequest);
    List<StudentResponse> getAllStudents();
    StudentResponse getStudentById(Long id);
    SimpleResponse updateStudent(Long id, StudentRequest studentRequest);
    SimpleResponse deleteStudent(Long id);

}
