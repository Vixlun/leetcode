package dev.melnik.algo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class QuickSortTest {

    @Test
    public void sortingTest() {
        int[] arr = new int[] {3, 2, 1, 4, 7};
        QuickSort.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
