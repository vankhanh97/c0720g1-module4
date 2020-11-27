package com.codegym.service.Impl;

import com.codegym.entity.Product;
import com.codegym.repository.Impl.ProductRepositoryImpl;
import com.codegym.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.codegym.service.ProductService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepositoryImpl productRepositoryImpl;

    @Override
    public List<Product> findAll() {
        return this.productRepositoryImpl.findAll();
    }

    @Override
    public void save(Product product) {
        this.productRepositoryImpl.save(product);
    }

    @Override
    public Product findById(int id) {
        return this.productRepositoryImpl.findById(id);
    }

}
