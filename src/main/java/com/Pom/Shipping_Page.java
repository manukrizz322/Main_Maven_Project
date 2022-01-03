package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_Page {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement check_box;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	WebElement submit_btn;
	public Shipping_Page(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getCheck_box() {
		return check_box;
	}
	public WebElement getSubmit_btn() {
		return submit_btn;
	}

}
