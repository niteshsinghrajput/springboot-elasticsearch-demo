package com.petro.elastic.demo.repository;

import com.petro.elastic.demo.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface BookRepository extends ElasticsearchRepository<Book,String> {
    Page<Book> findByAuthor(String author, Pageable pageable);
    List<Book> findByTitle(String title);
    Book findByBookId(String id);
}
