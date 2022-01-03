package com.TestNG.features;

import org.testng.annotations.Test;

public class Timeout_Concept {
	
	@Test(timeOut = 8000)
	private void demo() throws InterruptedException {
		
		
		Thread.sleep(2000);
		System.out.println("browser launch");
		
		
		Thread.sleep(1000);
		System.out.println("click signin button");
		
		Thread.sleep(3000);
		System.out.println("credentials");

	}

}
