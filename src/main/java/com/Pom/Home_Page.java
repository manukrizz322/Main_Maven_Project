package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	
	    public WebDriver driver;//------null driver
	  
	    @FindBy(xpath = "(//a[@class='sf-with-ul'])[4]")
		private  WebElement dresses_opt ;
	    
	    public WebElement getDresses_opt() {
			return dresses_opt;
		}

	   @FindBy(xpath="(//a[@title='Casual Dresses'])[2]")
		private WebElement casualdress_opt;
	   
	   public WebElement getCasualdress_opt() {
			return casualdress_opt;
		}
		
	   
	   
	   public WebElement getWomen_tops() {
		return women_tops;
	}



	public WebElement getWomen_dresses() {
		return women_dresses;
	}



	public WebElement getDresses_casual() {
		return dresses_casual;
	}



	public WebElement getDresses_evening() {
		return dresses_evening;
	}



	public WebElement getDresses_summer() {
		return dresses_summer;
	}

	@FindBy(xpath="//a[text()='Tops']")
	   private WebElement women_tops;
	   
	   @FindBy(xpath="(//a[text()='Dresses'])[1]")
	   private WebElement women_dresses;
	   
	   @FindBy(xpath="(//a[text()='Casual Dresses'])[2]")
	   private WebElement dresses_casual;
	   
	   @FindBy(xpath="(//a[text()='Evening Dresses'])[2]")
	   private WebElement dresses_evening;
	   @FindBy(xpath="(//a[text()='Summer Dresses'])[2]")
	   private WebElement dresses_summer;
	  
	   

       public Home_Page(WebDriver driver2) {//--------->Constructor 
			this.driver= driver2;
			
			PageFactory.initElements(driver, this);//------driver is to be checking  the find element
		}

      

      
		


}
