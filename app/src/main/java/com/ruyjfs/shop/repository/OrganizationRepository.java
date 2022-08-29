package com.ruyjfs.shop.repository;

import com.ruyjfs.shop.model.Organization;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrganizationRepository extends MongoRepository<Organization, String> {

}

