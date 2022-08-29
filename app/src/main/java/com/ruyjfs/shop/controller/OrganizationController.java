package com.ruyjfs.shop.controller;

import com.ruyjfs.core.controller.AbstractCrudController;
import com.ruyjfs.shop.model.Organization;
import com.ruyjfs.shop.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/organizations")
public class OrganizationController extends AbstractCrudController<Organization> {

  @Autowired
  protected OrganizationService service;

}
