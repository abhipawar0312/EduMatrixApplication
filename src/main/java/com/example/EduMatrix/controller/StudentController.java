package com.example.EduMatrix.controller;

import com.example.EduMatrix.dto.StudentRegistrationDTO;
import com.example.EduMatrix.model.Student;
import com.example.EduMatrix.repository.StudentRepository;
import com.example.EduMatrix.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    StudentRepository studentRepository;;
    @Autowired
    StudentService studentService;

    @GetMapping("/getAll")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/searchById/{idStudent}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long idStudent) {
        Optional<Student> student = studentService.getStudentById(idStudent);
        if (student.isPresent()) {
            return ResponseEntity.ok(student.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/register-student")
    public Student registerStudent(@RequestBody StudentRegistrationDTO dto) {
        return studentService.registerStudent(dto);
    }





}
