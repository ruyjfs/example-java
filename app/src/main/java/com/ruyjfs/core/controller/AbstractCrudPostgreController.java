package com.ruyjfs.core.controller;

import com.ruyjfs.core.helper.ResponseHelper;
import com.ruyjfs.core.service.AbstractCrudPostgreService;
import com.ruyjfs.core.service.CrudPostgreServiceInterface;
import com.ruyjfs.core.service.CrudServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public abstract class AbstractCrudPostgreController<T> {

  @Autowired
  protected AbstractCrudPostgreService<T> service;

  @GetMapping
  public ResponseEntity<Object> list() {
    return ResponseHelper.ok(service.getAll());
  }

  @GetMapping("/{id}")
  public ResponseEntity<Object> show(@PathVariable final Long id) {
    return ResponseHelper.ok(service.getById(id));
  }

  @PostMapping
  public ResponseEntity<Object> create(@RequestBody T data) {
    return ResponseHelper.created(service.insert(data));
  }

  @PutMapping
  public ResponseEntity<Object> save(@Validated @RequestBody T data) {
    return ResponseHelper.ok(service.save(data));
  }

  @PutMapping("/{id}")
  public ResponseEntity<Object> save(@PathVariable final Long id, @Validated @RequestBody T data) {
    final var result = service.save(id, data);
    if (result.isEmpty()) {
      return ResponseHelper.notFound();
    }
    return ResponseHelper.ok(result);
  }

  @PatchMapping("/{id}")
  public ResponseEntity<Object> update(@PathVariable final Long id, @Validated @RequestBody T data) {
    final var result = service.update(id, data);
    if (result.isEmpty()) {
      return ResponseHelper.notFound();
    }
    return ResponseHelper.ok(result);
  }


  @DeleteMapping("/{id}")
  public ResponseEntity<Object> delete(@PathVariable final Long id) {
    final var result = service.delete(id);
    if (result.isEmpty()) {
      return ResponseHelper.notFound();
    }
    return ResponseHelper.ok(result);
  }
}
