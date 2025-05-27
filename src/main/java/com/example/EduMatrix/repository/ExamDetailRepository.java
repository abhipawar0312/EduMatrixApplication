package com.example.EduMatrix.repository;

import com.example.EduMatrix.model.ExamDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamDetailRepository extends JpaRepository<ExamDetail, Long> {
    // Custom query methods can be defined here if needed
}
