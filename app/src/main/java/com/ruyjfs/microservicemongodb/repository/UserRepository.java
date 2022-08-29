package com.ruyjfs.microservicemongodb.repository;

import com.ruyjfs.microservicemongodb.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}

