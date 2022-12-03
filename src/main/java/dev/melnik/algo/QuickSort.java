package dev.melnik.algo;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] testArr = {3, 1, 2, 8, 4, 6, 7, 0};
        sort(testArr);
        System.out.println("Result: " + Arrays.toString(testArr));
    }

    public static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public static void sort(int[] arr, int lo, int hi) {
        if (lo >= hi) return;
        int k = partition(arr, lo, hi);
        sort(arr, lo, k - 1);
        sort(arr, k + 1, hi);
    }

    public static int partition(int[] arr, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        while (true) {
            while (arr[++i] < arr[lo]) if(i == hi) break;
            while (arr[--j] > arr[lo]) if(j == lo) break;
            if(i >= j) break;
            swap(arr, i, j);
        }

        swap(arr, lo, j);
        return j;
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
    }

}
