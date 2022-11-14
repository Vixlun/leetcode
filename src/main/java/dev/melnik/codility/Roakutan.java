package dev.melnik.codility;

public class Roakutan {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestDiverseString(1, 1, 7 ));
    }
}

class Solution {
    public String longestDiverseString(int a, int b, int c) {
        return generate(a, b, c, "a", "b", "c");
    }
    private String generate(int a, int b, int c, String aStr, String bStr, String cStr) {
        if(a < b) return generate(b, a, c, bStr, aStr, cStr);
        if(b < c) return generate(a, c, b, aStr, cStr, bStr);
        if(b == 0) return aStr.repeat(Math.min(2, a));
        int aCount = Math.min(2, a);
        int bCount = a - aCount >= b ? 1 : 0;

        return aStr.repeat(aCount) + bStr.repeat(bCount)
                + generate(a - aCount, b - bCount, c, aStr, bStr, cStr);
    }
}
