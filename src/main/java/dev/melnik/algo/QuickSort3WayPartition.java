package dev.melnik.algo;

import java.util.Arrays;

public class QuickSort3WayPartition {
    public static void main(String[] args) {
        int[] testArr = {5, 1, 1, 1, 4, 1, 2, 6};
        sort(testArr);
        System.out.println("Result " + Arrays.toString(testArr));
    }

    public static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }
//  lo |  < v | lt  (= v) gt | >v hi
    private static void sort(int[] arr, int lo, int hi) {
        if(lo >= hi) return;
        int v = arr[lo];
        int i = lo;
        int lt = lo;
        int gt = hi;
        while (i <= gt) {
            if(v > arr[i]) {
                swap(arr, lt++, i++);
            } else if (v < arr[i]) {
                swap(arr, i, gt--);
            } else {
                i++;
            }
        }

        sort(arr, lo, lt - 1);
        sort(arr, gt + 1, hi);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
