package com.example.EduMatrix.model;


import com.example.EduMatrix.enumclass.SubjectType;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class ExamMark{

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    private SubjectType subjectType;

    private LocalDate examDate;
    private int marks;

    private LocalTime examTime;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;





}
