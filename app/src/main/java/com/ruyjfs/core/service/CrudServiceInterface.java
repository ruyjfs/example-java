package com.ruyjfs.core.service;

import java.util.List;
import java.util.Optional;

public interface CrudServiceInterface<T> {

  // List<T> list(RequestPaginateDto paginate);

  // Page<T> listPaginated(RequestPaginateDto paginate);

  // List<T> search(RequestPaginatePostDto<T> paginate);

  // Page<T> searchPaginated(RequestPaginatePostDto<T> paginate);

  List<T> getAll();

  Optional<T> getById(String id);

  void isValid(T data);

  T insert(T data);
  T save(T data);
  Optional<T> save(String id, T data);
  Optional<T> update(String id, T data);

  Optional<T> delete(String id);
}
