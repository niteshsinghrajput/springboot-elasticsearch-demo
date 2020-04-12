package com.petro.elastic.demo.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "book", type = "programming")
@Data
public class Book {

    @Id
    private String bookId;
    private String title;
    private String author;
}
