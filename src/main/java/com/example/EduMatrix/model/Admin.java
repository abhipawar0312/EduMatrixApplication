package com.example.EduMatrix.model;

import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
public class Admin{

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long idAdmin;



    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "password")
    private String password;

    @Column(name = "confpassword")
    private String confpassword;

    private boolean enabled;


    @OneToOne
    @JoinColumn(name="user_id")
    private User user;


}
