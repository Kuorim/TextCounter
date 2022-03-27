package com.example.textcounter;

import static org.junit.Assert.assertEquals;

import com.example.textcounter.utils.TextUtils;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void getCharsCount_Given_EmptyString_Result_Zero() {
        String givenString = "";
        int expectedValue = 0;
        int actualValue = TextUtils.getCharsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getCharsCount_Given_TenCharsString_Result_Ten() {
        String givenString = "1234567890";
        int expectedValue = 10;
        int actualValue = TextUtils.getCharsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getCharsCount_Given_TwelveSpacesString_Result_Twelve() {
        String givenString = "            ";
        int expectedValue = 12;
        int actualValue = TextUtils.getCharsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getCharsCount_Given_EmptyString_Result_Exception() {
        String givenString = null;
        int actualValue = TextUtils.getCharsCount(givenString);
    }

    @Test
    public void getCharsCount_Given_FiveCommasString_Result_Five() {
        String givenString = ",,,,,";
        int expectedValue = 5;
        int actualValue = TextUtils.getCharsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void getCharsCount_Given_RandomFiveCharsString_Result_Five() {
        String givenString = "!@y *";
        int expectedValue = 5;
        int actualValue = TextUtils.getCharsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void getWordsCount_Given_EmptyString_Result_Zero() {
        String[] givenStringWord = {};
        int expectedValue = 0;
        int actualValue = TextUtils.getWordsCount(givenStringWord);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getWordsCount_Given_SixSpacesString_Result_Zero() {
        String givenStringWord = "         ";
        String[] givenStringWordSplit = givenStringWord.split("\\s+");
        int expectedValue = 0;
        int actualValue = TextUtils.getWordsCount(givenStringWordSplit);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getWordsCount_Given_EightCharsString_Result_One() {
        String givenStringWord = "abcdefgh";
        String[] givenStringWordSplit= givenStringWord.split("\\s+");
        int expectedValue = 1;
        int actualValue = TextUtils.getWordsCount(givenStringWordSplit);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getWordsCount_Given_FiveCommasString_Result_Five() {
        String givenStringWord = ",,,,,";
        String[] givenStringWordSplit = givenStringWord.split("\\s+");
        int expectedValue = 5;
        int actualValue = TextUtils.getWordsCount(givenStringWordSplit);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getWordsCount_Given_RandomFiveCharsString_WithSpace_Result_Two() {
        String givenStringWord = "!@y *";
        String[] givenStringWordSplitted = givenStringWord.split("\\s+");
        int expectedValue = 2;
        int actualValue = TextUtils.getWordsCount(givenStringWordSplitted);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getWordsCount_Given_RandomSixCharsStringWithSpaces_Result_Two() {
        String givenStringWord = "random string";
        String[] givenStringWordSplit = givenStringWord.split("\\s+");
        int expectedValue = 2;
        int actualValue = TextUtils.getWordsCount(givenStringWordSplit);

        assertEquals(expectedValue, actualValue);
    }
}