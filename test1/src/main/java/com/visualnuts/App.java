package com.visualnuts;

/**
 * Visual Nuts Test 1
 */
public final class App {

    /**
     * This App prints the whole integer numbers to the console, start
     * from the number 1, and print all numbers going up to the number 100.
     * However, when the number is divisible by 3, do not print the number, but print the word
     * 'Visual'. If the number is divisible by 5, do not print the number, but print 'Nuts'. And for all
     * numbers divisible by both (eg: the number 15) the same, but print 'Visual Nuts'.
     *
     *
     */
    public static void main(String[] args) {
        for (String output : result(inputNumbers())) {
            System.out.println(output);
        }
    }
    /**
     * Method that creates de input numbers, in this case,
     * the numbers 1 to 100.
     * @return an array of integers with the input numbers.
     */
    public static int[] inputNumbers() {
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        return numbers;
    }
    /**
     * Method that creates an array of strings with the result of the
     * input numbers.
     * @param Array of integers with the input numbers.
     * @return Array of strings with the result of the input numbers.
     */
    public static String[] result(int[] inputNumbers) {
        String[] output = new String[inputNumbers.length];
        for (int i = 0; i < inputNumbers.length; i++) {
            if (inputNumbers[i] % 3 == 0 && inputNumbers[i] % 5 == 0) {
               output[i] = "Visual Nuts";
            }else if (inputNumbers[i] % 3 == 0) {
                output[i] = "Visual";
            } else if (inputNumbers[i] % 5 == 0) {
                output[i] = "Nuts";
            }else {
                output[i] = String.valueOf(inputNumbers[i]);
            }
        }
        return output;
    }
}
