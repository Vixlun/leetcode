package dev.melnik.leetcode;

public class LongSubString {
    public int lengthOfLongestSubstring(String str) {
        int result = 0;
        StringBuilder sb = new StringBuilder(str.length());
        for(char character : str.toCharArray()) {
            sb.append(character);
            int firstMatch = sb.indexOf(String.valueOf(character));
            if (firstMatch != sb.lastIndexOf(String.valueOf(character))) {
                if(result < sb.length()) {
                    result = sb.length() - 1;
                }
                sb = new StringBuilder(sb.substring(firstMatch + 1));
            }
        }
        return Math.max(result, sb.length());
    }
}
