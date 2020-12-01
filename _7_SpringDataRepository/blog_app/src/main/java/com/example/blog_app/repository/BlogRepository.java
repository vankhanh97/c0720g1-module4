package com.example.blog_app.repository;

import com.example.blog_app.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BlogRepository extends JpaRepository<Blog, Integer> {
    Page<Blog> findAllByNameContaining(Pageable pageable, String name);
    Page<Blog> findAll(Pageable pageable);

    //    @Query(value = "select * from student where `name` like %?1%", nativeQuery = true)
//    @Query(value = "select * from student where `name` like concat('%', ?1, '%')", nativeQuery = true)
//    List<Blog> searchStudentByName(String name);
//    List<Blog> findAllByNameContainingOrderByIdDesc(String name);
}
