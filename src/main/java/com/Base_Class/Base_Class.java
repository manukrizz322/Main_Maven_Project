package com.Base_Class;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {
	public static WebDriver driver;// ------null;

	public static String value;

	public static WebDriver getBrowser(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Driver//chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "//Driver//firefoxdriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void url(String url) {
		driver.get(url);
	}

	public static void clickonElement(WebElement element) {
		element.click();

	}

	public static void inputValueElement(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void close() {
		driver.close();

	}

	public static void quit() {
		driver.quit();
	}

	public static void frames(String type, String value, WebElement element) {// --------frames method

		if (type.equalsIgnoreCase("index")) {
			int num = Integer.parseInt(value);
			driver.switchTo().frame(num);
		}

		else if (type.equalsIgnoreCase("id")) {
			driver.switchTo().frame(value);

		} else if (type.equalsIgnoreCase("name")) {
			driver.switchTo().frame(value);

		} else if (type.equalsIgnoreCase("element")) {
			driver.switchTo().frame(element);

		} else if (type.equalsIgnoreCase("defaultcontent")) {
			driver.switchTo().defaultContent();
		}
	}

	public static void actions(String type, WebElement element) {// --------actions class methods
		Actions act = new Actions(driver);

		if (type.equalsIgnoreCase("click")) {
			act.click(element).build().perform();

		} else if (type.equalsIgnoreCase("doubleclick")) {
			act.doubleClick(element).build().perform();
		} else if (type.equalsIgnoreCase("rightclick")) {
			act.contextClick(element).build().perform();
		} else if (type.equalsIgnoreCase("moveToElement")) {
			act.moveToElement(element).build().perform();
		}
	}

	public static void dropdown(WebElement element, String type, String value) {// -----dropdown methods
		Select sc = new Select(element);
		if (type.equalsIgnoreCase("index")) {
			int num = Integer.parseInt(value);
			sc.selectByIndex(num);
		} else if (type.equalsIgnoreCase("value")) {
			sc.selectByValue(value);

		} else if (type.equalsIgnoreCase("text")) {
			sc.selectByVisibleText(value);
		}
	}

	public static void scroll(String type, String value, WebElement element) {// --------scrolling method
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (type.equalsIgnoreCase("scrollby")) {
			js.executeScript(value);

		} else if (type.equalsIgnoreCase("scrollinto")) {
			js.executeScript("arguments[0].scrollIntoView()",element);
		}

	}

	public static void scrll(String type, String value, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String s = type;
		switch (s) {
		case "scrollby":
			js.executeScript(value);
			break;
		case "scrollinto":
			js.executeScript("arguments[0].scrollIntoView()", element);
			break;

		default:
			System.out.println("invalid type");
			break;
		}

	}

	public void drpdown(String type, String value, WebElement element) {
		Select sc = new Select(element);
		String s = type;
		switch (s) {
		case "index":
			int num = Integer.parseInt(value);
			sc.selectByIndex(num);
			break;
		case "value":

			sc.selectByValue(value);
			break;
		case "text":

			sc.selectByVisibleText(value);
			
			break;

		default:
			System.out.println("invalid type");
			break;
		}

	}

	public static void explicitwait(int sec, String type, By locator) {// ------- explicit wait methods
		WebDriverWait wait = new WebDriverWait(driver, sec);

		if (type.equalsIgnoreCase("visibleofelement")) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		} else if (type.equalsIgnoreCase("visibleofallelements")) {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		} else if (type.equalsIgnoreCase("alert")) {
			wait.until(ExpectedConditions.alertIsPresent());
		}
	}

	public static void implictlyWait(int num, TimeUnit type) {// -------------implicit wait methods

		driver.manage().timeouts().implicitlyWait(num, type);
	}

	public static void takeSnap(String pathname) throws IOException {// -------------screenshotmethod
		TakesScreenshot shot = (TakesScreenshot) driver;
		File src = shot.getScreenshotAs(OutputType.FILE);
		File des = new File(pathname);
		FileUtils.copyFile(src, des);

	}

	public static String readDataSheetAt(String path, int sheetindex, int rownum, int cellnum) throws IOException {
		File fi = new File(path);
		FileInputStream fis = new FileInputStream(fi);
		Workbook w = new XSSFWorkbook(fis);

		Cell cell = w.getSheetAt(sheetindex).getRow(rownum).getCell(cellnum);
		DataFormatter dft = new DataFormatter();
	    value = dft.formatCellValue(cell);
		w.close();
		return value;

	}

	public static String readDataSheet(String path, String sheetname, int rownum, int cellnum) throws IOException {
		File fi = new File(path);
		FileInputStream fis = new FileInputStream(fi);
		Workbook w = new XSSFWorkbook(fis);

		Cell cell = w.getSheet(sheetname).getRow(rownum).getCell(cellnum);
		CellType cellType = cell.getCellType();

		if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int num = (int) numericCellValue;
			value = Integer.toString(num);
		}

		else if (cellType.equals(CellType.STRING)) {
			value = cell.getStringCellValue();
		}

		w.close();
		return value;

	}

}
