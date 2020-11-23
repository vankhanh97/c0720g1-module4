package service;

import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements service.Service {


    public String translate(String word) {
        if (word.equals("apple")) {
            return "Táo";
        } else if (word.equals("Orange")) {
            return "Cam";
        } else if (word.equals("Mango")) {
            return "Xoài";
        }
        return "Không tìm thấy từ";
    }
}
