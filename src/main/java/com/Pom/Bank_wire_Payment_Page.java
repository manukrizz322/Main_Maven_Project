package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bank_wire_Payment_Page {
	
	public WebDriver driver;
	
	public Bank_wire_Payment_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='I confirm my order']")
	private WebElement confirm_my_order;

	public WebElement getConfirm_my_order() {
		return confirm_my_order;
	}

	@FindBy(xpath="//a[@title='Log me out']")
	private WebElement log_Out;

	public WebElement getLog_Out() {
		return log_Out;
	}
	
}
