package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin_Page {
	WebDriver driver;
	
	@FindBy(id="email")
	private WebElement email_box;
	
	@FindBy(id="passwd")
	private WebElement password_box;
	
	@FindBy(id="SubmitLogin")
	private WebElement login_btn;

	public Signin_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getEmail_box() {
		return email_box;
	}

	public WebElement getPassword_box() {
		return password_box;
	}

	public WebElement getLogin_btn() {
		return login_btn;
	}
	
	

}
