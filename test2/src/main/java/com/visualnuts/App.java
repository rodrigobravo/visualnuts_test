package com.visualnuts;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

public final class App {
    final static String JSON_FILE_PATH = "src/main/java/com/visualnuts/languages.json";
    final static Gson gson = new Gson();
    final static JsonArray countries = fileReader(JSON_FILE_PATH);

    public static void main(String[] args) {

        System.out.println("Number of countries: " + countCountries(countries));
        System.out.println("\nCountries ordered by number of languages:");
        List<Country> orderedCountriesList = orderCountries(countries);

        Country countryDe = null;
        Country countryMost = null;
        for (Country c : orderedCountriesList) {
            System.out.println(c.getCountry() + ": " + c.getLanguages().size());
            //country with the most official languages, where they officially speak German (de)
            if (c.getLanguages().contains("de") && countryDe == null) {
                countryDe = c;
            }
            //country with the highest number of official languages
            if (c.getLanguages().size() == orderedCountriesList.get(0).getLanguages().size()) {
                countryMost = c;
            }
        }

        System.out.println("\nCountry with the most official languages, where they officially speak German (de): " + countryDe.getCountry());
        System.out.println("\nCountry with the highest number of official languages: " + countryMost.getCountry());

}

        public static JsonArray fileReader(String filePath) {
            //read json file and count elements
        JsonParser parser = new JsonParser();
        JsonReader reader = null;

        try {
            reader = new JsonReader(new FileReader(filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        JsonArray root = gson.fromJson(reader, JsonElement.class);

        JsonArray countries = root.getAsJsonArray();

        return countries;
        }

        public static int countCountries(JsonArray countries) {

            return countries.size();
        }

        public static List<Country> orderCountries(JsonArray countries) {

        List<Country> countriesList = new ArrayList<Country>();
        for (JsonElement country : countries) {
            Country c = gson.fromJson(country, Country.class);
            countriesList.add(c);
        }
        countriesList.sort((Country c1, Country c2) -> c2.getLanguages().size() - c1.getLanguages().size());
        return countriesList;
        }
}

