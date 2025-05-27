package com.devstack.lms.LMS.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestStudentDto {
    private String name;
    private String address;
    private String contact;
}
