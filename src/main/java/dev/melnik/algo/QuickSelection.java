package dev.melnik.algo;

import java.util.Arrays;

/**
 * How to find MAX k-th element?
 */
public class QuickSelection {

    public static void main(String[] args) {
        int K = 0;
        int[] testArr = {3, 1, 2, 8, 4, 6, 7, 0};

        System.out.println("Result: " + K + " element: " + quickSelection(testArr, K));
        Arrays.sort(testArr);
        System.out.println("Result: " + Arrays.toString(testArr));
    }

    public static int quickSelection(int[] arr, int k) {
        int lo = 0;
        int hi = arr.length - 1;
        while (hi > lo) {
            int j = partition(arr, lo, hi);
            if(j < k) {
                lo = j + 1;
            } else if (j > k) {
                hi = j - 1;
            } else {
                return arr[k];
            }
        }
        return arr[k];
    }

    private static int partition(int[] arr, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        while (true) {
            while (arr[++i] < arr[lo]) if (i == hi) break;
            while (arr[--j] > arr[lo]) if (j == lo) break;
            if (i >= j) break;
            exch(arr, i, j);
        }
        exch(arr, lo, j);
        return j;
    }

    private static void exch(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
