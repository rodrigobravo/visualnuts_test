package com.visualnuts;

import java.util.ArrayList;
import java.util.List;

public class Language {

    private String language;
    private String country;
    private List<String> countries;

    public Language(String language, String country) {
        this.language = language;
        this.country = country;
        this.countries = new ArrayList<String>();
    }



    public String getLanguage() {
        return this.language;
    }

    public String getCountry() {
        return this.country;
    }

    public void addCountry(String country) {
        this.countries.add(country);
    }

    public List<String> getCountries() {
        return this.countries;
    }


}
