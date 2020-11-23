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
    public String choose(@RequestParam int num1, @RequestParam int num2, @RequestParam String operator, Model model) {
        int result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        model.addAttribute("result", result);
        return "home";
    }
}
