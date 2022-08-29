package com.ruyjfs.shop.service;

import com.ruyjfs.core.service.AbstractCrudMongoService;
import com.ruyjfs.core.service.CrudServiceInterface;
import com.ruyjfs.shop.model.Menu;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class MenuService extends AbstractCrudMongoService<Menu> implements CrudServiceInterface<Menu> {
    @Override
    public Optional<Menu> save(String id, Menu data) {
        return Optional.empty();
    }

//  @Autowired
//  public MenuRepository repository;
//
//  public MenuService(MenuRepository repository) {
//    super(repository);
//    this.repository = repository;
//  }
//
//  public ArrayList<Menu> getAll() {
//    ArrayList<Menu> result = new ArrayList<Menu>();
//
//    final ProductQuantityType productQuantityTypeGramas = new ProductQuantityType("GRAMAS");
//    final ProductQuantityType productQuantityTypeUnidade = new ProductQuantityType("UNIDADE");
//
//    var catalogs = new ArrayList<Catalog>();
//    catalogs.add(
//        new Catalog(new Product("PÃO DE QUEIJO GRANDE", new ProductQuantity(200L, productQuantityTypeGramas)),
//            new ProductQuantity(1L, productQuantityTypeUnidade), 2.50));
//    // catalogs.add(
//    // new Catalog(new Product("PÃO DE QUEIJO PEQUENO", new ProductQuantity(100L,
//    // productQuantityTypeUnidade)), 1.00));
//
//    var menuCategories = new ArrayList<MenuCategory>();
//    menuCategories.add(new MenuCategory("PÃO DE QUEIJO", catalogs));
//    menuCategories.add(new MenuCategory("BISCOITO FRITO", null));
//    menuCategories.add(new MenuCategory("SALGADO FRITO", null));
//    menuCategories.add(new MenuCategory("SALGADO ASSADO", null));
//    menuCategories.add(new MenuCategory("TAPIOCA DE SAL", null));
//    menuCategories.add(new MenuCategory("TAPIOCA DE DOCE", null));
//    menuCategories.add(new MenuCategory("CUSCUZ", null));
//    menuCategories.add(new MenuCategory("DIVERSOS", null));
//    menuCategories.add(new MenuCategory("SUCO DE POLPA 300 ML", null));
//    menuCategories.add(new MenuCategory("SUCO DA FRUTA 300 ML", null));
//    menuCategories.add(new MenuCategory("CREME 300 ML", null));
//    menuCategories.add(new MenuCategory("VITAMINA 300 ML", null));
//    menuCategories.add(new MenuCategory("CAFÉ", null));
//    menuCategories.add(new MenuCategory("DIVERSOS", null));
//
//    result.add(new Menu( null, "Casa Caipira", menuCategories));
//
//    return result;
//  }

//  public Menu getById(String id) {
//    return new Menu(null, "Julios", null);
//  }
//
//  @Override
//  public void isValid(Menu data) {
//  }
//
//  @Override
//  public Optional<Menu> save(Menu data) {
//    return Optional.ofNullable(new Menu(null, "Julios", null));
//  }
//
//  @Override
//  public Optional<Menu> delete(String id) {
//    return Optional.ofNullable(new Menu(null, "Julios", null));
//  }
}
