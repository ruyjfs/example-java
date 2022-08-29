package com.ruyjfs.core.service;

import java.util.List;
import java.util.Optional;

public interface CrudPostgreServiceInterface<T> {

  // List<T> list(RequestPaginateDto paginate);

  // Page<T> listPaginated(RequestPaginateDto paginate);

  // List<T> search(RequestPaginatePostDto<T> paginate);

  // Page<T> searchPaginated(RequestPaginatePostDto<T> paginate);

  Iterable<T> getAll();

  Optional<T> getById(Long id);

  void isValid(T data);

  T insert(T data);
  T save(T data);
  Optional<T> save(Long id, T data);
  Optional<T> update(Long id, T data);

  Optional<T> delete(Long id);
}
