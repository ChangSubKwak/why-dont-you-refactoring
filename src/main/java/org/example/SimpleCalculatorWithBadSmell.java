package org.example;

import java.util.*;

public class SimpleCalculatorWithBadSmell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder temp = new StringBuilder();
        int i;
        int a = 0;
        int b = 0;
        char op = ' ';
        StringBuilder sa = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        Integer result = null;

        for (i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                continue;
            }
            temp.append(input.charAt(i));
        }
        
        for (i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == '+' || temp.charAt(i) == '-' || temp.charAt(i) == '*' || temp.charAt(i) == '/') {
                op = temp.charAt(i);
            } else if (op == ' ') {
                sa.append(temp.charAt(i));
            } else if (op != ' ') {
                sb.append(temp.charAt(i));
            }
        }
        
        for (i = sa.length() - 1; i >= 0; i--) {
            a += (sa.charAt(i) - '0') * (int)Math.pow(10, i); 
        }

        for (i = sb.length() - 1; i >= 0; i--) {
            b += (sb.charAt(i) - '0') * (int)Math.pow(10, i);
        }

        if (op == '+') {
            result = a + b;
        } else if (op == '-') {
            result = a - b;
        } else if (op == '*') {
            result = a * b;
        } else if (op == '/') {
            result = a / b;
        }
        
        System.out.print(result);
        sc.close();
    }
}
