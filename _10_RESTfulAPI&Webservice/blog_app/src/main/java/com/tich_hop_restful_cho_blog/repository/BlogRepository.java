package com.tich_hop_restful_cho_blog.repository;

import com.tich_hop_restful_cho_blog.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

    Page<Blog> findAllByNameContaining(Pageable pageable, String name);

}
