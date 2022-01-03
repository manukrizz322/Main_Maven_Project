package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartSummary_Page {
	
	WebDriver driver;
	
	@FindBy(xpath="(//span[contains(text(),'Proceed')])[2]")
	private WebElement checkout_btn;

	public CartSummary_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getCheckout_btn() {
		return checkout_btn;
	}
	
	

}
