package com.example.EduMatrix.controller;

import com.example.EduMatrix.dto.StudentRegistrationDTO;
import com.example.EduMatrix.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("edu-matrix/api/users/register")

public class UserRegistrationController {

    @Autowired
    private RegistrationService registrationService;


    @PostMapping("/student")
    public ResponseEntity<?> registerStudent(@RequestBody StudentRegistrationDTO dto) {
        return ResponseEntity.ok(registrationService.registerStudent(dto));
    }
}
