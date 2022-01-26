package com.Advanced.Topics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BL {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Drver/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get(null);
		
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		
		for(WebElement links: alllinks) {
			
			String attribute = links.getAttribute("href");
			
			try{URL url = new URL(attribute);
			
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			
			if (con.getResponseCode()>400) {
				System.out.println(links+"-"+con.getResponseMessage()+"is broken link");
				
			}
			else
				System.out.println(links+"-"+con.getResponseMessage()+"is not a broken link");
		}
		
		catch(Exception e) {
		}		
	}

	}}
