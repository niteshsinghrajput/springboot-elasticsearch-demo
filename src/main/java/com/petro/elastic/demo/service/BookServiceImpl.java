package com.petro.elastic.demo.service;

import com.petro.elastic.demo.model.Book;
import com.petro.elastic.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository repository;


    @Override
    public Book createBook(Book book) {
        return repository.save(book);
    }

    @Override
    public List<Book> getBooksByTitle(String title) {
        return repository.findByTitle(title);
    }

    @Override
    public Book getBook(String id) {
        return repository.findByBookId(id);
    }

    @Override
    public Iterable<Book> getAllBooks() {
        return repository.findAll();
    }

    @Override
    public Page<Book> getBookByAuthor(String author, PageRequest pageRequest) {
        return repository.findByAuthor(author, pageRequest);
    }

    @Override
    public Book updateBook(String id, Book book) {
        return repository.save(book);
    }

    @Override
    public void deleteBook(Book book) {
        repository.delete(book);
    }
}
