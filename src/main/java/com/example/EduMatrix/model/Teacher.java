package com.example.EduMatrix.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTeacher;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(unique = true, nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String address;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(name = "subject", nullable = false)
    private String subject;

    private String educationBoard;

    private String experience;

    private String qualification;

    private String specialization;

    private String availability;


    @OneToOne
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private User user;
}





