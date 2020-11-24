package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.ServiceApp;

@Controller
public class ControllerApp {

    @Autowired
    private ServiceApp serviceApp;

    @GetMapping("/")
    public String goHome() {
        return "home";
    }

    @GetMapping("/home")
    public String choose(@RequestParam int num1, @RequestParam int num2, @RequestParam String operator, Model model) {

        model.addAttribute("result", serviceApp.calculate(num1, num2, operator));
        return "home";
    }
}
