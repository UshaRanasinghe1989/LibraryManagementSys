package edu.icet.demo.service;

import edu.icet.demo.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    Book persist(Book book);

    List<Book> retrieve();

    Book update(Book book);

    void delete(Book book);

    Book findByName(String name);
}
