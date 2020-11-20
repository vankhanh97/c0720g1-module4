package ung_dung_tu_dien.service;

import java.util.ArrayList;

public interface DictionaryService {
    ArrayList<String> findAll();

    String findByName(String name);
}
