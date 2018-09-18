package com.hackerrank.dataStructures;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ArrayListProblem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nLines = scan.nextInt();
        String rows;
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>(nLines);
        Pattern pattern = Pattern.compile(" ");

        scan.nextLine();

        for(int i=0; i<nLines; i++) {
            rows = scan.nextLine();
            lines.add(pattern.splitAsStream(rows)
                    .skip(1)
                    .map(Integer::valueOf)
                    .collect(Collectors.toCollection(ArrayList::new)));
        }

        int nQuery = scan.nextInt();
        scan.nextLine();
        for(int i=0; i<nQuery; i++) {
            int lineRow = scan.nextInt();
            int lineColumn = scan.nextInt();

            if(lines.get(lineRow-1).size()<lineColumn){
                System.out.println("ERROR!");
            } else {
                System.out.println(lines.get(lineRow-1).get(lineColumn-1));
            }
        }
        scan.close();

    }
}
