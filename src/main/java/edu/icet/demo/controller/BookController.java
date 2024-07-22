package edu.icet.demo.controller;

import edu.icet.demo.model.Book;
import edu.icet.demo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/book")
public class BookController {
    private final BookService service;

    @PostMapping("/")
    void persist(@RequestBody Book book){

    }
}
