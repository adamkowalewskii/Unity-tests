package com.dolittle.testinglecture;

public class Translator {

    private final Dictionary dictionary;

    public Translator(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public String translate(String word) {
        return dictionary.translate(word);
    }


}
