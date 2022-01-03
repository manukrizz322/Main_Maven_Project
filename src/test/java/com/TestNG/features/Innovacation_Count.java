package com.TestNG.features;

import org.testng.annotations.Test;

public class Innovacation_Count {
	
	@Test(priority = -1)
	private void browserLaunch() {
		System.out.println("browser launch");

	}
	@Test(priority =3)
	private void url() {
		System.out.println("Url");
		

	}
	@Test(priority = 4,invocationCount = 5)
	private void refresh() {
		System.out.println("refresh");
	}

}
