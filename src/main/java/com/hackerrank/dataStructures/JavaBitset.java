package com.hackerrank.dataStructures;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitset {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lengthBitsets = scan.nextInt();
        int numOfOperations = scan.nextInt();
        BitSet b1 = new BitSet(lengthBitsets);
        BitSet b2 = new BitSet(lengthBitsets);


        for (int i = 0; i < numOfOperations; i++) {
            String operation = scan.next();
            int b1Orb2 = scan.nextInt();
            int setOrIndex = scan.nextInt();
            if (operation.equals("AND")) {
                if (b1Orb2 == 1) {
                    b1.and(b2);
                }else {
                    b2.and(b1);
                }
            }
            if (operation.equals("XOR")) {
                if (b1Orb2 == 1) {
                    b1.xor(b2);
                }else {
                    b2.xor(b1);
                }
            }
            if (operation.equals("OR")) {
                if (b1Orb2 == 1) {
                    b1.or(b2);
                }else {
                    b2.or(b1);
                }
            }
            if (operation.equals("SET")) {
                if (b1Orb2 == 1) {
                    b1.set(setOrIndex);
                }else {
                    b2.set(setOrIndex);
                }
            }
            if (operation.equals("FLIP")) {
                if (b1Orb2 == 1) {
                    b1.flip(setOrIndex);
                }else {
                    b2.flip(setOrIndex);
                }
            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
    }
}