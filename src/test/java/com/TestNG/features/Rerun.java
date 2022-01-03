package com.TestNG.features;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Rerun implements IRetryAnalyzer{
int Start=0;
int End=3;
	

public boolean retry(ITestResult result) {
		if (Start < End) {
			Start++;
			return true;
		}
		return false;
	}

}
