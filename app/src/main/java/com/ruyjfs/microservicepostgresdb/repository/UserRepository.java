package com.ruyjfs.microservicepostgresdb.repository;

import com.ruyjfs.microservicepostgresdb.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}

