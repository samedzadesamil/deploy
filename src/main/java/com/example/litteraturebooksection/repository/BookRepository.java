package com.example.litteraturebooksection.repository;

import com.example.litteraturebooksection.model.dto.BookDto;
import com.example.litteraturebooksection.model.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
     ArrayList<Book> getBooksByLanguageAndGenre(Enum lang, Enum genre);
     ArrayList<Book> getBooksBySalesPriceIsNotNull();
     ArrayList<Book> getBooksByAddingTimeBetween(LocalDateTime localDateTime, LocalDateTime localDateTim);
     ArrayList<Book> getBooksByNameIsContaining(String smth);
     ArrayList<Book> getBooksByAuthorIsContaining(String smth);
     ArrayList<Book> getBooksByPublishingHouseIsContaining(String smth);
     Book getBookById(Long id);



}
