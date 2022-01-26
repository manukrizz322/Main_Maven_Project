package com.TestNG.features;


import org.testng.Assert;
import org.testng.annotations.Test;
public class Assert_Concept {
	@Test
	private void Demo_Username() {
	    String expectedusername ="Jackson";
		String actualusername ="Jackson";
		
		Assert.assertEquals(expectedusername, actualusername);
		
		
		
		
		System.out.println("user name validation sucessfully");
		
		Assert.assertNotEquals(expectedusername, actualusername);
		System.out.println("Mismatch occur");
	}
	@Test
	private void Demo_Password() {
		String expectedpassword ="Jackson@23456";
		String actualpassword ="jackson@2346";
		
		
		Assert.assertNotEquals(expectedpassword, actualpassword);
		System.out.println("mismatch occur");
		}
	}
