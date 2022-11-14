package dev.melnik.codility;

import java.util.Arrays;
import java.util.TreeSet;

public class PayPay {

    public static void main(String[] args) {
        System.out.println(resetPassword("aabbbd"));
    }

    public static String resetPassword(String password) {
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, 0);
        for(char currentChar : password.toCharArray()) {
            alphabet[currentChar - 'a'] += 1;
        }

        TreeSet<Integer> oddElements = new TreeSet<>();
        for(int i = 0; i < alphabet.length; i++) {
            if((alphabet[i] % 2) == 1) oddElements.add(i);
        }

        while(oddElements.size() > 1) {
            int firstElement = oddElements.first();
            int lastElement = oddElements.last();
            alphabet[firstElement] += 1;
            alphabet[lastElement] -= 1;
            oddElements.remove(firstElement);
            oddElements.remove(lastElement);
        }

        StringBuilder sb = new StringBuilder(password.length());
        for(int i = 0; i < alphabet.length; i++) {
            int count = alphabet[i];
            if(count % 2 == 0) sb.insert(sb.length()/2, String.valueOf((char)('a' + i)).repeat(count));
        }

        if(!oddElements.isEmpty()) {
            int index = oddElements.first();
            sb.insert((sb.length()/2), String.valueOf((char)('a' + index)).repeat(alphabet[index]));
        }

        return sb.toString();
    }
}
