package com.ruyjfs.microservicemysql.controller;

import com.ruyjfs.core.controller.AbstractCrudMySqlController;
import com.ruyjfs.microservicemysql.model.Format;
import com.ruyjfs.microservicemysql.service.FormatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/format")
public class FormatController extends AbstractCrudMySqlController<Format> {

    @Autowired
    protected FormatService service;
}
