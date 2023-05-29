package com.neosoft.test1.library.use_case;

import com.neosoft.test1.library.entity.Author;
import com.neosoft.test1.library.port.AuthorRepository;

public class CreateAuthor {

    private final AuthorRepository authorRepository;

    public CreateAuthor(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public void execute(String firstName, String lastName, String email) {
        final Author author = new Author(firstName, lastName, email);
        authorRepository.save(author);
    }
}
