package dev.melnik.leetcode;

public class PalindromeNumber {
    /*
    Given an integer x, return true if x is palindrome integer.
    An integer is a palindrome when it reads the same backward as forward.
    For example, 121 is a palindrome while 123 is not.
     */

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10) return true;
        int result = 0;
        int temp = x;
        while(temp >= 10) {
            result += temp % 10;
            temp /= 10;
            result *= 10;
        }
        result += temp;
        return  result == x;
    }
}
