package com.example.litteraturebooksection.model.dto;

import com.example.litteraturebooksection.model.EGenres;
import com.example.litteraturebooksection.model.ELanguage;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
    private String name;
    private String author;
    private Long page;
    private EGenres genre;
    private String publishingHouse;
    private ELanguage language;
    private Double price;
    private String about;


    @Override
    public String toString() {
        return "BookDto{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", page=" + page +
                ", genre=" + genre +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", language=" + language +
                ", price=" + price +
                ", about='" + about + '\'' +
                '}';
    }
}

