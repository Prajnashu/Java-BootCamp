package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MaxCharInStringTest {

    @Test
    public void testFindMostFrequentChar_EmptyString() {
        String input = "";
        assertThrows(IllegalArgumentException.class, () -> MaxCharInString.findMostFrequentChar(input));
    }

    @Test
    public void testFindMostFrequentChar_NullString() {
        String input = null;
        assertThrows(IllegalArgumentException.class, () -> MaxCharInString.findMostFrequentChar(input));
    }

    @Test
    public void testFindMostFrequentChar_SingleCharacter() {
        String input = "h";
        char expected = 'h';
        assertEquals(expected, MaxCharInString.findMostFrequentChar(input));
    }

    @Test
    public void testFindMostFrequentChar_NormalPattern() {
        String input = "hello";
        char expected = 'l';
        assertEquals(expected, MaxCharInString.findMostFrequentChar(input));
    }

    @Test
    public void testFindMostFrequentChar_MultipleCharactersWithEqualFrequency() {
        String input = "abacus";
        char expected = 'a';
        assertEquals(expected, MaxCharInString.findMostFrequentChar(input));
    }

    @Test
    public void testFindMostFrequentChar_SpecialCharacter() {
        String input = "@#45ads@##";
        char expected = '#';
        assertEquals(expected, MaxCharInString.findMostFrequentChar(input));
    }

    @Test
    public void testFindMostFrequentChar_SpacesAsCharacter() {
        String input = "a b c #";
        char expected = ' ';
        assertEquals(expected, MaxCharInString.findMostFrequentChar(input));
    }
}
