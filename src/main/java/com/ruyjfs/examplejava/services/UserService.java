package com.ruyjfs.examplejava.services;

import java.time.LocalDate;
import java.util.Optional;

import com.ruyjfs.examplejava.model.User;
import com.ruyjfs.examplejava.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public Iterable<User> all() {
        return repository.findAll();
    }

    public Optional<User> byId(Integer id) {
        return repository.findById(id);
    }

    public User create(User user) {
        user.setGender(1);
        user.setDate(LocalDate.of(1990, 5, 1));
        user.setCreatedAt(LocalDate.now());
        user.setUpdatedAt(LocalDate.now());
        repository.save(user);
        return user;
    }

    public Optional<User> delete(Integer id) {
        Optional<User> user = repository.findById(id);
        repository.deleteById(id);
        return user;
    }

    public User update(User user) {
        User userDb = repository.findById(user.getId()).get();
        // user.setName("ruyjfs");
        // user.setFirstName("Ruy");
        // user.setLastName("Ferreira");
        // user.setEmail("ruyjfs@gmail.com");
        // user.setPassword("123456");

        userDb.setId(user.getId());
        userDb.setName(user.getName());
        userDb.setEmail(user.getEmail());
        userDb.setPassword(user.getPassword());

        repository.save(userDb);

        return user;
    }
}
