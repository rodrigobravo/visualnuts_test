package com.visualnuts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;



class AppTest {



    @Test
    void testInputNumbers() {
        int[] numbers = App.inputNumbers();
        for (int i = 0; i < numbers.length; i++) {
        assertEquals(i+1, numbers[i]);
    }
}

    @Test
    void testResult() {
        int[] inputNumbers = {1, 2, 3, 4, 5, 6, 15};
        String[] expected = {"1", "2", "Visual", "4", "Nuts", "Visual", "Visual Nuts"};
        String[] output = App.result(inputNumbers);
        assertArrayEquals(expected, output);
    }
}
