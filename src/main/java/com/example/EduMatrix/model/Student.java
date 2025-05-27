package com.example.EduMatrix.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStudent;

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

    @Column(nullable = false)
    private String standard;


    @OneToOne
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private User user;


    public void setUsername(String username) {
        if (user != null) {
            user.setUsername(username);
        }
    }

    public void setPassword(String password) {
        if (user != null) {
            user.setPassword(password);
        }
    }


}
