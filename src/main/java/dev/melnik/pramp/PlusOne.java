package dev.melnik.pramp;

import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int extra = 0;
        int N = digits.length;
        digits[N - 1] += 1;
        for(int i = N - 1; i >= 0; i--) {
            if(extra == 1) {
                digits[i] += 1;
            }

            if(digits[i] > 9) {
                extra = 1;
                digits[i] = 0;
            } else {
                return digits;
            }
        }

        int[] extraDigit = new int[N + 1];
        extraDigit[0] = 1;
        int incr = 0;
        for(int current : digits) {
            extraDigit[++incr] = current;
        }
        return extraDigit;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + Arrays.toString(plusOne(new int[] {9})));
        System.out.println("Result: " + Arrays.toString(plusOne(new int[] {1,2,3})));
        System.out.println("Result: " + Arrays.toString(plusOne(new int[] {9,8,7,6,5,4,3,2,1,0})));
    }
}
