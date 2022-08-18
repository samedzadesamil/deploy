package com.example.litteraturebooksection.controller;


import com.example.litteraturebooksection.model.dto.LoginUserDto;
import com.example.litteraturebooksection.model.entity.Users;
import com.example.litteraturebooksection.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menu")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/registrtion")
    public String registration(@RequestBody Users users){
        return userService.registrationUser(users);
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginUserDto dto){
        return userService.loginUser(dto.getUsername(), dto.getPassword());
    }
        

}
