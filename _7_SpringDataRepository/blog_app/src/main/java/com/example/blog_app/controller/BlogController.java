package com.example.blog_app.controller;

import com.example.blog_app.entity.Blog;
import com.example.blog_app.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/")
    public String goHome(Model model, @PageableDefault(size = 2) Pageable pageable,
                         @RequestParam Optional<String> keyword) {
        String keywordOld = "";
        if (keyword.isPresent()) {
            keywordOld = keyword.get();
            model.addAttribute("listBlog", blogService.findByNameContaining(pageable, keywordOld));
        } else {
            model.addAttribute("listBlog", blogService.findAll(pageable));

        }

        model.addAttribute("keywordOld", keywordOld);
        return "blog/Home";
    }

    @GetMapping("/create")
    public String goCreateStudent(Model model) {
        model.addAttribute("blog", new Blog());
        return "blog/create_blog";
    }

    @PostMapping("/create")
    public String saveBlog(@ModelAttribute Blog blog) {
        blogService.save(blog);
        return "redirect:/";
    }

    @GetMapping("/detail")
    public String goDetailBlog(@RequestParam Integer id, Model model) {
        model.addAttribute("blogDetail", blogService.findById(id));
        return "blog/detail_blog";
    }

    @GetMapping("/delete")
    public String deleteBlog(@RequestParam Integer id) {
        blogService.delete(id);
        return "redirect:/";
    }
    @GetMapping("/update")
    public String goUpdateBlog(Model model, @RequestParam Integer id) {
        model.addAttribute("blog", this.blogService.findById(id));
        return "blog/update";
    }

    @PostMapping("/update")
    public String updateBlog(@ModelAttribute Blog blog) {
        this.blogService.save(blog);
        return "redirect:/";

    }
}
