package com.example.EduMatrix.repository;

import com.example.EduMatrix.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
