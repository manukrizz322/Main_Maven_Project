package com.Advanced.Topics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Images {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/broken");

		List<WebElement> alllinks = driver.findElements(By.tagName("img"));

		for (WebElement links : alllinks) {
			String link = links.getAttribute("src");

			try {
				URL url = new URL(link);
				URLConnection openConnection = url.openConnection();

				HttpURLConnection connection = (HttpURLConnection) openConnection;

				if (connection.getResponseCode() >= 400) {
					System.out.println(link + "=" + connection.getResponseMessage() + "Broken image");

				} else {
					System.out.println(link + "=" + connection.getResponseMessage());
				}
			}

			catch (Exception e) {
				System.err.println("null");

			}

		}

	}

}
