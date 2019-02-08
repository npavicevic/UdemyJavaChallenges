package com.challenges;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.*;

public class SimpleChallengesTests {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void areaTest() {
        assertEquals(6.0, SimpleChallenges.area(2,3));
        assertEquals(12.566370614359172, SimpleChallenges.area(2));
    }

    @Test
    public void getDurationStringTest() {
        assertEquals("02h06m36s", SimpleChallenges.getDurationString(126,36));
        assertEquals("Invalid value", SimpleChallenges.getDurationString(126,-1));
        assertEquals("Invalid value", SimpleChallenges.getDurationString(-1,36));
        assertEquals("Invalid value", SimpleChallenges.getDurationString(-1));

    }

    @Test
    public void printYearsAndDaysTest() {
        SimpleChallenges.printYearsAndDays(525600);
        SimpleChallenges.printYearsAndDays(561600);
        SimpleChallenges.printYearsAndDays(-1);
        assertEquals("525600 min = 1 y and 0 d\n" +
                "561600 min = 1 y and 25 d\n" +
                "Invalid Value\n", outContent.toString());
    }

    @Test
    public void printEqualTest() {
        SimpleChallenges.printEqual(1,1,1);
        SimpleChallenges.printEqual(1,1,2);
        SimpleChallenges.printEqual(-1,-1,-1);
        SimpleChallenges.printEqual(1,2,3);
        assertEquals("All numbers are equal\n" +
                "Neither all are equal or different\n" +
                "Invalid Value\n" +
                "All numbers are different\n", outContent.toString());
    }

