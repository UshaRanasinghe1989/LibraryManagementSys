package edu.icet.demo.repository;

import edu.icet.demo.entity.BookEntity;
import edu.icet.demo.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookRepository {
    Optional<Integer> retrieveBookCount();

    BookEntity findByName(String name);
}
