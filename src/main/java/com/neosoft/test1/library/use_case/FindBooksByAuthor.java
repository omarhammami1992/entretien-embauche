package com.neosoft.test1.library.use_case;

import com.neosoft.test1.library.entity.Author;
import com.neosoft.test1.library.entity.Book;
import com.neosoft.test1.library.port.AuthorRepository;
import com.neosoft.test1.library.port.BookRepository;

import java.util.List;
import java.util.Optional;

public class FindBooksByAuthor {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public FindBooksByAuthor(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    public List<Book> execute(Long id) {
        final Optional<Author> optionalAuthor = authorRepository.findById(id);
        return optionalAuthor.map(author -> bookRepository.findByAuthorEmail(author.getEmail()))
                .orElse(List.of());
    }

}
