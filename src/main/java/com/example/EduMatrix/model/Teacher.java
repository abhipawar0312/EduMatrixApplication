package com.example.EduMatrix.model;

import com.example.EduMatrix.enumclass.TeacherType;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTeacher;


    @Column(name = "first_name")
    private String firstname;
    @Column(name = "last_name")
    private String Lastname;
    @Column(name = "email", unique = true)
    private String email;
    @Column
    private String phone;
    @Column
    private String address;
    @Column
    private String subject;

    @Column
    private String password;
    @Column
    private String confpassword;
    @Column
    private boolean enabled;

    @OneToOne
    @JoinColumn(name="user_id")
    private User user;





}
