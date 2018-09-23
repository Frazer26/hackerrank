package com.hackerrank.dataStructures;

import java.util.Scanner;

public class JavaStackSecondSolution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String expression = scan.next();
            System.out.println(balanced(expression) ? "true" : "false");
        }
        scan.close();
    }

    private static boolean balanced(String input) {
        return input.chars().mapToDouble(i -> i == '(' || i == '{' || i == '[' ? 1 :
                i == ')' || i == '}' || i == ']' ? -1 : 0).reduce(0,
                (a, b) -> a == 0 && b == -1 ? Double.NaN : a + b) == 0;
    }

}
