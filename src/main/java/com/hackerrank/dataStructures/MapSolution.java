package com.hackerrank.dataStructures;

import java.util.Scanner;
import java.util.TreeMap;

class MapSolution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        TreeMap<String,Integer> phoneBook = new TreeMap<>();
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            phoneBook.put(name,phone);
            in.nextLine();
        }
        while (in.hasNext()) {
            String personName = in.nextLine();
            if(phoneBook.containsKey(personName)){
                System.out.println(personName + "=" + phoneBook.get(personName));
            }else {
                System.out.println("Not found");
            }
        }
    }
}