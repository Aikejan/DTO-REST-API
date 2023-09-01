package java10.api;

import java10.dto.SimpleResponse;
import java10.dto.StudentRequest;
import java10.dto.StudentRequestRecord;
import java10.dto.StudentResponse;
import java10.service.StudentService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor


public class StudentApi {

    private final StudentService studentService;




    @GetMapping
    public List<StudentResponse> getAllStudents() {
        return studentService.getAllStudents();

    }


    @PostMapping
    public SimpleResponse saveStudent(@RequestBody StudentRequestRecord studentRequestRecord) {
        return studentService.saveStudent(studentRequestRecord);

    }

    @GetMapping("/{studentId}")
    public StudentResponse getById(@PathVariable Long studentId) {
        return studentService.getStudentById(studentId);
    }

    @PutMapping("/{studentId}")
    public SimpleResponse updateStudent(@PathVariable Long studentId,
                                        @RequestBody StudentRequest studentRequest) {
        return studentService.updateStudent(studentId, studentRequest);
    }


    @DeleteMapping("/{studentId}")
    public SimpleResponse deleteStudent(@PathVariable Long studentId) {
        return studentService.deleteStudent(studentId);
    }
}
