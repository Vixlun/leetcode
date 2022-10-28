package dev.melnik.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongSubStringTest {
/*
    Example 1:

    Input: s = "abcabcbb"
    Output: 3
    Explanation: The answer is "abc", with the length of 3.
    Example 2:

    Input: s = "bbbbb"
    Output: 1
    Explanation: The answer is "b", with the length of 1.
    Example 3:

    Input: s = "pwwkew"
    Output: 3
    Explanation: The answer is "wke", with the length of 3.
    Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

    @Test
    public void example1() {
        LongSubString solution = new LongSubString();
        Assertions.assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void example2() {
        LongSubString solution = new LongSubString();
        Assertions.assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void example3() {
        LongSubString solution = new LongSubString();
        Assertions.assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void example4() {
        LongSubString solution = new LongSubString();
        Assertions.assertEquals(1, solution.lengthOfLongestSubstring(" "));
    }

}
