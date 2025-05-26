package com.example.EduMatrix.model;


    // User.java (base for Student, Teacher, Admin, Reception

import com.example.EduMatrix.enumclass.UserRole;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class User {
        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        private Long id;

        @Column(name = "username")
        private String username;

        @Column(name = "password")
        private String password;

        @Column(name = "userrole")
        @Enumerated(EnumType.STRING)
        private UserRole userrole;  // STUDENT, TEACHER, ADMIN, RECEPTION

        @OneToOne(mappedBy = "user")
        private Student student;

        @OneToOne(mappedBy = "user")
        private Teacher teacher;

        @OneToOne(mappedBy = "user")
        private  Admin admin;

        @OneToOne(mappedBy = "user")
        private Reception reception;


    }


