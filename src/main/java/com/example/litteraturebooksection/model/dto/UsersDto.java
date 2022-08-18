package com.example.litteraturebooksection.model.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsersDto {
    private String name;
    private String surname;
    private String username;
   // private Date dateOfBirds;
    private String email;
    private String number;
    private String location;
}
