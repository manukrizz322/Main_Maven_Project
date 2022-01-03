package com.Advanced.Topics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Links {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/broken");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("No of links are " + allLinks.size());

		for (int i = 0; i < allLinks.size(); i++) {

			WebElement E1 = allLinks.get(i);
			String link = E1.getAttribute("href");
			System.out.println(link);
			try {
				URL url = new URL(link);

				HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();

				if (httpURLConnect.getResponseCode() >= 400) {
					System.out.println(link + " - " + httpURLConnect.getResponseMessage() + "is a broken link");
				}

				else {
					System.out.println(link + " - " + httpURLConnect.getResponseMessage());
				}

			} catch (Exception e) {

			}

		}

	}

}
