package com.example.EduMatrix.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity

public class Reception {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String email;
    private String username;
    private String password;
    private String phoneNumber;
    private String address;
    private String standerd;
    private String board;

    @OneToOne
    @JoinColumn(name="user_id")
    private User user;



}
