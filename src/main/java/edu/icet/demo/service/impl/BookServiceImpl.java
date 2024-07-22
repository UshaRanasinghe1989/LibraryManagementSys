package edu.icet.demo.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.demo.entity.BookEntity;
import edu.icet.demo.model.Book;
import edu.icet.demo.repository.BookRepository;
import edu.icet.demo.repository.jpa.BookJpaRepository;
import edu.icet.demo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
}
