package com.TestNG.features;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Base_Class.Base_Class;




public class Custum_Listner extends Base_Class implements ITestListener{
	
	
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("FAILED TEST");
		takeSnap(result.getMethod().getMethodName());
		
	}

	
	

}
