package com.example.EduMatrix.serviceImpl;

import com.example.EduMatrix.dto.StudentRegistrationDTO;
import com.example.EduMatrix.enumclass.UserRole;
import com.example.EduMatrix.model.Student;
import com.example.EduMatrix.model.User;
import com.example.EduMatrix.repository.StudentRepository;
import com.example.EduMatrix.repository.UserRepository;
import com.example.EduMatrix.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class registrationServiceImpl implements RegistrationService {


    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private StudentRepository studentRepository;

    public Student registerStudent(StudentRegistrationDTO dto) {
        if (!dto.getPassword().equals(dto.getConfpassword())) {
            throw new IllegalArgumentException("Passwords do not match");
        }

        User user = new User();
        user.setUsername(dto.getUsername());
        user.setPassword(passwordEncoder.encode(dto.getPassword()));
        user.setUserrole(UserRole.STUDENT);

        Student student = new Student();
        student.setFirstName(dto.getFirstName());
        student.setLastName(dto.getLastName());
        student.setEmail(dto.getEmail());
        student.setPhoneNumber(dto.getPhoneNumber());
        student.setAddress(dto.getAddress());
        student.setStandard(dto.getStandard());

        student.setUser(user);
        user.setStudent(student);

        userRepository.save(user);
        return student;
    }




}
