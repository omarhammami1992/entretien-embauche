package com.neosoft.test1.library.port;

import com.neosoft.test1.library.entity.Author;

import java.util.Optional;

public interface AuthorRepository {

    void save (Author author);

    Optional<Author> findById(Long id);
}
