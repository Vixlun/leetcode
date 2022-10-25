package dev.melnik.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int expected = target - current;
            if (map.containsKey(expected)) {
                return new int[]{map.get(expected), i};
            } else {
                map.put(current, i);
            }
        }

        return new int[0];
    }
}