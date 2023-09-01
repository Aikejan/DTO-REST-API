package java10.service.servixeImpl;

import java10.dto.SimpleResponse;
import java10.dto.StudentRequest;
import java10.dto.StudentRequestRecord;
import java10.dto.StudentResponse;
import java10.model.Student;
import java10.repository.StudentRepository1;
import java10.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;


@Service
@Transactional
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository1 studentRepository1;

    @Override
    public SimpleResponse saveStudent(StudentRequestRecord studentRequest) {
        Student student = new Student();
        student.setFirstName(student.getFirstName());
        student.setLastName(student.getLastName());
        student.setAge(student.getAge());
        student.setEmail(student.getEmail());
        student.setCreatedDate(student.getCreatedDate());
        student.setGraduationDate(student.getGraduationDate());
        student.setOsBlocked(false);
        studentRepository1.save(student);
        return SimpleResponse.builder()
                .httpStatus(HttpStatus.OK)
                .message(String.format("Student with id: %s successfully saved", student.getId())).build();

//        new SimpleResponse(
////                HttpStatus.OK,
////                String.format("Student with id: %s successfully saved", student.getId())); return
        

//                student.getFirstName(),
//                student.getLastName(),
//                student.getAge(),
//                student.getEmail(),
//                student.getCreatedDate(),
//                student.getGraduationDate()
//                ));

    }

    @Override
    public List<StudentResponse> getAllStudents() {
        return studentRepository1.getAllStudents();
    }

    @Override
    public StudentResponse getStudentById(Long id) {
        return studentRepository1.getStudentById(id).orElseThrow(() -> new NoSuchElementException(
                "Student with id: " + id + "Is not found"));
    }

    @Override
    public SimpleResponse updateStudent(Long id, StudentRequest studentRequest) {
        Student student1 = studentRepository1.findById(id).orElseThrow(
                () -> new NoSuchElementException("Student with id: " + id + "Is not found"
                ));
        student1.setFirstName(student1.getFirstName());
        student1.setLastName(student1.getLastName());
        student1.setAge(student1.getAge());
        student1.setEmail(student1.getEmail());
        student1.setCreatedDate(student1.getCreatedDate());
        student1.setGraduationDate(student1.getGraduationDate());
        studentRepository1.save(student1);
        return SimpleResponse.builder()
                .httpStatus(HttpStatus.OK)
                .message(String.format("Student with id: %s successfully saved", student1.getId())).build();


//         new StudentResponse(
//                HttpStatus.OK,
//                String.format("Student with id: %s successfully updated", student1.getId()));


//                student1.getId();
//                student1.getFirstName();
//                student1.getLastName();
//                student1.getAge();
//                student1.getEmail();
//                student1.getCreatedDate();
//                student1.getGraduationDate();
//                student1.isOsBlocked());
    }

    @Override
    public SimpleResponse deleteStudent(Long id) {
        if (!studentRepository1.existsById(id)) {
            throw new NoSuchElementException("Student with id: " + id + "is not found");
        }
        studentRepository1.deleteById(id);
        return new SimpleResponse(HttpStatus.OK,
                "Student with id: " + id + "is deleted");
    }
}
