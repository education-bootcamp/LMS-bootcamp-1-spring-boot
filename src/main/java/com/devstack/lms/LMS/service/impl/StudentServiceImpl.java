package com.devstack.lms.LMS.service.impl;

import com.devstack.lms.LMS.dto.request.RequestStudentDto;
import com.devstack.lms.LMS.entity.Student;
import com.devstack.lms.LMS.repo.StudentRepo;
import com.devstack.lms.LMS.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepo studentRepo;

    @Override
    public void createStudent(RequestStudentDto dto) {
        studentRepo.save(toStudent(dto));
    }

    private Student toStudent(RequestStudentDto dto){
       return Student.builder()
               .name(dto.getName())
               .contact(dto.getContact())
               .address(dto.getAddress())
               .build();
    }

}
