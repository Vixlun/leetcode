package dev.melnik.leetcode;

import java.util.stream.LongStream;

public class ZeroSubArrays {
    /*
    Given an integer array nums, return the number of subarrays filled with 0.
    A subarray is a contiguous non-empty sequence of elements within an array.

    Input: nums = [0,0,0,2,0,0]
    Output: 9
    Explanation:
    There are 5 occurrences of [0] as a subarray.
    There are 3 occurrences of [0,0] as a subarray.
    There is 1 occurrence of [0,0,0] as a subarray.
    There is no occurrence of a subarray with a size more than 3 filled with 0. Therefore, we return 9.
     */

    public long countOfZeroSubArrays(int[] input) {
        int count = 0;
        long result = 0;
        for(int currentValue : input) {
            if(currentValue == 0) {
                count++;
            } else {
                result += LongStream.range(1, count + 1).sum();
                count = 0;
            }
        }
        result += LongStream.range(1, count + 1).reduce(0, Long::sum);
        return result;
    }
}
