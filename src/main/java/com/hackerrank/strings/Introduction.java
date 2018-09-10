package com.hackerrank.strings;

import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String B = scan.next();
        scan.close();

        System.out.println(A.length() + B.length());

        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");

        System.out.println(doBigFirstLetter(A) + " " + doBigFirstLetter(B));
    }

    private static String doBigFirstLetter(String str) {
        if (str == null || str.length() == 0) {
            return "";
        } else {
            return str.substring(0,1).toUpperCase() + str.substring(1);
        }
    }
}