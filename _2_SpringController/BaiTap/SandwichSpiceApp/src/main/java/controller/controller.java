package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controller {

    @GetMapping("/")
    public String goHome() {
        return "home";
    }

    @GetMapping("/home")
    public String choose(@RequestParam String[] name, Model model) {
        StringBuilder result = new StringBuilder();
        for (String s : name) {
            result.append(s);
        }

        model.addAttribute("list", result.toString());
        return "home";

    }
}
