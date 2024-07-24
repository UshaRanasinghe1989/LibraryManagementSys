package edu.icet.demo.repository.impl;

import edu.icet.demo.repository.BookRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class BookRepositoryImplTest {
    @Autowired
    BookRepository repository;

    @Test
    void retrieveBookCountTest(){
        Optional<Integer> count = repository.retrieveBookCount();
        Assertions.assertTrue(count.get().intValue() > 0);
    }
}
