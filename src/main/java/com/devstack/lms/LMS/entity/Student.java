package com.devstack.lms.LMS.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity(name="student_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "student_name", nullable = false, length = 100)
    private String name;
    @Column(nullable = false)
    private String contact;
    @Column(nullable = false)
    private String address;
}
