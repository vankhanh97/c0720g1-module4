package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.ServiceSandWich;


@Controller
public class ControllerSandWich {

    @Autowired
    private ServiceSandWich serviceSandWich;


    @GetMapping("/")
    public String goHome() {
        return "home";
    }

    @GetMapping("/home")
    public String choose(@RequestParam String[] name, Model model) {
        model.addAttribute("list", serviceSandWich.build(name).toString());
        return "home";

    }
}
