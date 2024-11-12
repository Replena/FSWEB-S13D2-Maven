package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int number) {
        if (number < 0) number = -number;

        int base = number;
        int reversed = 0;

        while (number > 0) {
            int last = number % 10;
            reversed = reversed * 10 + last;
            number /= 10;
        }

        return base == reversed;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        String[] numberWords = {"Zero", "One", "Two", "Three", "Four", "Five",
                "Six", "Seven", "Eight", "Nine"};
        String words = "";

        for (char digitChar : Integer.toString(number).toCharArray()) {
            int digit = Character.getNumericValue(digitChar);
            words += numberWords[digit] + " ";
        }

        return words.trim();
    }

}
