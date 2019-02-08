package com.challenges;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SimpleChallenges {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
    }

    public static String getDurationString(int mins, int secs) {
        if(mins < 0 || (secs < 0 || secs > 59 )){
            return INVALID_VALUE_MESSAGE;
        }
        int hh, mm;
        hh = Math.floorDiv(mins, 60);
        mm = Math.floorMod(mins, 60);
        return String.format("%02d",hh) + "h" + String.format("%02d",mm) + "m" + String.format("%02d",secs) +"s";
    }

    public static String getDurationString(int secs) {
        if(secs < 0){
            return INVALID_VALUE_MESSAGE;
        }
        int mm, ss;
        ss = Math.floorMod(secs, 60);
        mm = Math.floorDiv(secs, 60);
        return getDurationString(mm, ss);
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        return Math.pow(radius, 2)* Math.PI;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }
        return x * y;
    }

    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hours = Math.floorDiv(minutes, 60);
            long days = Math.floorDiv(hours, 24);
            long years = Math.floorDiv(days, 365);
            days = Math.floorMod(days, 365);
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }

    public static void printEqual(int p1, int p2, int p3) {
        if (p1 < 0 || p2 < 0 || p3 < 0) {
            System.out.println("Invalid Value");
        } else {
            if (p1 == p2) {
                if (p2 == p3) {
                    System.out.println("All numbers are equal");
                } else {
                    System.out.println("Neither all are equal or different");
                }
            } else {
                if (p2 == p3) {
                    System.out.println("Neither all are equal or different");
                } else {
                    if (p1 == p3) {
                        System.out.println("Neither all are equal or different");
                    } else {
                        System.out.println("All numbers are different");
                    }
                }
            }
        }
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            return temperature > 24 && temperature < 46;
        } else {
            return temperature > 24 && temperature < 36;
        }
    }

    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    public static void printNumberInWord(int number) {
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        return ((Math.floorMod(year,4) == 0 && Math.floorMod(year, 100) != 0) || Math.floorMod(year, 400) == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
        if (month == 2) {
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        }
        if ((month <= 7 && Math.floorMod(month,2) == 0) || (month > 7 && Math.floorMod(month,2) != 0)) {
            return 30;
        } else {
            return 31;
        }
    }

    public static void printSum3And5() {
        int sum = 0;
        for (int i = 1, j = 0; i <= 1000 && j < 5; i++) {
            if (Math.floorMod(i, 3) == 0 && Math.floorMod(i, 5) == 0) {
                System.out.println(i);
                j++;
                sum+=i;
            }
        }
        System.out.println(sum);
    }

    public static boolean isOdd(int number) {
        if (number < 1) {
            return false;
        }
        return Math.floorMod(number, 2) != 0;
    }

    public static int sumOdd(int start, int end) {
        if (start < 1 || end < 1 ||start > end) {
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if(isOdd(i)) {
                sum+=i;
            }
        }
        return sum;
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;
        do {
            sum += Math.floorMod(number, 10);
            number = Math.floorDiv(number, 10);
        } while (number > 0);

        return sum;
    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        return number == reverseNumber(number);
    }


    public static int reverseNumber(int original) {
        original = Math.abs(original);
        int reversed = 0;
        while (original > 0) {
            int digit = original % 10;
            reversed = reversed * 10 + digit;
            original = original / 10;
        }
        return reversed;
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        return number%10 + getFirstDigit(number);
    }

    public static int getFirstDigit(int number) {
        number = Math.abs(number);
        int firstDigit = 0;
        while (number > 0) {
            firstDigit = number % 10;
            number = number / 10;
        }
        return firstDigit;
    }

    public static boolean hasSharedDigit(int p1, int p2) {
        if (p1 < 10 || p1 > 99 || p2 < 10 || p2 > 99) {
            return false;
        }
        return p1/10 == p2/10 || p1%10 == p2/10 || p1/10 == p2%10 || p1%10 == p2%10;
    }

    public static boolean hasSameLastDigit(int p1, int p2, int p3) {
        if (p1 < 10 || p2 < 10 || p3 < 10 || p1 > 1000 || p2 > 1000 || p3 > 1000) {
            return false;
        }
        return p1%10 == p2%10 || p1%10 == p3%10 || p2%10 == p3%10;
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int gcd = 0;
        for (int i = 1; i <= first && i <= second; i++) {
            if (first%i == 0 && second%i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.print("Invalid Value");
        }
        for (int i = 1; i <= number; i++) {
            if (number%i == 0) {
                System.out.print(i+" ");
            }
        }
        System.out.print("\n");
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number%i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.print("Invalid Value");
            return;
        }
        int reverseNumber = reverseNumber(number);
        while (reverseNumber > 0) {
            switch (reverseNumber%10) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }
            reverseNumber /= 10;
        }
        if (getDigitCount(reverseNumber(number)) != getDigitCount(number)) {
            for (int i = 0; i < (getDigitCount(number) - getDigitCount(reverseNumber(number))); i++) {
                System.out.print("Zero ");
            }
        }
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        return String.valueOf(number).length();
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            if((number%10)%2 == 0) {
                sum += number%10;
            }
            number/=10;
        }
        return sum;
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if (bigCount*5 > goal) {
            return ((goal%(bigCount*5))%5 == 0 || (goal%(bigCount*5))%5 <= smallCount);

        } else {
            return (smallCount >= goal || bigCount*5+smallCount >= goal);
        }
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        int largestPrime = 2;
        while (largestPrime <= number) {
            if (number % largestPrime == 0) {
                number /= largestPrime;
                largestPrime--;
            }
            largestPrime++;
        }
        return largestPrime;
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 1; i < number - 1; i++) {
            System.out.print("*");
            for (int j = 1; j < number - 1; j++) {
                if (j == i || j == number - 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("*");
        }

        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static double toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return kilometersPerHour / 1.609;
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }
        System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (scanner.hasNextInt()) {
            sum+=scanner.nextInt();
            count++;
            scanner.nextLine();
        }
        if (count > 0) {
            System.out.println("SUM = " + sum + " AVG = " + new DecimalFormat("#0.000000").format((double)sum/(double)count));
        } else {
            System.out.println("SUM = " + sum + " AVG = " + new DecimalFormat("#0.000000").format(count));
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        if ((width * height) > (areaPerBucket * extraBuckets)) {
            return (int) Math.ceil(((width * height) - (areaPerBucket * extraBuckets)) / areaPerBucket);
        } else {
            return 0;
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        return (int) Math.ceil((width * height) / areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        return (int) Math.ceil(area / areaPerBucket);
    }
}