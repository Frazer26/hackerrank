package com.hackerrank.dataStructures;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class NegativeSubArray {

    public static int negativeSums(int[] nums) {
        int sum = 0;
        int count = 1;
        int limit = nums.length;
        int chunks = 1;

//   EXAMPLE:
//        1 |-2 |4 |-5 |1                   ha chunk = 1 limit = 5
//        1 -2 | -2 4 | 4 -5| -5 1			chunk = 2 limit = 4
//        1 -2 4| -2 4 -5| 4 -5 1              chunk= 3  limit = 3
//        1 -2 4 -5| -2 4 -5 1				chunk= 4  limit = 2
//        1 -2 4 -5 1							chunk= 5  limit = 1

        while (count!=nums.length+1) {
            int[][] chunksArray = chunkArray(nums, limit, chunks);
            for (int row = 0; row < chunksArray.length; row++) {
                int temp=0;
                for (int column = 0; column < chunksArray[row].length; column++) {
                    temp+= chunksArray[row][column];
                }
                if(temp<0){
                    sum++;
                }
            }
            --limit;
            ++chunks;
            ++count;
        }
        return sum;
    }

    public static int[][] chunkArray(int[] nums, int limit, int chunks) {
        return IntStream.iterate(0, i -> i + 1)
                .limit(limit)
                .mapToObj(j -> Arrays.copyOfRange(nums, j, Math.min(nums.length, j + chunks))).toArray(int[][]::new);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int[] numArr = new int[num];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = scan.nextInt();
        }

        System.out.println(negativeSums(numArr));

        scan.close();
    }
}