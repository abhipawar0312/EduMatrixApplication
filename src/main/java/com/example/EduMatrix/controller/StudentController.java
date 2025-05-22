package com.example.EduMatrix.controller;

import com.example.EduMatrix.model.Student;
import com.example.EduMatrix.repository.StudentRepository;
import com.example.EduMatrix.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {   @Autowired
private StudentService studentService;

    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id) {
        Student student = studentService.getStudentById(id);
        if(student == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(student);
    }
}
