package com.example.EduMatrix.repository;

import com.example.EduMatrix.model.ExamMark;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExamMarkRepository extends JpaRepository<ExamMark, Long> {
        List<ExamMark> findByStudentId(Long studentId);
}
