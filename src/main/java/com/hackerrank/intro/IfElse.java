package com.hackerrank.intro;

import java.util.Scanner;

public class IfElse {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String str = "";
        if (N % 2 == 1) {
            str = "Weird";
        } else {
            if (N >= 6 && N <= 20) {
                str = "Weird";
            } else {
                str = "Not Weird";
            }
        }
        System.out.println(str);

        scanner.close();
    }
}

