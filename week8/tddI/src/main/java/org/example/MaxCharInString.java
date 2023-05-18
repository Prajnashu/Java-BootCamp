package org.example;

public class MaxCharInString {
    public static char findMostFrequentChar(String input) {
        // Throwing Predefined IllegalArgumentException for null and empty string
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be null or empty");
        }

        //character array of 256 length taking all possible ASCII characters into account
        int[] charCount = new int[256];

        //increase the count corresponding to the character's ASCII value
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            charCount[c]++;
        }

        //initializes result to null character
        char mostFrequentChar = '\0';
        int maxCount = 0;

        //find the most frequent character
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > maxCount) {
                mostFrequentChar = (char) i;
                maxCount = charCount[i];
            }
        }

        return mostFrequentChar;
    }
}

