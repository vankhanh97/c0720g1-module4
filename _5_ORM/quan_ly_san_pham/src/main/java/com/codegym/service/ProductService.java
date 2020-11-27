package com.codegym.service;

import com.codegym.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

}
