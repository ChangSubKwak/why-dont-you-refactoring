package org.example.refactoring;

import org.example.MoneyChangingMachine;

import java.util.*;

public class SimpleCalculatorWithRefactoring {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int leftOperand = 0;
        int rightOperand = 0;
        char operator = ' ';

        input = removeSpace(input);
        operator = extractOperator(input);
        leftOperand = extractLeftOperand(input);
        rightOperand = getRightOperand(input);

        int result = calculateExpression(leftOperand, operator, rightOperand);
        System.out.print(new BasicExchanger().exchange(result));                                            // displayMode == 0
//        System.out.print(new BinaryExchanger(new BasicExchanger()).exchange(result));                       // displayMode == 1
//        System.out.print(new HexExchanger(new BasicExchanger()).exchange(result));                          // displayMode == 2
//        System.out.print(new DollarExchanger(new BasicExchanger()).exchange(result));                       // displayMode == 3
//        System.out.print(new BinaryExchanger(new DollarExchanger(new BasicExchanger())).exchange(result));  // displayMode == 4
//        System.out.print(new HexExchanger(new DollarExchanger(new BasicExchanger())).exchange(result));     // displayMode == 5

        sc.close();
    }

    private static int calculateExpression(int leftOperand, char operator, int rightOperand) throws IllegalArgumentException {
   		Operator foundOperator = Arrays.stream(Operator.values())
   				.filter(op -> op.getOperator().equals(operator))
   				.findFirst()
   				.orElseThrow(() -> new IllegalArgumentException("지원하는 연산자가 아닙니다."));

   		return foundOperator.calculate(leftOperand, rightOperand);
   	}

    private static String removeSpace(String input) {
        return input.replaceAll(" ", "");
    }

    private static char extractOperator(String input) {
        return input.split("\\d")[1].charAt(0);
    }

    private static Integer extractLeftOperand(String input) {
        return Integer.valueOf(input.split("[+|\\-|/|\\*]")[0]);
    }

    private static Integer getRightOperand(String input) {
        return Integer.valueOf(input.split("[+|\\-|/|\\*]")[1]);
    }
}
