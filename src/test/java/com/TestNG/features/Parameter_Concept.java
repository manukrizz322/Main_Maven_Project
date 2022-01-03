package com.TestNG.features;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Concept {
	@Parameters({"username","password"})
	@Test
	private void credentials(@Optional("steven")String username,@Optional("steven@123456")String password) {
		System.out.println("username"+username);
		System.out.println("password"+password);
		

	}

}
						