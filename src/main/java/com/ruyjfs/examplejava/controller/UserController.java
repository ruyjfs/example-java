package com.ruyjfs.examplejava.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ruyjfs.examplejava.services.Users;

@SpringBootApplication
@RestController
public class UserController {
    public static void main(String[] args) {
        SpringApplication.run(UserController.class, args);
    }

    @GetMapping("/v1/users")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        Users users = new Users();

        return String.format("Users %s!", users.all(name));
    }

}