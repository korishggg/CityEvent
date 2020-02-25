package com.example.cityeventservice.service.interfaces;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface DefaultDAOGenericService<T extends Serializable> {
    T save(T entity);
    void delete(T entity);
    T update(T entity);
    List<T> getAll();
    Optional<T> getById(Long id);
}
