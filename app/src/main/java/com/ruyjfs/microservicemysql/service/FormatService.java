package com.ruyjfs.microservicemysql.service;

import com.ruyjfs.core.service.AbstractCrudMySqlService;
import com.ruyjfs.core.service.AbstractCrudPostgreService;
import com.ruyjfs.microservicemysql.model.Format;
import com.ruyjfs.microservicemysql.repository.FormatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormatService extends AbstractCrudMySqlService<Format> {

    @Autowired
    protected FormatRepository repository;

    public void beforeSave(Format data) {
        data.setUserName("no-user");
    }

    public boolean isValid(Format data) {
        final boolean exists = repository.existsFormat(data.getFormat());
        return !exists;
    }
}
