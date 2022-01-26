package com.TestNG.features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parllel_Test {
	
	@Test
	private void google() {

	
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	
	}
	
	
	@Test
	private void gogle() {

	
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
	}
	
}
