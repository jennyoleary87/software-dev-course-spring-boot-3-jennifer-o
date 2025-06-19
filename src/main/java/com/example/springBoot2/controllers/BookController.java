package com.example.springBoot2.controllers;

import com.example.springBoot2.models.Book;
import com.example.springBoot2.repositories.BookRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

//    EXAMPLE FROM LESSON:
//    @GetMapping("/users")
//public List<User> getUsers() {
//  return userRepository.findAll();
//}

    // GET all books
    @GetMapping
    public List<Book> getAllItems() {
        return bookRepository.findAll();
    }

//    EXAMPLE FROM LESSON:
//    @GetMapping("/users/{id}")
//    public User getUser(@PathVariable int id) {
//        return userRepository.findById(id).orElse(null);
//    }

    // GET a specific book by ID
    @GetMapping
    public Book getItem(@PathVariable int id) {
        return bookRepository.findById(id).orElse(null);
    }

//    EXAMPLE FROM LESSON:
//@PostMapping("/users")
//public User createUser(@RequestBody User user) {
//    return userRepository.save(user);
//}

    // POST add a new book
    @PostMapping
    public Book addItem(@RequestBody Book book) {
        return bookRepository.save(book);
    }

//    EXAMPLE FROM LESSON:
//    @PutMapping("/users/{id}")
//    public User updateUser(@PathVariable int id, @RequestBody User user) {
//        user.setId(id);
//        return userRepository.save(user);
//    }

    // PUT update an existing book
    @PutMapping("/{id")
    public Book updateItem(@PathVariable int id, @RequestBody Book book) {
        book.setId(id);
        return bookRepository.save(book);
    }

//    EXAMPLE FROM LESSON:
//    @DeleteMapping("/users/{id}")
//    public void deleteUser(@PathVariable int id) {
//        userRepository.deleteById(id);
//    }

    // DELETE a book
    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable int id) {
        bookRepository.deleteById(id);
    }
}