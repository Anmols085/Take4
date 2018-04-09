package com.sin.scenario;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test004 {

	@BeforeClass
	public void printName() {
		System.out.println("Test004 in play");
	}
	@Test(expectedExceptions = ArithmeticException.class)
	public void dividedByZeroExample1() {
		System.out.println(1 / 0);
	}

	@Test (dependsOnMethods = {"dividedByZeroExample1"})
	public void dividedByZeroExample2() {
		System.out.println(1 / 0);
	}
}
