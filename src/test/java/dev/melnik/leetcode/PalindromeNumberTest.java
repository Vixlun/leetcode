package dev.melnik.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeNumberTest {
    @Test
    public void example1() {
        PalindromeNumber solution = new PalindromeNumber();

        Assertions.assertTrue(solution.isPalindrome(121));
    }

    @Test
    public void example2() {
        PalindromeNumber solution = new PalindromeNumber();

        Assertions.assertTrue(solution.isPalindrome(0));
    }

    @Test
    public void example3() {
        PalindromeNumber solution = new PalindromeNumber();

        Assertions.assertFalse(solution.isPalindrome(122));
    }


    @Test
    public void example4() {
        PalindromeNumber solution = new PalindromeNumber();

        Assertions.assertFalse(solution.isPalindrome(-121));
    }
}
