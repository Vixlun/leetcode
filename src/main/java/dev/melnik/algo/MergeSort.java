package dev.melnik.algo;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] testArr = new int[] { 3, 1, 2, 0, 5, 4, 6};
        sort(testArr);
        System.out.println("Result: " + Arrays.toString(testArr));
    }

    public static void sort(int[] array) {
        int[] additionalArray = new int[array.length];
        sort(array, additionalArray, 0, array.length - 1);
    }

    private static void sort(int[] array, int[] additionalArray, int lo, int hi) {
        if(lo >= hi) return;
        int mid = lo + (hi - lo)/2;
        sort(array, additionalArray, lo, mid);
        sort(array, additionalArray, mid + 1, hi);
        merge(array, additionalArray, lo, mid, hi);
    }

    private static void merge(int[] array, int[] additionalArray, int lo, int mid, int hi) {
        for(int k = lo; k <= hi; k++) {
            additionalArray[k] = array[k];
        }

        int i = lo;
        int j = mid + 1;
        for(int k = lo; k <= hi; k++) {
            if (i > mid) {
                array[k] = additionalArray[j++];
            } else if (j > hi) {
                array[k] = additionalArray[i++];
            } else if (additionalArray[i] < additionalArray[j]) {
                array[k] = additionalArray[i++];
            } else {
                array[k] = additionalArray[j++];
            }
        }
    }
}
