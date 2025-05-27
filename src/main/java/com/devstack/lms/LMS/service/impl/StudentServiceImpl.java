package com.devstack.lms.LMS.service.impl;

import com.devstack.lms.LMS.dto.request.RequestStudentDto;
import com.devstack.lms.LMS.dto.response.ResponseStudentDto;
import com.devstack.lms.LMS.entity.Student;
import com.devstack.lms.LMS.repo.StudentRepo;
import com.devstack.lms.LMS.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepo studentRepo;

    @Override
    public void createStudent(RequestStudentDto dto) {
        studentRepo.save(toStudent(dto));
    }

    @Override
    public List<ResponseStudentDto> loadAllStudents() {
        /*List<Student> all = studentRepo.findAll();
        List<ResponseStudentDto> studentDtos = new ArrayList<>();

        for (Student student : all) {
            studentDtos.add(toResponseStudentDto(student));
        }

        return studentDtos;*/
        return studentRepo.findAll().stream().map(this::toResponseStudentDto).toList();
    }

    private ResponseStudentDto toResponseStudentDto(Student student) {
        if (student == null) {
            return null;
        }
        return ResponseStudentDto.builder()
                .id(student.getId())
                .name(student.getName())
                .address(student.getAddress())
                .contact(student.getContact())
                .build();
    }

    private Student toStudent(RequestStudentDto dto) {
        return Student.builder()
                .name(dto.getName())
                .contact(dto.getContact())
                .address(dto.getAddress())
                .build();
    }

}
