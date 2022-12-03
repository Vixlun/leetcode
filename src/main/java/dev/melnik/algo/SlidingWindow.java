package dev.melnik.algo;

public class SlidingWindow {
    public static int maxSumSubArray(int[] arr, int k) {
        int windowStart = 0, windowSum = 0;
        int maxSum = 0;
        for(int i = 0; i < arr.length; i++) {
            windowSum += arr[i];
            if(i >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return maxSum;
    }

    public static int findMinSizeOfSubArray(int[] arr, int sum) {
        int minLength = Integer.MAX_VALUE, windowStart = 0;
        int windowSum = 0;
        for (int i = 0; i < arr.length; i++) {
            windowSum += arr[i];

            while (windowSum >= sum) {
                minLength = Math.min(minLength, i - windowStart + 1);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }



    public static void main(String[] args) {
        System.out.println("Max sum " + maxSumSubArray(new int[] {2, 1, 5, 1, 3, 2}, 3));
        System.out.println("Max sum " + maxSumSubArray(new int[] {2, 3, 4, 1, 5}, 2));
        System.out.println("Min size " + findMinSizeOfSubArray(new int[] {2, 1, 5, 2, 3, 2}, 7));
        System.out.println("Min size " + findMinSizeOfSubArray(new int[] {2, 1, 5, 2, 8}, 7));
        System.out.println("Min size " + findMinSizeOfSubArray(new int[] {3, 4, 1, 1, 6}, 8));
    }
}
