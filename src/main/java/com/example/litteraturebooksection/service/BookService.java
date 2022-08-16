package com.example.litteraturebooksection.service;

import com.example.litteraturebooksection.model.dto.BookDto;
import com.example.litteraturebooksection.model.entity.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface BookService {
      ArrayList<BookDto> booksCatalogForLangAndGenre(Enum lang, Enum genre);
      ArrayList<BookDto> booksForSale();
      ArrayList<BookDto> newBooks();
      ArrayList<BookDto> searchForName(String name);
      ArrayList<BookDto> searchForAuthor(String author);
      ArrayList<BookDto> searchForPublishingHouse(String publishingHouse);
      BookDto searchForId(long id);

}
