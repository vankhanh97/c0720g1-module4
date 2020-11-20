package ung_dung_tu_dien.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ung_dung_tu_dien.service.DictionaryService;

@Controller
public class DictionaryController {
    @Autowired
    private DictionaryService dictionaryService;

    @GetMapping("/")
    public String goHome(){
        return "home";
    }



    @GetMapping("/list")
    public String goList(@RequestParam String name, Model model) {
        model.addAttribute("listDictionary", dictionaryService.findByName(name));
        return "list";
    }


}
