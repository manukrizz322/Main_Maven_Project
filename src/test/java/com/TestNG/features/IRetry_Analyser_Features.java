package com.TestNG.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IRetry_Analyser_Features {
	
	
	@Test(retryAnalyzer = Rerun.class)
	private void credentials() {
		String expected_username ="Jackson";
		String actual_username ="jackson";
		
		Assert.assertEquals(actual_username, expected_username);
	}
	
	
	@Test(retryAnalyzer = Rerun.class)
	private void credentials1() {
	String expected_username="mickael";
	String actual_username="Mickael";
	
	Assert.assertEquals(actual_username, expected_username);
			
	}

}
