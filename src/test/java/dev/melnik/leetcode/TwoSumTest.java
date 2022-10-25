package dev.melnik.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {
    /*
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        Example 2:

        Input: nums = [3,2,4], target = 6
        Output: [1,2]
        Example 3:

        Input: nums = [3,3], target = 6
        Output: [0,1]
    */
    @Test
    public void example1() {
        TwoSum solution = new TwoSum();
        int[] nums = new int[] {2,7,11,15};
        int target = 9;
        Assertions.assertArrayEquals(new int[]{0, 1}, solution.twoSum(nums, target));
    }

    @Test
    public void example2() {
        TwoSum solution = new TwoSum();
        int[] nums = new int[] {3, 2, 4};
        int target = 6;
        Assertions.assertArrayEquals(new int[]{1, 2}, solution.twoSum(nums, target));
    }

    @Test
    public void example3() {
        TwoSum solution = new TwoSum();
        int[] nums = new int[] {3, 3};
        int target = 6;
        Assertions.assertArrayEquals(new int[]{0, 1}, solution.twoSum(nums, target));
    }


    @Test
    public void example4() {
        TwoSum solution = new TwoSum();
        int[] nums = new int[] {3, 4, 8};
        int target = 9;
        Assertions.assertArrayEquals(new int[]{}, solution.twoSum(nums, target));
    }
}
