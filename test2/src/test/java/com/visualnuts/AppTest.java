package com.visualnuts;

import org.junit.jupiter.api.Test;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }


    @Test
    void testFileReader() {
        JsonParser parser = new JsonParser();
        JsonReader reader = null;

        try {
            reader = new JsonReader(new FileReader("src/main/java/com/visualnuts/languages.json"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Gson gson = new Gson();
        JsonArray root = gson.fromJson(reader, JsonElement.class);

        JsonArray countries = root.getAsJsonArray();

        assertEquals(countries.size(), 5);
    }

}
