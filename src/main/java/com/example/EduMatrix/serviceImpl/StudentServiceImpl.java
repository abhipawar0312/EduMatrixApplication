package com.example.EduMatrix.serviceImpl;

import com.example.EduMatrix.dto.StudentRegistrationDTO;
import com.example.EduMatrix.enumclass.UserRole;
import com.example.EduMatrix.model.Student;
import com.example.EduMatrix.model.User;
import com.example.EduMatrix.repository.StudentRepository;
import com.example.EduMatrix.repository.UserRepository;
import com.example.EduMatrix.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getStudentById(Long idStudent) {
        Optional<Student> student = studentRepository.findById(idStudent);
        return studentRepository.findById(idStudent);
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

    @Override
    public Student registerStudent(StudentRegistrationDTO dto) {
        return null;
    }


}
