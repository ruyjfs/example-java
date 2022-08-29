package com.ruyjfs.shop.controller;

import com.ruyjfs.core.controller.AbstractCrudController;
import com.ruyjfs.shop.model.ProductCategory;
import com.ruyjfs.shop.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/product-categories")
public class ProductCategoryController extends AbstractCrudController<ProductCategory> {

  @Autowired
  protected ProductCategoryService service;

}
