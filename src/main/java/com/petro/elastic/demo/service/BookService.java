package com.petro.elastic.demo.service;

import com.petro.elastic.demo.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface BookService {
    Book createBook(Book book);
    List<Book> getBooksByTitle(String title);
    Book getBook(String id);
    Iterable<Book> getAllBooks();
    Page<Book> getBookByAuthor(String author, PageRequest pageRequest);
    Book updateBook(String id, Book book);
    void deleteBook(Book book);

}
