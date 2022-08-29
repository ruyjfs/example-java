package com.ruyjfs.microservicepostgresdb.service;

import com.ruyjfs.core.service.AbstractCrudPostgreService;
import com.ruyjfs.core.service.CrudPostgreServiceInterface;
import com.ruyjfs.microservicepostgresdb.model.User;
import com.ruyjfs.microservicepostgresdb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService extends AbstractCrudPostgreService<User> implements CrudPostgreServiceInterface<User> {

}

