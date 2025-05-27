package com.example.EduMatrix.service;

import com.example.EduMatrix.dto.StudentRegistrationDTO;
import com.example.EduMatrix.model.Student;
import org.springframework.stereotype.Service;

@Service
public interface RegistrationService {
    public Student registerStudent(StudentRegistrationDTO dto);

}