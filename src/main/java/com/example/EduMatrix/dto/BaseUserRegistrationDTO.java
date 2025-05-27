package com.example.EduMatrix.dto;

import lombok.Data;

@Data
public class BaseUserRegistrationDTO {
    private String username;
    private String password;
    private String confpassword;

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;
    private String email;
}
