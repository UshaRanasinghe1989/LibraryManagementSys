package edu.icet.demo.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.demo.entity.BookEntity;
import edu.icet.demo.model.Book;
import edu.icet.demo.repository.BookRepository;
import edu.icet.demo.repository.jpa.BookJpaRepository;
import edu.icet.demo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository repository;
    private final BookJpaRepository jpaRepository;
    private final ObjectMapper mapper;

    @Override
    public Book persist(Book book) {
        BookEntity entity = jpaRepository.save(mapper.convertValue(book, BookEntity.class));
        return mapper.convertValue(entity, Book.class);
    }

    @Override
    public List<Book> retrieve() {
        Iterable<BookEntity> all = jpaRepository.findAll();

        List<Book> bookList = new ArrayList<>();
        for (BookEntity entity:all){
            bookList.add(mapper.convertValue(entity, Book.class));
        }
        return bookList;
    }

    @Override
    public Book update(Book book) {
        BookEntity updated = null;
        if (jpaRepository.findById(book.getId()).isPresent()){
            updated = jpaRepository.save(mapper.convertValue(book, BookEntity.class));
        }
        return mapper.convertValue(updated, Book.class);
    }

    @Override
    public void delete(Book book) {
        jpaRepository.delete(mapper.convertValue(book, BookEntity.class));
    }

    @Override
    public Book findByName(String name) {
        BookEntity bookEntity = jpaRepository.findByName(name);
        return mapper.convertValue(bookEntity, Book.class);
    }
}
