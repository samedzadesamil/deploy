package com.example.litteraturebooksection.model.entity;

import com.example.litteraturebooksection.model.EGenres;
import com.example.litteraturebooksection.model.ELanguage;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
@Builder
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "book_info")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "book_name", nullable = false, length = 100)
    private String name;

    @Column(name = "book_author", nullable = false, length = 100)
    private String author;

    @Column(name = "book_page", length = 10)
    private Long page;

    @Enumerated(EnumType.STRING)
    @Column(name = "book_genre",nullable = false, length = 50)
    private EGenres genre;

    @Column(name = "publishing_House", length = 100)
    private String publishingHouse;

    @Enumerated(EnumType.STRING)
    @Column(name = "book_language", nullable = false, length = 10)
    private ELanguage language;

    @Column(name = "book_price", nullable = false, length = 10)
    private Double price;

    @Column(name = "book_adding_Time")
    private LocalDateTime addingTime;

    @Column(name="sales_price",length = 10)
    private Double salesPrice;

    @Column(name="book_about")
    private String about;

    @Column(name="book_count",nullable = false)
    private Long bookCount;

    @Column(name="book_exist")
    private boolean bookExist;


}

