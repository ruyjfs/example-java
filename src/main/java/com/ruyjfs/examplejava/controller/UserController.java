package com.ruyjfs.examplejava.controller;

import java.util.Optional;

import com.ruyjfs.examplejava.model.User;
import com.ruyjfs.examplejava.services.UserService;
// import com.ruyjfs.examplejava.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/users")
public class UserController {

    @Autowired
    UserService service;

    private static final String domain = "";

    @GetMapping
    @ResponseBody
    public Iterable<User> index() {
        return service.all();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Optional<User> show(@PathVariable Integer id) {
        return service.byId(id);
    }

    @PostMapping
    @ResponseBody
    public User create(@RequestBody User user) {
        return service.create(user);
    }

    @PatchMapping
    @ResponseBody
    public User update(@RequestBody User user) {
        return service.update(user);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public Optional<User> delete(@PathVariable Integer id) {
        return service.delete(id);
    }
}
