package com.codegym.minitestmd4.service;

import com.codegym.minitestmd4.model.Product;

import java.util.Optional;

public interface IGeneralService<T> {
    Iterable<T> findAll();

    Optional<T> findById(Long id);

    T save(T t);

    void remove(Long id);

    Iterable<T> findByName(String name);

    Iterable<T> sortByPrice();

    Iterable<Product> getTop4();
}