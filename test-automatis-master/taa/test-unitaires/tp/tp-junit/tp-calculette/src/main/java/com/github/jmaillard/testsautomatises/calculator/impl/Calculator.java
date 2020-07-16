package main.java.com.github.jmaillard.testsautomatises.calculator.impl;

import main.java.com.github.jmaillard.testsautomatises.calculator.ICalculator;

public class Calculator implements ICalculator {


	public int minus(int a, int b) {
		return a + b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int sum(int a, int b) {
		return 0;
	}
}
