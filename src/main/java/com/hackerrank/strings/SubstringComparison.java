package com.hackerrank.strings;

import java.util.Scanner;

public class SubstringComparison {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        for (int i = 0; i <= s.length() - k; i++) {
            String first = s.substring(i, i + k);
            if (first.compareTo(smallest) < 0 || smallest.isEmpty()) {
                smallest = first;
            }
            if (first.compareTo(largest) > 0 || largest.isEmpty()) {
                largest = first;
            }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}