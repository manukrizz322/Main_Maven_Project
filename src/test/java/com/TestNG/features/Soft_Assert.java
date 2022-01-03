package com.TestNG.features;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	
	
	@Test
	private void demo_Username() {
		
		
		String expected_Username = "starc";
		String actual_Username = "Starc";
		
	SoftAssert soft = new SoftAssert();
	soft.assertEquals(expected_Username, actual_Username);
	
	System.out.println("username validated");
	}

	
}
