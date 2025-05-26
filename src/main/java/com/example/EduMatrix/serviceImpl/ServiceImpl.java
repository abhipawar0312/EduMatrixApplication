package com.example.EduMatrix.serviceImpl;

import com.example.EduMatrix.model.Student;
import com.example.EduMatrix.repository.StudentRepository;
import com.example.EduMatrix.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;


    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getStudentById(Long studentid) {
        Optional<Student> student = studentRepository.findById(studentid);
        return studentRepository.findById(studentid);
    }

    @Override
    public Student addStudent(Student student) {
        if (student != null) {
            return studentRepository.save(student);
        } else {
            throw new IllegalArgumentException("Student cannot be null");
        }

    }

    @Override
    public Student updateStudent(Long id, Student student) {
        Optional<Student> existingStudent = studentRepository.findById(id);
        if (existingStudent.isPresent()) {
            Student updatedStudent = existingStudent.get();
            updatedStudent.setFirstName(student.getFirstName());
            updatedStudent.setEmail(student.getEmail());
            updatedStudent.setPhoneNumber(student.getPhoneNumber());
            updatedStudent.setStandard((student.getStandard()));

            return studentRepository.save(updatedStudent);
        } else {
            throw new IllegalArgumentException("Student with ID " + id + " does not exist");
        }
    }

    @Override
    public void deleteStudent(Long id) {
        Optional<Student> student = studentRepository.findById(id);
        if (student.isPresent()) {
            studentRepository.delete(student.get());
        } else {
            throw new IllegalArgumentException("Student with ID " + id + " does not exist");
        }

    }










}
