package com.hackerrank.intro;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import static java.text.NumberFormat.getCurrencyInstance;


public class CurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();


        String us = getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);
        String china = getCurrencyInstance(Locale.CHINA).format(payment);
        String france = getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}