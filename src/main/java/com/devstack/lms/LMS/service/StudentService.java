package com.devstack.lms.LMS.service;

import com.devstack.lms.LMS.dto.request.RequestStudentDto;
import com.devstack.lms.LMS.dto.response.ResponseStudentDto;

import java.util.List;

public interface StudentService {
     void createStudent(RequestStudentDto dto);
     List<ResponseStudentDto> loadAllStudents();
}
