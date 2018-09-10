package com.hackerrank.strings;


import java.util.Scanner;

public class Anagrams {
    static boolean isAnagram(String a, String b) {

        a = a.toLowerCase();
        b = b.toLowerCase();

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            int counta = 1;
            int countb = 0;
            if ('.' != ch) {
                for (int j = i + 1; j < a.length(); j++) {
                    if (ch == a.charAt(j)) {
                        counta++;
                    }
                }
                for (int k = 0; k < b.length(); k++) {
                    if (ch == b.charAt(k)) {
                        countb++;
                    }
                }
                if (counta != countb) {
                    return false;
                }
            }
            a = a.replaceAll(String.valueOf(ch), ".");
            b = b.replaceAll(String.valueOf(ch), ".");
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
