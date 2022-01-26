package com.Advanced.Topics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Webtable {

	public static int present_Absent;
	public static int email_address;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/table");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> allheaders = driver.findElements(By.xpath("((//table/thead)[2])//tr/th"));

		for (int i = 0; i < allheaders.size(); i++) {

			if (allheaders.get(i).getText().equals("Present/Absent"))
				present_Absent = i;

			if (allheaders.get(i).getText().equals("Email address"))
				email_address = i;
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> allrows = driver.findElements(By.xpath("((//table/tbody)[2])//tr"));

		for (int i = 0; i < allrows.size(); i++) {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			List<WebElement> alldata = allrows.get(i).findElements(By.xpath("(//table/tbody)[2]/tr/td"));

			for (int j = 0; j < alldata.size(); j++) {
				if (alldata.get(i).getText().equals("Koushik")) {
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					String emailadress = alldata.get(present_Absent).getText();

					System.out.println(emailadress);
				}}}}}
