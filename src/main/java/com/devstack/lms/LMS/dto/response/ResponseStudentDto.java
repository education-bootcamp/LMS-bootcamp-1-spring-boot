package com.devstack.lms.LMS.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseStudentDto {
    private String id;
    private String name;
    private String address;
    private String contact;
}
