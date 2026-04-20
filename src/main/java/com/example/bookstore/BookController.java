package com.example.bookstore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class BookController {

    @Autowired
    private BookRepository repo;

    // Add book
    @PostMapping("/add")
    public Book addBook(@RequestBody Book book) {
        return repo.save(book);
    }
    // Get all books
    @GetMapping("/books")
    public List<Book> getBooks() {
        return repo.findAll();
    }
    // Test API (optional)
    @GetMapping("/test")
    public String test() {
        return "Working";
    }
}