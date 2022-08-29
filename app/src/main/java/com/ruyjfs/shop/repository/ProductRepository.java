package com.ruyjfs.shop.repository;

import com.ruyjfs.shop.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}

