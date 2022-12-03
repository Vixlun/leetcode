package dev.melnik.pramp;

public class DecryptMessage {
    public static String decrypt(String word) {
        char[] encrypted = word.toCharArray();
        char[] result = new char[encrypted.length];
        for (int i = 0; i < encrypted.length; i++) {
            int currentCh = encrypted[i];
            if(i==0) {
                currentCh -= 1;
            } else {
                currentCh -= encrypted[i-1];
            }

            while(currentCh < (int) 'a') {
                currentCh += 26;
            }

            result[i] = (char) currentCh;
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        System.out.println("Result " + decrypt("dnotq"));
        System.out.println("Result " + decrypt("flgxswdliefy"));
    }

}
