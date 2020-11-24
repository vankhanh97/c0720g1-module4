package service;

import org.springframework.stereotype.Service;

@Service
public class ServiceSandWich {

    public StringBuilder build (String[] list){
        StringBuilder result = new StringBuilder();
        for (String word : list) {
            result.append(word);
        }
        return result;

    }

}
