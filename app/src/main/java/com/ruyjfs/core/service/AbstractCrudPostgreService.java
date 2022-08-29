package com.ruyjfs.core.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Log4j2
public abstract class AbstractCrudPostgreService<T> {

    @Autowired
    protected CrudRepository<T, Long> repository;

    public Iterable<T> getAll() {

        return repository.findAll();
    }

    public T insert(T data) {
        return repository.save(data);
    }

    public T save(T data) {
        return repository.save(data);
        //        entity.stream().map(t -> (t.get("id") = id)).collect(Collectors.toCollection());
    //        entity.get();
    //        data.getClass().getMethods().
//    Arrays.stream(data.getClass().getClass().getMethods()).setId();
//        return Optional.of(repository.save(entity.get()));
    }

    public Optional<T> save(Long id,T data) {
//        return repository.save(data);
        //        entity.stream().map(t -> (t.get("id") = id)).collect(Collectors.toCollection());
        //        entity.get();
        //        data.getClass().getMethods().
//    Arrays.stream(data.getClass().getClass().getMethods()).setId();
        Optional<T> entity = repository.findById(id);
        return Optional.of(repository.save(entity.get()));
    }


    public Optional<T> update(Long id, T data) {
        Optional<T> entity = repository.findById(id);
        if (entity.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(repository.save(entity.get()));
    }

    public Optional<T> getById(Long id) {
        return repository.findById(id);
    }

    public void isValid(T data) {
        // TODO Auto-generated method stub

    }

    public Optional<T> delete(Long id) {
        final Optional<T> data = repository.findById(id);
        if (data.isPresent()) {
            repository.delete(data.get());
            return data;
        } else return Optional.empty();
    }

}
