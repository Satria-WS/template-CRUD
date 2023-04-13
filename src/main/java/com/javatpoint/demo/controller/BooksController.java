package com.javatpoint.demo.controller;
import java.util.List;
//The Spring framework enables automatic dependency injection. In other words, by declaring all the bean dependencies in a Spring configuration


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.javatpoint.demo.entity.Books;
import com.javatpoint.demo.service.BookService;


//mark class as Controller
@RestController

public class BooksController {

    //autowire the BooksService class
    @Autowired
    BookService bookService;

    //CREATE A GET mapping , retrieves all the books detail from the database
    @GetMapping("/book")
    private List<Books> getAllBooks() {
        return bookService.getAllBooks();
    }

    //creating a get mapping that retrieve only certain data specific book

    @GetMapping("/book/{bookid}")
    private Books getBooks(@PathVariable("bookid") int bookid) {
        return bookService.getBooksById(bookid);
    }

    //create delete mapping to specified book
    @DeleteMapping("/book/{bookid}")
    private void deldeteBook(@PathVariable("bookid") int bookid) {
        bookService.delete(bookid);

    }

    //creating post mapping that post the book detail in the database
    @PostMapping("/books")
    private  int saveBook(@RequestBody Books books) {
        bookService.saveOrUpdate(books);
        return books.getBookid();
    }

    //update put mapping the book detail
    @PutMapping("/books")
    private Books update(@RequestBody Books books) {
        bookService.saveOrUpdate(books);
        return books;
    }
}
