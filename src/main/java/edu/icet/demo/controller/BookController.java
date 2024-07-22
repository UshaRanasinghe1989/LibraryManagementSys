package edu.icet.demo.controller;

import edu.icet.demo.model.Book;
import edu.icet.demo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/book")
public class BookController {
    private final BookService service;

    @PostMapping("/")
    Map<String, Integer> persist(@RequestBody Book book){
        return Collections.singletonMap("Customer count ", service.persist(book));
    }
}
