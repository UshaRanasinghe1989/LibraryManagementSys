package edu.icet.demo.service.impl;

import edu.icet.demo.model.Book;
import edu.icet.demo.repository.BookRepository;
import edu.icet.demo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository repository;

    @Override
    public void persist(Book book) {

    }
}
