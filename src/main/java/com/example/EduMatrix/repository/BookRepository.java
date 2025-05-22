package com.example.EduMatrix.repository;

import com.example.EduMatrix.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
