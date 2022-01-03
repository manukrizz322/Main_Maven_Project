package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductView_Page {
	WebDriver driver;

	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement cart_btn;
	
	public WebElement getCart_btn() {
		return cart_btn;
	}
	@FindBy(xpath="//span[contains(text(),'Proceed')]")
	private WebElement checkout_btn;
	
    public WebElement getCheckout_btn() {
		return checkout_btn;
	}


	public ProductView_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	
	
	
}
