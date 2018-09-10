package com.hackerrank.strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringTokens {

    public static final String REGEX = "[^0-9A-Za-z]";

    public static void splitter(String s) {
        String[] tokens = Arrays.stream(s.split(REGEX))
                .filter(item -> !item.isEmpty())
                .map(String::trim)
                .toArray(String[]::new);

        System.out.println(tokens.length);


        for (int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        splitter(s);
        scan.close();
    }
}