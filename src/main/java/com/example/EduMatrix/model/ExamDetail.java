package com.example.EduMatrix.model;

import com.example.EduMatrix.enumclass.ExamType;
import com.example.EduMatrix.enumclass.SubjectType;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
public class ExamDetail {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    private SubjectType subjectType;
    private ExamType examType;
    private int mark;
    private LocalDate examDate;
    private LocalTime examTime;



}
