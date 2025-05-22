package com.example.EduMatrix.model;


    // User.java (base for Student, Teacher, Admin, Reception

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        private Long id;

        @Column(unique=true)
        private String username;
        private String password;
        private String role;  // STUDENT, TEACHER, ADMIN, RECEPTION


    }


