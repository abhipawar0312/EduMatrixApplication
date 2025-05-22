package com.example.EduMatrix.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Admin extends  User{
    private String fullName;
    private String email;
}
