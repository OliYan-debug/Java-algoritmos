package com.example.captalize;

import org.springframework.stereotype.Service;

@Service
public class CaptalizeService {

    public String captalizedWord(String word) {
        String wordCaptalized = word.toUpperCase();
        return  wordCaptalized;
    }


}
