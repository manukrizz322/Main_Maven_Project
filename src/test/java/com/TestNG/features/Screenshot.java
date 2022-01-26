package com.TestNG.features;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Base_Class.Base_Class;






@Listeners(Custum_Listner.class)
public class Screenshot extends Base_Class {
	
	
	
	@BeforeMethod
	public void setUp() {
		
	     getBrowser("chrome");
	 
		
		
		
	}
	
	
	@AfterMethod
	public void tearDowm() {
		
		
		driver.quit();
		
	}
	
	@Test
	public void takeSchreenShot(){
		
		Assert.assertEquals(false, true);
		
		
		
		
	}
	@org.testng.annotations.Test
	public void takeSchreenShot1(){
		
		Assert.assertEquals(false, true);
		
		
		
		
	}
	@org.testng.annotations.Test
	public void takeSchreenShot2(){
		
		Assert.assertEquals(false, true);
		
		
		
		
	}
	@org.testng.annotations.Test
	public void takeSchreenShot3(){
		
		Assert.assertEquals(false, false);
		
		
		
		
	}
	

}
