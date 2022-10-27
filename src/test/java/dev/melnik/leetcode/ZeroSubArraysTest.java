package dev.melnik.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ZeroSubArraysTest {

    @Test
    public void example1() {
        ZeroSubArrays solution = new ZeroSubArrays();
        int[] input = new int[] {0, 0, 0, 2, 0, 0};

        Assertions.assertEquals(9, solution.countOfZeroSubArrays(input));
    }
}
