package com.ruyjfs.shop.service;

import com.ruyjfs.core.service.AbstractCrudMongoService;
import com.ruyjfs.core.service.CrudServiceInterface;
import com.ruyjfs.shop.model.Catalog;
import com.ruyjfs.shop.repository.CatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogService extends AbstractCrudMongoService<Catalog> implements CrudServiceInterface<Catalog> {

  @Autowired
  public CatalogRepository repository;

//  @Autowired
//  public CatalogRepository repository;

//  public CatalogService(CatalogRepository repository) {
//    super(repository);
//    this.repository = repository;
//  }

  // public ArrayList<Catalog> getAll() {
  // ArrayList<Catalog> result = new ArrayList<Catalog>();
  // SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
  // try {
  // result.add(new Catalog("Coca", null));
  // result.add(new Catalog("Fanta", dateFormat.parse("05/07/0001")));
  // } catch (ParseException e) {
  // e.printStackTrace();
  // }

  // return result;
  // }

  // public Catalog getById(String id) {
  // return new Catalog("Julios", null);
  // }

  // @Override
  // public void isValid(Catalog data) {
  // }

  // @Override
  // public Optional<Catalog> save(Catalog data) {
  // return Optional.ofNullable(new Catalog("Julios", null));
  // }

  // @Override
  // public Optional<Catalog> delete(String id) {
  // return Optional.ofNullable(new Catalog("Julios", null));
  // }
}
