package service;

import org.springframework.stereotype.Service;

@Service
public class ServiceApp {

    public int calculate(int num1, int num2, String o) {
        int result = 0;
        switch (o) {
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
            default:
                result = 0;
        }
        return result;
    }
}

