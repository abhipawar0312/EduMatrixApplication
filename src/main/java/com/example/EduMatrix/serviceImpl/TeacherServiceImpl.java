package com.example.EduMatrix.serviceImpl;

import com.example.EduMatrix.repository.TeacherRepository;
import com.example.EduMatrix.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherRepository teacherRepository;



}
