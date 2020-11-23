package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.Service;
import service.ServiceImpl;

@Controller
public class Controller1 {

    @Autowired
    private ServiceImpl service;


    @GetMapping("/")
    public String goHome(){
        return "home";
    }

    @GetMapping("/translate")
    public String translate(@RequestParam String word, Model model){
        model.addAttribute("result", service.translate(word));
        return "result";
    }

}
