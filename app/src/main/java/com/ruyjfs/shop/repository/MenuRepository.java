package com.ruyjfs.shop.repository;

import com.ruyjfs.shop.model.Menu;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MenuRepository extends MongoRepository<Menu, String> {

}

