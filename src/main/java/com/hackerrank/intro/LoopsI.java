package com.hackerrank.intro;

import java.util.Scanner;

public class LoopsI {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d x %d = %d%n", N, i, i * N);
        }
        scanner.close();
    }
}