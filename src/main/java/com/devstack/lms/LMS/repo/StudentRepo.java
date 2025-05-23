package com.devstack.lms.LMS.repo;

import com.devstack.lms.LMS.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo
        extends JpaRepository<Student, String> {
}
