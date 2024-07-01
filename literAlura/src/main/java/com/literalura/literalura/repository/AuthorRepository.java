package com.literalura.literalura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.literalura.literalura.model.Author;



@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}