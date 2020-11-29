package com.example.blog_app.controller;

import com.example.blog_app.entity.Blog;
import com.example.blog_app.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/")
    public String goHome(Model model) {
            model.addAttribute("listBlog", blogService.findAll());
        return "blog/Home";
    }

    @GetMapping("/create")
    public String goCreateStudent(Model model) {
        model.addAttribute("blog", new Blog());
        return "blog/create_blog";
    }

    @PostMapping("/create")
    public String saveBlog(@Validated  @ModelAttribute Blog blog, BindingResult bindingResult) {
        if(bindingResult.hasErrors())
        {
            return"blog/create_blog";
        }
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
