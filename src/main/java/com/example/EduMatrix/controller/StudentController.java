package com.example.EduMatrix.controller;

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

    @GetMapping("/searchById{id}")
    public ResponseEntity<Optional<Student>> getStudent(@PathVariable Long id) {
        Optional<Student> student = studentService.getStudentById(id);
        if(student == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(student);
    }
    @PostMapping("/addStudent")
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        Student addedStudent = studentService.addStudent(student);
        return ResponseEntity.ok(addedStudent);
    }
    @PutMapping("/updateStudent/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id , @RequestBody Student student) {
        if (student.getIdStudent() == null) {
            return ResponseEntity.badRequest().build();
        }
        Optional<Student> existingStudent = studentService.getStudentById(student.getIdStudent());
        if (existingStudent.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        Student updatedStudent = studentService.updateStudent(id, student);
        return ResponseEntity.ok(updatedStudent);
    }
    @DeleteMapping("/deleteStudent/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }

}
