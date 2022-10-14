package org.example;

import java.util.*;

public class SimpleCalculatorWithBadSmell {

    private static StringBuilder sa;
    private static StringBuilder sb;

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder temp = new StringBuilder();
        int i;
        sa = new StringBuilder();
        sb = new StringBuilder();

        int thisIsAMysteriousIntVariable1 = 0;
        int thisIsAMysteriousIntVariable2 = 0;
        char thisIsAMysteriousCharVariable3 = ' ';

        Integer result = null;
        for (i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                continue;
            }
            temp.append(input.charAt(i));
        }

        thisIsAMysteriousCharVariable3 = getThisIsAMysteriousCharVariable3ButThisMethodNameIsVeryLongAndComplicated(temp, thisIsAMysteriousCharVariable3, sa, sb);

        for (i = sa.length() - 1; i >= 0; i--) {
            thisIsAMysteriousIntVariable1 += (sa.charAt(i) - '0') * (int)Math.pow(10, i);
        }

        for (i = sb.length() - 1; i >= 0; i--) {
            thisIsAMysteriousIntVariable2 += (sb.charAt(i) - '0') * (int)Math.pow(10, i);
        }

        if (thisIsAMysteriousCharVariable3 == '+') {
            result = thisIsAMysteriousIntVariable1 + thisIsAMysteriousIntVariable2;
        } else if (thisIsAMysteriousCharVariable3 == '-') {
            result = thisIsAMysteriousIntVariable1 - thisIsAMysteriousIntVariable2;
        } else if (thisIsAMysteriousCharVariable3 == '*') {
            result = thisIsAMysteriousIntVariable1 * thisIsAMysteriousIntVariable2;
        } else if (thisIsAMysteriousCharVariable3 == '/') {
            result = thisIsAMysteriousIntVariable1 / thisIsAMysteriousIntVariable2;
        }
        
        MoneyChangingMachine moneyChangingMachine = new MoneyChangingMachine();
        int displayMode = 0;
        switch (displayMode) {
            case 0:
                System.out.print(result);
                break;
            case 1:
                System.out.print(moneyChangingMachine.exchangeWonToDollar(result));
                break;
            case 2:
                System.out.print(moneyChangingMachine.exchangeWonToYen(result));
                break;
            case 3:
                System.out.print(moneyChangingMachine.exchangeWonToYuan(result));
                break;
            case 4:
                System.out.print(moneyChangingMachine.exchangeWonToBinary(result));
                break;
            case 5:
                System.out.print(moneyChangingMachine.exchangeWonToHex(result));
                break;
        }

        sc.close();
    }

    private static char getThisIsAMysteriousCharVariable3ButThisMethodNameIsVeryLongAndComplicated(StringBuilder temp, char thisIsAMysteriousCharVariable3, StringBuilder sa, StringBuilder sb) {
        int i;
        for (i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == '+') {
                thisIsAMysteriousCharVariable3 = temp.charAt(i);
            } else if (temp.charAt(i) == '-') {
                thisIsAMysteriousCharVariable3 = temp.charAt(i);
            } else if (temp.charAt(i) == '*') {
                thisIsAMysteriousCharVariable3 = temp.charAt(i);
            } else if (temp.charAt(i) == '/') {
                thisIsAMysteriousCharVariable3 = temp.charAt(i);
            } else if (thisIsAMysteriousCharVariable3 == ' ') {
                sa.append(temp.charAt(i));
            } else if (thisIsAMysteriousCharVariable3 != ' ') {
                sb.append(temp.charAt(i));
            }
        }
        return thisIsAMysteriousCharVariable3;
    }
}
