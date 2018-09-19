package com.hackerrank.dataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class JavaList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pattern pattern = Pattern.compile(" ");
        int length = scan.nextInt();
        String rows;

        List<Integer> arrList;
        scan.nextLine();
        rows = scan.nextLine();
        arrList = (pattern.splitAsStream(rows)
                .map(Integer::valueOf)
                .collect(Collectors.toCollection(ArrayList::new)));

        int queries = scan.nextInt();


        for (int i = 0; i < queries; i++) {
            scan.nextLine();
            String queryType = scan.nextLine();
            if (queryType.equals("Insert")) {
                int x = scan.nextInt();
                int y = scan.nextInt();
                arrList.add(x, y);
            } else if (queryType.equals("Delete")) {
                int z = scan.nextInt();
                arrList.remove(z);
            }
        }


        arrList.forEach(result -> System.out.print(result + " "));

    }
}

