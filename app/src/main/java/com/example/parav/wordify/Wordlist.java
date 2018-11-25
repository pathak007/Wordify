package com.example.parav.wordify;

public class Wordlist {

    private String word;
    private String meaning;
    private String example;
    private String antonym;
    private String synonym;



    public Wordlist(String word, String meaning, String example, String antonym, String synonym) {
        this.word = word;
        this.meaning = meaning;
        this.example = example;
        this.antonym = antonym;
        this.synonym = synonym;
    }

    public String getWord() {
        return word;
    }

    public String getMeaning() {
        return meaning;
    }

    public String getExample() {
        return example;
    }

    public String getAntonym() {
        return antonym;
    }

    public String getSynonym() {
        return synonym;
    }
}
