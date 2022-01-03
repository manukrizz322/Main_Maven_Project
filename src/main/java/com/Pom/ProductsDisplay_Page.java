package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsDisplay_Page {
	
	public WebDriver driver ;
		
	
	
	public ProductsDisplay_Page(WebDriver driver2) {
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(xpath="//img[@itemprop='image']")
	private WebElement prd_image;


    public WebElement getPrd_image() {
		return prd_image;
	}

	
}
