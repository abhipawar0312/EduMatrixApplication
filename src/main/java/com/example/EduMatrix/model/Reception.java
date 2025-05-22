package com.example.EduMatrix.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Reception extends User{
    private String fullName;
    private String email;

}
