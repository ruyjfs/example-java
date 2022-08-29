package com.ruyjfs.microservicemongodb.controller;

import com.ruyjfs.core.controller.AbstractCrudController;
import com.ruyjfs.microservicemongodb.model.User;
import com.ruyjfs.microservicemongodb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/users")
public class UserController extends AbstractCrudController<User> {

  @Autowired
  protected UserService service;

}
