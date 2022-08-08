package com.visualnuts;
import java.util.List;

public class Country {

    private String country;
    private List<String> languages;

    public Country(String country, List<String> languages) {
        this.country = country;
        this.languages = languages;
    }

    public List<String> getLanguages() {


        return this.languages;

    }

    public String getCountry() {

        return this.country;
    }

}
