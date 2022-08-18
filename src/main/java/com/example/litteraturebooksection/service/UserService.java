package com.example.litteraturebooksection.service;


import com.example.litteraturebooksection.model.dto.UsersDto;
import com.example.litteraturebooksection.model.entity.Users;
import com.example.litteraturebooksection.repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface UserService {
    public UsersDto getById(long id);

    public UsersDto getByNameAndSurname(String name, String surname);

    public UsersDto getByEmail(String email);

    public UsersDto getByUsernameAndPassword(String username, String password);

    public boolean existUserControl(String usrname);

    public String registrationUser(Users user);

    public String loginUser(String username, String password);


}
