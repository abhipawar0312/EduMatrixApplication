package com.example.EduMatrix.model;

import com.example.EduMatrix.enumclass.EducationBoardType;
import com.example.EduMatrix.enumclass.ExamType;
import com.example.EduMatrix.enumclass.SubjectType;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStudent; // Unique identifier for the student entity


    @Column(name = "username", unique = true, nullable = false)
    private String username; // Username for login

    @Column(name = "password", nullable = false)
    private String password; // Password for login

    @Column(name = "confpassword", nullable = false)
    private String confpassword; // Confirm password for validation


    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName; // Last name of the student

    @Column(name = "phone_number", unique = true, nullable = false)
    private String phoneNumber; // Contact number for the student

    @Column(name = "address", nullable = false)
    private String address; // Residential address of the student

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "standard", nullable = false)
    private String standard;

    @OneToOne
    @JoinColumn(name="user_id")
    private User user;





}

