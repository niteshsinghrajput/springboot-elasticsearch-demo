package com.petro.elastic.demo.controller;

import com.petro.elastic.demo.model.Book;
import com.petro.elastic.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping("books")
    public List<Book> getBooks(){
        List<Book> books = new ArrayList<>();
        Iterator<Book> it = service.getAllBooks().iterator();
        while(it.hasNext()){
            books.add(it.next());
        }
        return books;
    }

    @GetMapping("books/{id}")
    public Book getBookById(@PathVariable("id") String id){
        return service.getBook(id);
    }


    @PostMapping("books")
    public Book createBook(@RequestBody Book book){
        return service.createBook(book);
    }

    @PutMapping("books/{id}")
    public Book updateBook(@PathVariable("id") String id, @RequestBody Book book){
        return service.updateBook(id, book);
    }

    @DeleteMapping("books")
    public String deleteBook(@RequestBody Book book){
        service.deleteBook(book);
        return "Book has been deleted Successfully";
    }

    @GetMapping("books")
    public List<Book> getBookByTitle(@RequestParam("title")String title){
        return service.getBooksByTitle(title);
    }
}
