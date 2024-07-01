package com.literalura.literalura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.literalura.literalura.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}