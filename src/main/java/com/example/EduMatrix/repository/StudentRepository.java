package com.example.EduMatrix.repository;

import com.example.EduMatrix.model.Student;
import com.example.EduMatrix.service.StudentService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {


}
