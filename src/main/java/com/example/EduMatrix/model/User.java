package com.example.EduMatrix.model;

import com.example.EduMatrix.enumclass.UserRole;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "username", unique = true, nullable = false)
        private String username;

        @Column(name = "password", nullable = false)
        private String password;

        @Enumerated(EnumType.STRING)
        @Column(name = "user_role", nullable = false)
        private UserRole userrole;

        @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
        private Student student;

        @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
        private Teacher teacher;

        @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
        private Admin admin;

        @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
        private Reception reception;


}

