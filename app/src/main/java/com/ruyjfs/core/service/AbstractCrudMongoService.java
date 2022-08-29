package com.ruyjfs.core.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Log4j2
public abstract class AbstractCrudMongoService<T> {

    @Autowired
    protected MongoRepository<T, String> repository;

    public List<T> getAll() {
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

    public Optional<T> save(String id,T data) {
//        return repository.save(data);
        //        entity.stream().map(t -> (t.get("id") = id)).collect(Collectors.toCollection());
        //        entity.get();
        //        data.getClass().getMethods().
//    Arrays.stream(data.getClass().getClass().getMethods()).setId();
        Optional<T> entity = repository.findById(id);
        return Optional.of(repository.save(entity.get()));
    }


    public Optional<T> update(String id, T data) {
        Optional<T> entity = repository.findById(id);
        if (entity.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(repository.save(entity.get()));
    }

    public Optional<T> getById(String id) {
        return repository.findById(id);
    }

    public void isValid(T data) {
        // TODO Auto-generated method stub

    }

    public Optional<T> delete(String id) {
        final Optional<T> data = repository.findById(id);
        if (data.isPresent()) {
            repository.delete(data.get());
            return data;
        } else return Optional.empty();
    }

}
