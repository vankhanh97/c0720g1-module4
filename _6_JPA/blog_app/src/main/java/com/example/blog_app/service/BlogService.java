package com.example.blog_app.service;


import com.example.blog_app.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {

//    Page<Blog> findAll(Pageable pageable);

    List<Blog> findAll();

    Blog findById(Integer id);

    void save(Blog blog);

    void delete(Integer id);

    Page<Blog> findByNameContaining(Pageable pageable, String name);


}
