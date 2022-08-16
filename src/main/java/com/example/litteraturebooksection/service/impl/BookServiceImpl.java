package com.example.litteraturebooksection.service.impl;

import com.example.litteraturebooksection.model.dto.BookDto;
import com.example.litteraturebooksection.model.entity.Book;
import com.example.litteraturebooksection.repository.BookRepository;
import com.example.litteraturebooksection.service.BookService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Locale;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public ArrayList<BookDto> booksCatalogForLangAndGenre(Enum lang, Enum genre) {
        ArrayList<Book> bookArrayList = bookRepository.getBooksByLanguageAndGenre(lang, genre);
        ArrayList<BookDto> bookDtoArrayList = new ArrayList<>();
        for (int i = 0; i < bookArrayList.size(); i++) {
            BookDto bookDto = BookDto.builder().name(bookArrayList.get(i).getName())
                    .author(bookArrayList.get(i).getAuthor())
                    .page(bookArrayList.get(i).getPage())
                    .genre(bookArrayList.get(i).getGenre())
                    .publishingHouse(bookArrayList.get(i).getPublishingHouse())
                    .language(bookArrayList.get(i).getLanguage())
                    .price(bookArrayList.get(i).getPrice())
                    .about(bookArrayList.get(i).getAbout()).build();
            bookDtoArrayList.add(bookDto);
        }
        return bookDtoArrayList;
    }

    @Override
    public ArrayList<BookDto> booksForSale() {
        ArrayList<Book> bookArrayList = bookRepository.getBooksBySalesPriceIsNotNull();
        System.out.println(bookArrayList);
        ArrayList<BookDto> bookDtoArrayList = new ArrayList<>();
        for (int i = 0; i < bookArrayList.size(); i++) {
            BookDto bookDto = BookDto.builder().name(bookArrayList.get(i).getName())
                    .author(bookArrayList.get(i).getAuthor())
                    .page(bookArrayList.get(i).getPage())
                    .genre(bookArrayList.get(i).getGenre())
                    .publishingHouse(bookArrayList.get(i).getPublishingHouse())
                    .language(bookArrayList.get(i).getLanguage())
                    .price(bookArrayList.get(i).getPrice())
                    .about(bookArrayList.get(i).getAbout()).build();
            bookDtoArrayList.add(bookDto);
        }
        return bookDtoArrayList;
    }

    @Override
    public ArrayList<BookDto> newBooks() {
        // aya gore db'dan kitablari alib ayi mueyyen elemeliyik localdatetime'dan
        LocalDateTime localDateTime= LocalDateTime.now();
        ArrayList<Book> bookArrayList= bookRepository.getBooksByAddingTimeBetween(localDateTime.minusMonths(1),localDateTime);
        ArrayList<BookDto> bookDtoArrayList = new ArrayList<>();
        for (int i = 0; i < bookArrayList.size(); i++) {
            BookDto bookDto = BookDto.builder().name(bookArrayList.get(i).getName())
                    .author(bookArrayList.get(i).getAuthor())
                    .page(bookArrayList.get(i).getPage())
                    .genre(bookArrayList.get(i).getGenre())
                    .publishingHouse(bookArrayList.get(i).getPublishingHouse())
                    .language(bookArrayList.get(i).getLanguage())
                    .price(bookArrayList.get(i).getPrice())
                    .about(bookArrayList.get(i).getAbout()).build();
            bookDtoArrayList.add(bookDto);
        }
   return bookDtoArrayList;
    }

    @Override
    public ArrayList<BookDto> searchForName(String name) {
        String smth1= name.toUpperCase(Locale.ROOT);
        ArrayList<Book> bookArrayList= bookRepository.getBooksByNameIsContaining(smth1);
        ArrayList<BookDto> bookDtoArrayList = new ArrayList<>();
        for (int i = 0; i < bookArrayList.size(); i++) {
            BookDto bookDto = BookDto.builder().name(bookArrayList.get(i).getName())
                    .author(bookArrayList.get(i).getAuthor())
                    .page(bookArrayList.get(i).getPage())
                    .genre(bookArrayList.get(i).getGenre())
                    .publishingHouse(bookArrayList.get(i).getPublishingHouse())
                    .language(bookArrayList.get(i).getLanguage())
                    .price(bookArrayList.get(i).getPrice())
                    .about(bookArrayList.get(i).getAbout()).build();
            bookDtoArrayList.add(bookDto);
        }
        return bookDtoArrayList;
    }

    @Override
    public ArrayList<BookDto> searchForAuthor(String author) {
        String smth1= author.toUpperCase(Locale.ROOT);
        ArrayList<Book> bookArrayList= bookRepository.getBooksByAuthorIsContaining(smth1);
        ArrayList<BookDto> bookDtoArrayList = new ArrayList<>();
        for (int i = 0; i < bookArrayList.size(); i++) {
            BookDto bookDto = BookDto.builder().name(bookArrayList.get(i).getName())
                    .author(bookArrayList.get(i).getAuthor())
                    .page(bookArrayList.get(i).getPage())
                    .genre(bookArrayList.get(i).getGenre())
                    .publishingHouse(bookArrayList.get(i).getPublishingHouse())
                    .language(bookArrayList.get(i).getLanguage())
                    .price(bookArrayList.get(i).getPrice())
                    .about(bookArrayList.get(i).getAbout()).build();
            bookDtoArrayList.add(bookDto);
        }
        return bookDtoArrayList;
    }

    @Override
    public ArrayList<BookDto> searchForPublishingHouse(String publishingHouse) {
        String smth1= publishingHouse.toUpperCase(Locale.ROOT);
        ArrayList<Book> bookArrayList= bookRepository.getBooksByPublishingHouseIsContaining(smth1);
        ArrayList<BookDto> bookDtoArrayList = new ArrayList<>();
        for (int i = 0; i < bookArrayList.size(); i++) {
            BookDto bookDto = BookDto.builder().name(bookArrayList.get(i).getName())
                    .author(bookArrayList.get(i).getAuthor())
                    .page(bookArrayList.get(i).getPage())
                    .genre(bookArrayList.get(i).getGenre())
                    .publishingHouse(bookArrayList.get(i).getPublishingHouse())
                    .language(bookArrayList.get(i).getLanguage())
                    .price(bookArrayList.get(i).getPrice())
                    .about(bookArrayList.get(i).getAbout()).build();
            bookDtoArrayList.add(bookDto);
        }
        return bookDtoArrayList;    }

    @Override
    public BookDto searchForId(long id) {
        Book book=bookRepository.getBookById(id);
        BookDto bookDto=BookDto.builder()
                .name(book.getName())
                .author(book.getAuthor())
                .page(book.getPage())
                .genre(book.getGenre())
                .publishingHouse(book.getPublishingHouse())
                .language(book.getLanguage())
                .price(book.getPrice())
                .about(book.getAbout())
                .build();
        return bookDto;
    }
}
