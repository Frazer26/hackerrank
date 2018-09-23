package com.hackerrank.dataStructures;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Scanner;

class JavaStack {

    public static void main(String[] args) {
        /* Create HashMap to match opening brackets with closing brackets */
        HashMap<Character, Character> bracketsMap = new HashMap<>();
        bracketsMap.put('(', ')');
        bracketsMap.put('[', ']');
        bracketsMap.put('{', '}');

        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String expression = scan.next();
            System.out.println(isBalanced(expression, bracketsMap) ? "true" : "false");
        }
        scan.close();
    }

    private static boolean isBalanced(String expression, HashMap<Character, Character> map) {
        if ((expression.length() % 2) != 0) {
            return false;
        }
        ArrayDeque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < expression.length(); i++) {
            Character ch = expression.charAt(i);
            if (map.containsKey(ch)) {
                deque.push(ch);
            } else if (deque.isEmpty() || ch != map.get(deque.pop())) {
                return false;
            }
        }
        return deque.isEmpty();
    }

}



