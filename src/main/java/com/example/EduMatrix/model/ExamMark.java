package com.example.EduMatrix.model;


import com.example.EduMatrix.enumclass.ExamType;
import com.example.EduMatrix.enumclass.SubjectType;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
public class ExamMark{

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    private SubjectType subjectType;

    private ExamType examType;

    private LocalDate examDate;

    private int marks;

    private LocalTime examTime;

    @ManyToOne
    @JoinColumn(name = "id_student", nullable = false)
    private Student student;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SubjectType getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(SubjectType subjectType) {
        this.subjectType = subjectType;
    }

    public LocalDate getExamDate() {
        return examDate;
    }

    public void setExamDate(LocalDate examDate) {
        this.examDate = examDate;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public LocalTime getExamTime() {
        return examTime;
    }

    public void setExamTime(LocalTime examTime) {
        this.examTime = examTime;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setSubject(SubjectType subject) {
        this.subjectType = subject;
    }

    public void setScore(Integer score) {
        if (score != null) {
            this.marks = score.intValue();
        } else {
            this.marks = 0; // Default value if score is null
        }
    }
}
