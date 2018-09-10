package com.hackerrank.strings;

import java.util.Scanner;

public class ReverseProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();

        StringBuilder sb = new StringBuilder();
        sb.append(A);
        sb.reverse();
        String B = sb.toString();

        if (A.equals(B)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}


