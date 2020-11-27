package com.codegym.repository;

import com.codegym.entity.Product;

import java.util.List;


public interface ProductRepository {
    List<Product> findAll();

    Product findById(Integer id);

    void save(Product product);

    void delete( Integer id);
}
