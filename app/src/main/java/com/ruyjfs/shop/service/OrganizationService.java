package com.ruyjfs.shop.service;

import com.ruyjfs.core.service.AbstractCrudMongoService;
import com.ruyjfs.core.service.CrudServiceInterface;
import com.ruyjfs.shop.model.Organization;
import org.springframework.stereotype.Service;

@Service
public class OrganizationService extends AbstractCrudMongoService<Organization> implements CrudServiceInterface<Organization> {

//    @Autowired
//    public OrganizationRepository repository;

//    public OrganizationService(OrganizationRepository repository) {
//        super(repository);
//        this.repository = repository;
//    }

  // public ArrayList<Organization> getAll() {
  // ArrayList<Organization> result = new ArrayList<Organization>();
  // SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
  // try {
  // result.add(new Organization("Coca", dateFormat.parse("05/01/1990")));
  // result.add(new Organization("Fanta", dateFormat.parse("05/07/0001")));
  // } catch (ParseException e) {
  // e.printStackTrace();
  // }

  // return result;
  // }

  // public Organization getById(String id) {
  // return new Organization("Julios", null);
  // }

  // @Override
  // public void isValid(Organization data) {
  // }

  // @Override
  // public Optional<Organization> save(Organization data) {
  // return Optional.ofNullable(new Organization("Julios", null));
  // }

  // @Override
  // public Optional<Organization> delete(String id) {
  // return Optional.ofNullable(new Organization("Julios", null));
  // }
}
