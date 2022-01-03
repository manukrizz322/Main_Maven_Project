package com.Runner;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.Base_Class.Base_Class;
import com.Sdp.Page_Object_Manager;
import com.helper.File_Reader_Manager;
public class TestNG_Runner extends Base_Class {
	public static WebDriver driver = getBrowser("chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	public static Logger log = Logger.getLogger(Test_Runner.class);
	
	@BeforeClass
	private void browserlauch() throws Throwable {
		String filename = File_Reader_Manager.getFile_Reader_Manager().getConfiguration_Reader().getpropertyconfigparameter();
		PropertyConfigurator.configure(filename);
		log.info(File_Reader_Manager.getFile_Reader_Manager().getConfiguration_Reader().getinfo_openurl());
		url(File_Reader_Manager.getFile_Reader_Manager().getConfiguration_Reader().geturl());
	}
	
	@Test
	private void dresses() throws Throwable {
		String filename = File_Reader_Manager.getFile_Reader_Manager().getConfiguration_Reader().getpropertyconfigparameter();
		PropertyConfigurator.configure(filename);
		log.info(File_Reader_Manager.getFile_Reader_Manager().getConfiguration_Reader().getlaunchinfo());
		actions(File_Reader_Manager.getFile_Reader_Manager().getConfiguration_Reader().getmove_element(),pom.getInstanceHomepage().getDresses_opt());
		actions(File_Reader_Manager.getFile_Reader_Manager().getConfiguration_Reader().getclick(),pom.getInstanceHomepage().getCasualdress_opt());
		log.info(File_Reader_Manager.getFile_Reader_Manager().getConfiguration_Reader().getinfo_categorypage());

		implictlyWait(10, TimeUnit.SECONDS);
		scrll(File_Reader_Manager.getFile_Reader_Manager().getConfiguration_Reader().getscrollinto(), null,pom.getInstanceProductsdisplay().getPrd_image());
		implictlyWait(10, TimeUnit.SECONDS);
		actions(File_Reader_Manager.getFile_Reader_Manager().getConfiguration_Reader().getclick(),pom.getInstanceProductsdisplay().getPrd_image());
		log.info(File_Reader_Manager.getFile_Reader_Manager().getConfiguration_Reader().getinfo_specpage());
		frames(File_Reader_Manager.getFile_Reader_Manager().getConfiguration_Reader().getindex(), "0", null);
		actions(File_Reader_Manager.getFile_Reader_Manager().getConfiguration_Reader().getclick(),pom.getInstanceProductview().getCart_btn());
		log.info(File_Reader_Manager.getFile_Reader_Manager().getConfiguration_Reader().getinfo_addcart());
		frames(File_Reader_Manager.getFile_Reader_Manager().getConfiguration_Reader().getdefaultcontent(), null, null);
		clickonElement(pom.getInstanceProductview().getCheckout_btn());
		log.info(File_Reader_Manager.getFile_Reader_Manager().getConfiguration_Reader().getinfo_checkout_btn());
		implictlyWait(10, TimeUnit.SECONDS);
		log.info(File_Reader_Manager.getFile_Reader_Manager().getConfiguration_Reader().getinfo_cartsummary());
		scrll(File_Reader_Manager.getFile_Reader_Manager().getConfiguration_Reader().getscrollinto(), null,pom.getInstanceCartsummary().getCheckout_btn());
		implictlyWait(10, TimeUnit.SECONDS);
		clickonElement(pom.getInstanceCartsummary().getCheckout_btn());
		
		log.info(File_Reader_Manager.getFile_Reader_Manager().getConfiguration_Reader().getinfo_signinopened());
		scroll(File_Reader_Manager.getFile_Reader_Manager().getConfiguration_Reader().getscrollinto(), null,pom.getInstanceSignin().getEmail_box());
		implictlyWait(10, TimeUnit.SECONDS);
        String sheetname = File_Reader_Manager.getFile_Reader_Manager().getConfiguration_Reader().getsheet_name();
		String xcel_path = File_Reader_Manager.getFile_Reader_Manager().getConfiguration_Reader().getxcel_path();
		String email = readDataSheet(xcel_path, sheetname, 23, 5);

		inputValueElement(pom.getInstanceSignin().getEmail_box(), email);
		log.info(File_Reader_Manager.getFile_Reader_Manager().getConfiguration_Reader().getinfo_email_entered());
        inputValueElement(pom.getInstanceSignin().getPassword_box(),File_Reader_Manager.getFile_Reader_Manager().getConfiguration_Reader().getpassword());
		log.info(File_Reader_Manager.getFile_Reader_Manager().getConfiguration_Reader().getinfo_password_entered());
		clickonElement(pom.getInstanceSignin().getLogin_btn());
		log.info(File_Reader_Manager.getFile_Reader_Manager().getConfiguration_Reader().getinfo_login_btn_clicked());
		
		implictlyWait(10, TimeUnit.SECONDS);
        scrll(File_Reader_Manager.getFile_Reader_Manager().getConfiguration_Reader().getscrollinto(), null,pom.getInstanceAdress().getCheckout_btn());
		implictlyWait(10, TimeUnit.SECONDS);
		log.info(File_Reader_Manager.getFile_Reader_Manager().getConfiguration_Reader().getinfo_adresspage());
		clickonElement(pom.getInstanceAdress().getCheckout_btn());
		log.info(File_Reader_Manager.getFile_Reader_Manager().getConfiguration_Reader().getinfo_checkbox_clicked());
		implictlyWait(10, TimeUnit.SECONDS);
		log.info(File_Reader_Manager.getFile_Reader_Manager().getConfiguration_Reader().getinfo_Shipping_page_opened());
		scrll(File_Reader_Manager.getFile_Reader_Manager().getConfiguration_Reader().getscrollinto(), null,
				pom.getInstanceShipping().getSubmit_btn());
		implictlyWait(10, TimeUnit.SECONDS);
		clickonElement(pom.getInstanceShipping().getCheck_box());
		log.info(File_Reader_Manager.getFile_Reader_Manager().getConfiguration_Reader().getinfo_checkbox_clicked());
		clickonElement(pom.getInstanceShipping().getSubmit_btn());
		log.info(File_Reader_Manager.getFile_Reader_Manager().getConfiguration_Reader().getinfo_submit_btn_clicked());
		implictlyWait(10, TimeUnit.SECONDS);
        clickonElement(pom.getInstancePaymentPage().getBankwire());
		clickonElement(pom.getInstanceBankWirePage().getConfirm_my_order());
		
		String by = File_Reader_Manager.getFile_Reader_Manager().getConfiguration_Reader().getscrolby();
		scroll(by,File_Reader_Manager.getFile_Reader_Manager().getConfiguration_Reader().getwindowscrollby(), null);
		implictlyWait(10, TimeUnit.SECONDS);
		takeSnap(File_Reader_Manager.getFile_Reader_Manager().getConfiguration_Reader().getsnapshotpath());
		log.info(File_Reader_Manager.getFile_Reader_Manager().getConfiguration_Reader().getinfo_snappath());

	}
	@AfterMethod
private void logout() {
		clickonElement(pom.getInstanceBankWirePage().getLog_Out());

}

}
