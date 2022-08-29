package com.ruyjfs.microservicemongodb.service;

import com.ruyjfs.core.service.AbstractCrudMongoService;
import com.ruyjfs.core.service.CrudServiceInterface;
import com.ruyjfs.microservicemongodb.model.User;
import com.ruyjfs.microservicemongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractCrudMongoService<User> implements CrudServiceInterface<User> {

    @Autowired
    public UserRepository repository;
}

