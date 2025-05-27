package com.example.EduMatrix.service;

import com.example.EduMatrix.dto.BaseUserRegistrationDTO;
import com.example.EduMatrix.dto.StudentRegistrationDTO;
import com.example.EduMatrix.model.Student;

import com.example.EduMatrix.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface StudentService {

    public List<Student> getAllStudents();

    public Optional<Student> getStudentById(Long id);
    public Student addStudent(Student student);
    public Student updateStudent(Long id, Student student);
    public void deleteStudent(Long id);

    public Student registerStudent(StudentRegistrationDTO dto);



}
