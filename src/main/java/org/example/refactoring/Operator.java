package org.example.refactoring;

import java.util.function.BiFunction;

public enum Operator {
	PLUS('+', (firstOperand, secondOperand) -> (firstOperand + secondOperand)),
	MINUS('-', (firstOperand, secondOperand) -> (firstOperand - secondOperand)),
	MULTIPLY('*', (firstOperand, secondOperand) -> (firstOperand * secondOperand)),
	DIVIDE('/', (firstOperand, secondOperand) -> (firstOperand / secondOperand));

	private final Character operator;
	private final BiFunction<Integer, Integer, Integer> biFunction;

	public Character getOperator() {
		return operator;
	}

	Operator(Character operator, BiFunction<Integer, Integer, Integer> biFunction) {
		this.operator = operator;
		this.biFunction = biFunction;
	}

	public int calculate(int firstOperand, int secondOperand) {
		return this.biFunction.apply(firstOperand, secondOperand);
	}
}
