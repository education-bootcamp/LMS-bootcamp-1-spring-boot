package com.devstack.lms.LMS.api;

import com.devstack.lms.LMS.dto.request.RequestStudentDto;
import com.devstack.lms.LMS.service.StudentService;
import com.devstack.lms.LMS.util.StandardResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// http://localhost:9090/api/v1/students
@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;


    @PostMapping // create -> save
    public ResponseEntity<StandardResponseDto> createStudent(
            @RequestBody RequestStudentDto requestStudentDto
    ) {
        studentService.createStudent(requestStudentDto);
        return new ResponseEntity<>(
                new StandardResponseDto(201,"Student Created", null),
                HttpStatus.CREATED
        );
    }

    @GetMapping // load -> get data
    public ResponseEntity<StandardResponseDto> loadAllStudents() {

        return new ResponseEntity<>(
                new StandardResponseDto(200,"all students",
                        studentService.loadAllStudents()),
                HttpStatus.OK
        );
    }

    // http://localhost:9090/api/v1/students/hjdsafewfkjhdshfkshdf -> String -> not recommended
    @GetMapping("/{id}") // load -> get data
    public ResponseEntity<StandardResponseDto> findById(
            @PathVariable String id
    ) {

        return new ResponseEntity<>(
                new StandardResponseDto(200,"Student Data",
                        studentService.findById(id)),
                HttpStatus.OK
        );
    }

    @DeleteMapping("/{id}") // load -> get data
    public ResponseEntity<StandardResponseDto> deleteById(
            @PathVariable String id
    ) {
        studentService.deleteById(id);
        return new ResponseEntity<>(
                new StandardResponseDto(204,"Student Deleted",
                        null),
                HttpStatus.NO_CONTENT
        );
    }
}
