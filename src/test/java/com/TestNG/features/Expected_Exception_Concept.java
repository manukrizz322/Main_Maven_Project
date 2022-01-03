package com.TestNG.features;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Expected_Exception_Concept {
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void demo() {
		int age=10;
		
		System.out.println(age/0);

	}
	@Test(expectedExceptions = Error.class)
	private void asert() {
 Assert.assertEquals("java", "Java");
 System.out.println("mismatch doesn't occur");
	}

}
