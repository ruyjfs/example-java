package com.ruyjfs.shop.repository;

import com.ruyjfs.shop.model.Catalog;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CatalogRepository extends MongoRepository<Catalog, String> {

//    Catalog findByCode(String code);
}

