package com.ruyjfs.examplejava.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.ruyjfs.examplejava.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    List<User> findByName(String name);
}