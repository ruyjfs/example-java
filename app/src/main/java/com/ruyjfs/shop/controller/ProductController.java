package com.ruyjfs.shop.controller;

import com.ruyjfs.core.controller.AbstractCrudController;
import com.ruyjfs.shop.model.Product;
import com.ruyjfs.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/products")
public class ProductController extends AbstractCrudController<Product> {

  @Autowired
  protected ProductService service;

}
