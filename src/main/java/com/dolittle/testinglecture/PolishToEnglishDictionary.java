package com.dolittle.testinglecture;

import java.util.Map;

public class PolishToEnglishDictionary implements Dictionary {

    private final Map<String, String> dictionary;

    public PolishToEnglishDictionary(Map<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    @Override
    public String translate(String word) {
        return dictionary.get(word);
    }
}
