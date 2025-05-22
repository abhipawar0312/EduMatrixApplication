package com.example.EduMatrix.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Student extends  User{
    private String fullName;
    private String email;

}

