package com.example.blogging.Author;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {

    public Optional <Author> findAuthorByName(String authorname);
    
}
