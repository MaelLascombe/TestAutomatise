package main.java.com.github.jmaillard.testsautomatises.calculator.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Assert;



public class CalculatorTest {

	@Test
	public void testMinus() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivide() {
		fail("Not yet implemented");
	}

	@Test
	public void testMultiply() {
		fail("Not yet implemented");
	}

	@Test
	public void testSum() {
		fail("Not yet implemented");
	}
	
	@Test
	public void twoPlusThreeEqualsFive() {
		Assert.assertEquals(new Calculator().sum(2,3),5);
	}
	
	@Test
	public void twoPlusMinusThreeEqualsMinusOne() {
		Assert.assertEquals(new Calculator().sum(2,-3),-1);
	}
	
	@Test
	public void twoMinusThreeEqualsMinusOne() {
		Assert.assertEquals(new Calculator().minus(2,3),-1);
	}
	
	@Test
	public void twoMinusMinusThreeEqualsFive() {
		Assert.assertEquals(new Calculator().minus(2,-3),5);
	}
	
	@Test
	public void tenDivideByTwoEqualsFive() {
		Assert.assertEquals(new Calculator().divide(10,2),5);
	}
	
	@Test(expected = ArithmeticException.class)
	public void tenDivideByZeroEqualsError() {
		Assert.assertEquals(new Calculator().divide(10,0),0);
	}
	
	@Test
	public void twoMultiplyByThreeEqualsSix() {
		Assert.assertEquals(new Calculator().multiply(2,3),6);
	}
	
	@Test
	public void twoMultiplyByZeroEqualsZero() {
		Assert.assertEquals(new Calculator().multiply(2,0),0);
	}

}