    @Test
    public void isCatPlayingTest() {
        assertFalse(SimpleChallenges.isCatPlaying(true, 10));
        assertFalse(SimpleChallenges.isCatPlaying(false, 36));
        assertTrue(SimpleChallenges.isCatPlaying(false, 35));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void printDayOfTheWeekTest() {
        SimpleChallenges.printDayOfTheWeek(1);
        SimpleChallenges.printDayOfTheWeek(5);
        SimpleChallenges.printDayOfTheWeek(-1);
        SimpleChallenges.printDayOfTheWeek(7);
        assertEquals("Monday\n" +
                "Friday\n" +
                "Invalid day\n" +
                "Invalid day\n", outContent.toString());
    }

    @Test
    public void printNumberInWordTest() {
        SimpleChallenges.printNumberInWord(1);
        SimpleChallenges.printNumberInWord(9);
        SimpleChallenges.printNumberInWord(-1);
        SimpleChallenges.printNumberInWord(6);
        assertEquals("ONE\n" +
                "NINE\n" +
                "OTHER\n" +
                "SIX\n", outContent.toString());
    }

    @Test
    public void isLeapYearTest() {
        assertFalse(SimpleChallenges.isLeapYear(-1600));
        assertTrue(SimpleChallenges.isLeapYear(1600));
        assertFalse(SimpleChallenges.isLeapYear(2017));
        assertTrue(SimpleChallenges.isLeapYear(2000));
    }

    @Test
    public void getDaysInMonthTest() {
        assertEquals(31, SimpleChallenges.getDaysInMonth(1,2020));
        assertEquals(31, SimpleChallenges.getDaysInMonth(10,2020));
        assertEquals(30, SimpleChallenges.getDaysInMonth(4,2020));
        assertEquals(30, SimpleChallenges.getDaysInMonth(9,2020));
        assertEquals(29, SimpleChallenges.getDaysInMonth(2,2020));
        assertEquals(28, SimpleChallenges.getDaysInMonth(2,2018));
        assertEquals(-1, SimpleChallenges.getDaysInMonth(-1,2018));
        assertEquals(-1, SimpleChallenges.getDaysInMonth(13,2018));
        assertEquals(-1, SimpleChallenges.getDaysInMonth(1,-2018));
        assertEquals(-1, SimpleChallenges.getDaysInMonth(1,10000));
    }

    @Test
    public void printSum3And5Test() {
        SimpleChallenges.printSum3And5();
        assertEquals("15\n" +
                "30\n" +
                "45\n" +
                "60\n" +
                "75\n" +
                "225\n", outContent.toString());
    }

    @Test
    public void isOddTest() {
        assertTrue(SimpleChallenges.isOdd(7));
        assertFalse(SimpleChallenges.isOdd(4));
        assertFalse(SimpleChallenges.isOdd(0));
        assertFalse(SimpleChallenges.isOdd(-1));
    }

    @Test
    public void sumOddTest() {
        assertEquals(2500, SimpleChallenges.sumOdd(1, 100));
        assertEquals(-1, SimpleChallenges.sumOdd(-1, 100));
        assertEquals(0, SimpleChallenges.sumOdd(100, 100));
        assertEquals(-1, SimpleChallenges.sumOdd(100, -100));
        assertEquals(247500, SimpleChallenges.sumOdd(100, 1000));
    }

    @Test
    public void sumDigitsTest() {
        assertEquals(3, SimpleChallenges.sumDigits(12));
        assertEquals(6, SimpleChallenges.sumDigits(123));
        assertEquals(10, SimpleChallenges.sumDigits(1234));
        assertEquals(-1, SimpleChallenges.sumDigits(5));
        assertEquals(-1, SimpleChallenges.sumDigits(-15));
    }

    @Test
    public void isPalindromeTest() {
        assertTrue(SimpleChallenges.isPalindrome(22));
        assertTrue(SimpleChallenges.isPalindrome(11));
        assertTrue(SimpleChallenges.isPalindrome(0));
        assertTrue(SimpleChallenges.isPalindrome(5));
        assertTrue(SimpleChallenges.isPalindrome(-1221));
        assertTrue(SimpleChallenges.isPalindrome(-222));
        assertTrue(SimpleChallenges.isPalindrome(707));
        assertFalse(SimpleChallenges.isPalindrome(11212));
        assertFalse(SimpleChallenges.isPalindrome(1121213412));
    }

    @Test
    public void reverseNumberTest() {
        assertEquals(51, SimpleChallenges.reverseNumber(-15));
        assertEquals(22, SimpleChallenges.reverseNumber(-22));
        assertEquals(11, SimpleChallenges.reverseNumber(11));
        assertEquals(0, SimpleChallenges.reverseNumber(0));
        assertEquals(5, SimpleChallenges.reverseNumber(5));
        assertEquals(707, SimpleChallenges.reverseNumber(707));
        assertEquals(1221, SimpleChallenges.reverseNumber(-1221));
        assertEquals(21211, SimpleChallenges.reverseNumber(11212));
        assertEquals(2143121211, SimpleChallenges.reverseNumber(1121213412));
    }

    @Test
    public void sumFirstAndLastDigitTest() {
        assertEquals(8, SimpleChallenges.sumFirstAndLastDigit(2136));
        assertEquals(9, SimpleChallenges.sumFirstAndLastDigit(257));
        assertEquals(18, SimpleChallenges.sumFirstAndLastDigit(99));
        assertEquals(0, SimpleChallenges.sumFirstAndLastDigit(0));
        assertEquals(10, SimpleChallenges.sumFirstAndLastDigit(5));
        assertEquals(-1, SimpleChallenges.sumFirstAndLastDigit(-10));
    }

    @Test
    public void getFirstNumberTest() {
        assertEquals(1, SimpleChallenges.getFirstDigit(123));
        assertEquals(3, SimpleChallenges.getFirstDigit(321));
        assertEquals(2, SimpleChallenges.getFirstDigit(2));
        assertEquals(0, SimpleChallenges.getFirstDigit(0));
        assertEquals(4, SimpleChallenges.getFirstDigit(-431));
    }

    @Test
    public void hasSharedDigitTest() {
        assertTrue(SimpleChallenges.hasSharedDigit(12,23));
        assertFalse(SimpleChallenges.hasSharedDigit(9,99));
        assertFalse(SimpleChallenges.hasSharedDigit(109,99));
        assertFalse(SimpleChallenges.hasSharedDigit(32,103));
        assertFalse(SimpleChallenges.hasSharedDigit(32,3));
        assertTrue(SimpleChallenges.hasSharedDigit(15,55));
        assertFalse(SimpleChallenges.hasSharedDigit(34,12));
    }

    @Test
    public void hasSameLastDigitTest() {
        assertFalse(SimpleChallenges.hasSameLastDigit(9,99,999));
        assertTrue(SimpleChallenges.hasSameLastDigit(41,22,71));
        assertTrue(SimpleChallenges.hasSameLastDigit(23,32,42));
    }

    @Test
    public void getGreatestCommonDivisorTest() {
        assertEquals(5, SimpleChallenges.getGreatestCommonDivisor(25,15));
        assertEquals(6, SimpleChallenges.getGreatestCommonDivisor(12,30));
        assertEquals(-1, SimpleChallenges.getGreatestCommonDivisor(9,18));
        assertEquals(9, SimpleChallenges.getGreatestCommonDivisor(81,153));
        assertEquals(10, SimpleChallenges.getGreatestCommonDivisor(1010,10));
    }

    @Test
    public void printFactorsTest() {
        SimpleChallenges.printFactors(6);
        SimpleChallenges.printFactors(32);
        SimpleChallenges.printFactors(10);
        SimpleChallenges.printFactors(-1);
        assertEquals("1 2 3 6 \n" +
                "1 2 4 8 16 32 \n" +
                "1 2 5 10 \n" +
                "Invalid Value\n", outContent.toString());
    }

    @Test
    public void isPerfectNumberTest() {
        assertTrue(SimpleChallenges.isPerfectNumber(6));
        assertTrue(SimpleChallenges.isPerfectNumber(28));
        assertFalse(SimpleChallenges.isPerfectNumber(5));
        assertFalse(SimpleChallenges.isPerfectNumber(-1));
    }

    @Test
    public void getDigitCountTest() {
        assertEquals(3, SimpleChallenges.getDigitCount(153));
        assertEquals(-1, SimpleChallenges.getDigitCount(-4638));
        assertEquals(4, SimpleChallenges.getDigitCount(4638));
        assertEquals(1, SimpleChallenges.getDigitCount(0));
        assertEquals(1, SimpleChallenges.getDigitCount(5));
        assertEquals(2, SimpleChallenges.getDigitCount(32));
    }

    @Test
    public void numberToWordsTest() {
        SimpleChallenges.numberToWords(123);
        SimpleChallenges.numberToWords(1010);
        SimpleChallenges.numberToWords(1000);
        SimpleChallenges.numberToWords(-12);
        assertEquals("One Two Three " +
                "One Zero One Zero " +
                "One Zero Zero Zero " +
                "Invalid Value", outContent.toString());
    }

    @Test
    public void getEvenDigitSumTest() {
        assertEquals(20, SimpleChallenges.getEvenDigitSum(123456789));
        assertEquals(4, SimpleChallenges.getEvenDigitSum(252));
        assertEquals(-1, SimpleChallenges.getEvenDigitSum(-22));
    }

    @Test
    public void canPackTest() {
        assertFalse(SimpleChallenges.canPack(1, 0 ,6));
        assertFalse(SimpleChallenges.canPack(1, 0 ,4));
        assertFalse(SimpleChallenges.canPack(-3, 2 ,12));
        assertTrue(SimpleChallenges.canPack(1, 0 ,5));
        assertTrue(SimpleChallenges.canPack(0, 5 ,4));
        assertTrue(SimpleChallenges.canPack(2, 2 ,12));
        assertTrue(SimpleChallenges.canPack(2, 10 ,18));
    }

    @Test
    public void getLargestPrime() {
        assertEquals(7, SimpleChallenges.getLargestPrime(21));
        assertEquals(31, SimpleChallenges.getLargestPrime(217));
        assertEquals(-1, SimpleChallenges.getLargestPrime(0));
        assertEquals(5, SimpleChallenges.getLargestPrime(45));
        assertEquals(-1, SimpleChallenges.getLargestPrime(-1));
    }

    @Test
    public void printSquareStarTest() {
        SimpleChallenges.printSquareStar(5);
        SimpleChallenges.printSquareStar(3);
        SimpleChallenges.printSquareStar(8);
        SimpleChallenges.printSquareStar(-5);
        assertEquals("*****\n" +
                "** **\n" +
                "* * *\n" +
                "** **\n" +
                "*****\n" +
                "Invalid Value\n" +
                "********\n" +
                "**    **\n" +
                "* *  * *\n" +
                "*  **  *\n" +
                "*  **  *\n" +
                "* *  * *\n" +
                "**    **\n" +
                "********\n" +
                "Invalid Value\n", outContent.toString());
    }

    @Test
    public void toMilesPerHourTest() {
        assertEquals(0.9322560596643878, SimpleChallenges.toMilesPerHour(1.5));
        assertEquals(6.37041640770665, SimpleChallenges.toMilesPerHour(10.25));
        assertEquals(-1.0, SimpleChallenges.toMilesPerHour(-5.6));
        assertEquals(15.798632691112493, SimpleChallenges.toMilesPerHour(25.42));
        assertEquals(46.68365444375389, SimpleChallenges.toMilesPerHour(75.114));
    }

    @Test
    public void printConversionTest() {
        SimpleChallenges.printConversion(1.5);
        SimpleChallenges.printConversion(10.25);
        SimpleChallenges.printConversion(-5.6);
        SimpleChallenges.printConversion(25.42);
        SimpleChallenges.printConversion(75.114);
        assertEquals("1.5 km/h = 0.9322560596643878 mi/h\n" +
                "10.25 km/h = 6.37041640770665 mi/h\n" +
                "Invalid Value\n" +
                "25.42 km/h = 15.798632691112493 mi/h\n" +
                "75.114 km/h = 46.68365444375389 mi/h\n", outContent.toString());
    }

    @Test
    public void inputThenPrintSumAndAverageTest() {
        String input = "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "a";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        SimpleChallenges.inputThenPrintSumAndAverage();

        assertEquals("SUM = 15 AVG = 3.000000\n", outContent.toString());
    }

    @Test
    public void getBucketCountTest() {
        assertEquals(-1, SimpleChallenges.getBucketCount(-3.4, 2.1, 1.5, 2));
        assertEquals(-1, SimpleChallenges.getBucketCount(3.4, -2.1, 1.5, 2));
        assertEquals(-1, SimpleChallenges.getBucketCount(3.4, 2.1, -1.5, 2));
        assertEquals(-1, SimpleChallenges.getBucketCount(3.4, 2.1, 1.5, -2));
        assertEquals(3, SimpleChallenges.getBucketCount(3.4, 2.1, 1.5, 2));
        assertEquals(3, SimpleChallenges.getBucketCount(2.75, 3.25, 2.5, 1));

        assertEquals(-1, SimpleChallenges.getBucketCount(-3.4, 2.1, 1.5));
        assertEquals(-1, SimpleChallenges.getBucketCount(3.4, -2.1, 1.5));
        assertEquals(-1, SimpleChallenges.getBucketCount(3.4, 2.1, -1.5));
        assertEquals(5, SimpleChallenges.getBucketCount(3.4, 2.1, 1.5));
        assertEquals(14, SimpleChallenges.getBucketCount(7.25, 4.3, 2.35));

        assertEquals(-1, SimpleChallenges.getBucketCount(-3.4, 2.1));
        assertEquals(-1, SimpleChallenges.getBucketCount(3.4, -2.1));
        assertEquals(3, SimpleChallenges.getBucketCount(3.4, 1.5));
        assertEquals(3, SimpleChallenges.getBucketCount(6.26, 2.2));
        assertEquals(5, SimpleChallenges.getBucketCount(3.26, 0.75));

    }
}
