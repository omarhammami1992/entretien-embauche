package com.neosoft.test1.library.port;

import com.neosoft.test1.library.entity.Book;

import java.util.List;

public interface BookRepository {
    List<Book> findByAuthorEmail(String authorEmail);
}
