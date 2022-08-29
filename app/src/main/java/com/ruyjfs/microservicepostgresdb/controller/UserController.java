package com.ruyjfs.microservicepostgresdb.controller;

import com.ruyjfs.core.controller.AbstractCrudPostgreController;
import com.ruyjfs.microservicepostgresdb.model.User;
import com.ruyjfs.microservicepostgresdb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/users")
public class UserController extends AbstractCrudPostgreController<User> {

  @Autowired
  protected UserService service;

}
