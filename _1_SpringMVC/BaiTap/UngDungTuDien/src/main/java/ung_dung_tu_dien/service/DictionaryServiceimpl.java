package ung_dung_tu_dien.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

@Service
public class DictionaryServiceimpl implements DictionaryService {

    public static Map<String,String> listDictionary ;
static {
    listDictionary = new TreeMap<>();
    listDictionary.put("Táo", "Apple");
    listDictionary.put("Cam", "Orange");
    listDictionary.put("Đỏ", "Red");
    listDictionary.put("Xanh", "Green");
    listDictionary.put("Xanh da trời", "Blue");
}
    @Override
    public ArrayList<String> findAll() {
        return new ArrayList<>(listDictionary.values());
    }

    @Override
    public String findByName(String name) {
        for (Map.Entry<String, String> element : listDictionary.entrySet()){
            if (name.equals(element.getKey())){
                return element.getValue();
            }
        }
        return "Không có !";
    }
}
