package edu.icet.demo.controller;

import edu.icet.demo.model.Book;
import edu.icet.demo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/book")
public class BookController {
    private final BookService service;

    @PostMapping()
    Book persist(@RequestBody Book book){
        Book saveBook =Book.builder()
                .name(book.getName())
                .isbn(book.getIsbn())
                .price(book.getPrice())
                .build();
        return service.persist(saveBook);
    }

    @GetMapping()
    List<Book> retrieve(){
        return service.retrieve();
    }
    @PutMapping()
    Book update(@RequestBody Book book){
        return service.update(book);
    }

    @DeleteMapping()
    void delete(@RequestBody Book book){
        service.delete(book);
    }

    @GetMapping("/find-by-name/{name}")
    Book findByName(@PathVariable String name){
        return service.findByName(name);
    }
}
