package com.example.litteraturebooksection.controller;

import com.example.litteraturebooksection.model.EGenres;
import com.example.litteraturebooksection.model.ELanguage;
import com.example.litteraturebooksection.model.dto.BookDto;
import com.example.litteraturebooksection.model.entity.Book;
import com.example.litteraturebooksection.service.impl.BookServiceImpl;
import lombok.Builder;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/menu")
public class BookMenuController {

    private final BookServiceImpl bookService;
    public BookMenuController(BookServiceImpl bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/azerbaijan/romantic")
    public ArrayList<BookDto> getAzerbaijaniRomanticBooks() {
        return bookService.booksCatalogForLangAndGenre(ELanguage.AZERBAIJAN, EGenres.ROMANTIC);

    }

  @GetMapping("/azerbaijan/science")
   public ArrayList<BookDto> getAzerbaijaniScienceBooks() {
        return bookService.booksCatalogForLangAndGenre(ELanguage.AZERBAIJAN, EGenres.SCIENCE);

    }
    @GetMapping("/azerbaijani/classics")
    public ArrayList<BookDto> getAzerbaijaniClassicBooks() {
        return bookService.booksCatalogForLangAndGenre(ELanguage.AZERBAIJAN, EGenres.CLASSICS);
    }

    @GetMapping("/azerbaijani/roman")
    public ArrayList<BookDto> getAzerbaijaniRomanBooks() {
        return bookService.booksCatalogForLangAndGenre(ELanguage.AZERBAIJAN, EGenres.ROMANS);

    }

    @GetMapping("/azerbaijani/motivation")
    public ArrayList<BookDto> getAzerbaijaniMotivationBooks() {
        return bookService.booksCatalogForLangAndGenre(ELanguage.AZERBAIJAN, EGenres.MOTIVATION);
    }

// -------------------------------------------------------------------

    @GetMapping("/english/romantic")
    public ArrayList<BookDto> getEnglishRomanticBooks() {
        return bookService.booksCatalogForLangAndGenre(ELanguage.ENGLISH, EGenres.ROMANTIC);    }

    @GetMapping("/english/science")
    public ArrayList<BookDto> getEnglishScienceBooks() {
        return bookService.booksCatalogForLangAndGenre(ELanguage.ENGLISH, EGenres.SCIENCE);    }

    @GetMapping("/english/classics")
    public ArrayList<BookDto> getEnglishClassicBooks() {
        return bookService.booksCatalogForLangAndGenre(ELanguage.ENGLISH, EGenres.CLASSICS);    }

    @GetMapping("/english/roman")
    public ArrayList<BookDto> getEnglishRomanBooks() {
        return bookService.booksCatalogForLangAndGenre(ELanguage.ENGLISH, EGenres.ROMANS);    }

    @GetMapping("/english/motivation")
    public ArrayList<BookDto> getEnglishMotivationBooks() {
        return bookService.booksCatalogForLangAndGenre(ELanguage.ENGLISH, EGenres.MOTIVATION);    }


// -------------------------------------------------------------------


    @GetMapping("/turkish/romantic")
    public ArrayList<BookDto> getTurkishRomanticBooks() {
        return bookService.booksCatalogForLangAndGenre(ELanguage.TURKISH, EGenres.ROMANTIC);    }

    @GetMapping("/turkish/science")
    public ArrayList<BookDto> getTurkishScienceBooks() {
        return bookService.booksCatalogForLangAndGenre(ELanguage.TURKISH, EGenres.SCIENCE);    }

    @GetMapping("/turkish/classics")
    public ArrayList<BookDto> getTurkishClassicBooks() {
        return bookService.booksCatalogForLangAndGenre(ELanguage.TURKISH, EGenres.CLASSICS);    }

    @GetMapping("/turkish/roman")
    public ArrayList<BookDto> getTurkishRomanBooks() {
        return bookService.booksCatalogForLangAndGenre(ELanguage.TURKISH, EGenres.ROMANS);
    }

    @GetMapping("/turkish/motivation")
    public ArrayList<BookDto> getTurkishMotivationBooks() {
        return bookService.booksCatalogForLangAndGenre(ELanguage.TURKISH, EGenres.MOTIVATION);    }

// -------------------------------------------------------------------


    @GetMapping("/russian/romantic")
    public ArrayList<BookDto> getRussianRomanticBooks() {
        return bookService.booksCatalogForLangAndGenre(ELanguage.RUSSIAN, EGenres.ROMANTIC);    }

    @GetMapping("/russian/science")
    public ArrayList<BookDto> getRussianScienceBooks() {
        return bookService.booksCatalogForLangAndGenre(ELanguage.RUSSIAN, EGenres.SCIENCE);    }

    @GetMapping("/russian/classics")
    public ArrayList<BookDto> getRussianClassicBooks() {
        return bookService.booksCatalogForLangAndGenre(ELanguage.RUSSIAN, EGenres.CLASSICS);    }

    @GetMapping("/russian/roman")
    public ArrayList<BookDto> getRussianRomanBooks() {
        return bookService.booksCatalogForLangAndGenre(ELanguage.RUSSIAN, EGenres.ROMANS);    }

    @GetMapping("/russian/motivation")
    public ArrayList<BookDto> getRussianMotivationBooks() {
        return bookService.booksCatalogForLangAndGenre(ELanguage.RUSSIAN, EGenres.MOTIVATION);
    }


    //--------------------------------------------------------------------------------------------------

    @GetMapping("/salesbooks")
    public ArrayList<BookDto> getSalesBooks() {
        return bookService.booksForSale();
    }

    //---------------------------------------------------------------------------------------------------


    @GetMapping("/newbooks")
    public ArrayList<BookDto> getMonthsNewBooks() {
        return bookService.newBooks();    }

//-----------------------------------------------------------------------------------------------------------

    @GetMapping("/searchname/{name}")
    public ArrayList<BookDto> searchBookName(@PathVariable(name = "name") String name) {
          return bookService.searchForName(name);    }

    @GetMapping("/search/{author}")
    public ArrayList<BookDto> searchBookAuthor(@PathVariable(name = "author") String author) {
        return bookService.searchForAuthor(author);    }

    @GetMapping("/search/{house}")
    public ArrayList<BookDto> searchBookPublishingHouse(@PathVariable(name = "house") String house) {
        return bookService.searchForPublishingHouse(house);    }

    @GetMapping("/searchId/{id}")
    public BookDto searchBookById(@PathVariable(name = "id") int id){
        return bookService.searchForId(id);
    }
}

