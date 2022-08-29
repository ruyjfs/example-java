package com.ruyjfs.shop.controller;

import com.ruyjfs.core.controller.AbstractCrudController;
import com.ruyjfs.shop.model.Menu;
import com.ruyjfs.shop.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/menus")
public class MenuController extends AbstractCrudController<Menu> {

  @Autowired
  protected MenuService service;

}
