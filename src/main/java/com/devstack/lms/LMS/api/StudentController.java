package com.devstack.lms.LMS.api;

import com.devstack.lms.LMS.dto.request.RequestStudentDto;
import com.devstack.lms.LMS.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

// http://localhost:9090/api/v1/students
@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;


    @PostMapping // create -> save
    public String createStudent(
            @RequestBody RequestStudentDto requestStudentDto
    ) {
        studentService.createStudent(requestStudentDto);
        return "Student created";
    }

    @GetMapping // load -> get data
    public String loadAllStudents(
            @RequestBody RequestStudentDto requestStudentDto
    ) {
        studentService.createStudent(requestStudentDto);
        return "Student created";
    }
}
