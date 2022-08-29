package com.ruyjfs.shop.service;

import com.ruyjfs.core.service.AbstractCrudMongoService;
import com.ruyjfs.core.service.CrudServiceInterface;
import com.ruyjfs.shop.model.ProductCategory;
import com.ruyjfs.shop.repository.ProductCategoryRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class ProductCategoryService extends AbstractCrudMongoService<ProductCategory> implements CrudServiceInterface<ProductCategory> {

    @Autowired
    public ProductCategoryRepository repository;

//    @Override
//    public List<ProductCategory> getAll() {
//        log.info("AQUI -> 1");
//        return repository.findAll();
//    }

//    @Override
//    public List<ProductCategory> getAll() {
//        log.info("AQUI -> 11");
//        return repository.findAll();
//    }

//    public ProductCategoryService(ProductCategoryRepository repository) {
//        super(repository);
//        this.repository = repository;
//    }

  // public ArrayList<Product> getAll() {
  // ArrayList<Product> result = new ArrayList<Product>();
  // SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
  // try {
  // result.add(new Product("Coca", dateFormat.parse("05/01/1990")));
  // result.add(new Product("Fanta", dateFormat.parse("05/07/0001")));
  // } catch (ParseException e) {
  // e.printStackTrace();
  // }

  // return result;
  // }

  // public Product getById(String id) {
  // return new Product("Julios", null);
  // }

  // @Override
  // public void isValid(Product data) {
  // }

  // @Override
  // public Optional<Product> save(Product data) {
  // return Optional.ofNullable(new Product("Julios", null));
  // }

  // @Override
  // public Optional<Product> delete(String id) {
  // return Optional.ofNullable(new Product("Julios", null));
  // }
}
