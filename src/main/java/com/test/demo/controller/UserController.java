package com.test.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.dto.UserDto;

@RestController
public class UserController {

    @GetMapping("/")
    public UserDto showMsg() {
        String str;
        str = "shyam";
        System.out.println(str);
        return new UserDto(1, "Shyam", "shyam.gupta@gamil.com");
    }

}
