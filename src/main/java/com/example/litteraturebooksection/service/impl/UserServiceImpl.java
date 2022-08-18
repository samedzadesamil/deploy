package com.example.litteraturebooksection.service.impl;

import com.example.litteraturebooksection.model.dto.UsersDto;
import com.example.litteraturebooksection.model.entity.Users;
import com.example.litteraturebooksection.repository.UsersRepository;
import com.example.litteraturebooksection.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UsersRepository usersRepository;


    @Override
    public UsersDto getById(long id) {
        Users users = usersRepository.findById(id);
        return UsersDto.builder()
             //   .dateOfBirds(users.getDateOfBirds())
                .email(users.getEmail())
                .location(users.getLocation())
                .name(users.getName())
                .number(users.getNumber())
                .surname(users.getSurname())
                .build();
    }

    @Override
    public UsersDto getByNameAndSurname(String name, String surname) {
        Users users = usersRepository.findByNameAndSurname(name, surname);
        return UsersDto.builder()
              //  .dateOfBirds(users.getDateOfBirds())
                .email(users.getEmail())
                .location(users.getLocation())
                .name(users.getName())
                .number(users.getNumber())
                .surname(users.getSurname())
                .build();

    }

    @Override
    public UsersDto getByEmail(String email) {
        Users users = usersRepository.findByEmail(email);
        return UsersDto.builder()
             //   .dateOfBirds(users.getDateOfBirds())
                .email(users.getEmail())
                .location(users.getLocation())
                .name(users.getName())
                .number(users.getNumber())
                .surname(users.getSurname())
                .build();
    }

    @Override
    public UsersDto getByUsernameAndPassword(String username, String password) {
        Users users = usersRepository.findByUsernameAndPassword(username, password);
        UsersDto usersDto = null;

        if (users != null) {
            usersDto = UsersDto.builder()
                    //.dateOfBirds(users.getDateOfBirds())
                    .email(users.getEmail())
                    .location(users.getLocation())
                    .name(users.getName())
                    .number(users.getNumber())
                    .surname(users.getSurname())
                    .username(users.getUsername())
                    .build();
        }

        return usersDto;

    }

    @Override
    public boolean existUserControl(String usrname) {
        return usersRepository.existsUsersByUsername(usrname);
    }

    @Override
    public String registrationUser(Users user) {
        System.out.println(user.getUsername());
        if (existUserControl(user.getUsername())) {
            return "Bu istifadəçi adı artığ mövcuddur";
        } else {
            usersRepository.save(user);
            return "Qeydiyyatdan uğurla keçdiniz!";
        }
    }

    @Override
    public String loginUser(String username, String password) {
        UsersDto usersDto = getByUsernameAndPassword(username, password);

        if (usersDto != null) {
            return usersDto.toString();
        } else {
            return "istifadəçi adı vəya şifrə səhvdir";
        }
    }
}
