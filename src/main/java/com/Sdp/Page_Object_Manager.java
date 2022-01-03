package com.Sdp;
import org.openqa.selenium.WebDriver;
import com.Pom.Address_Page;
import com.Pom.Bank_wire_Payment_Page;
import com.Pom.CartSummary_Page;
import com.Pom.Home_Page;
import com.Pom.Payment_Page;
import com.Pom.ProductView_Page;
import com.Pom.ProductsDisplay_Page;
import com.Pom.Shipping_Page;
import com.Pom.Signin_Page;
public class Page_Object_Manager {
	public WebDriver driver;
    private  Home_Page hp;
    private  ProductsDisplay_Page pd;
	private  ProductView_Page pv;
	private  CartSummary_Page cs;
	private  Signin_Page si;
	private  Address_Page ad;
	private  Shipping_Page sh;
	private Payment_Page pay;
	private Bank_wire_Payment_Page bw;
	
	
	public Payment_Page getInstancePaymentPage() {
		if (pay==null) {
			pay=new Payment_Page(driver);
			
		}
		return pay;
		
		}
	public Bank_wire_Payment_Page getInstanceBankWirePage() {
		if (bw==null) {
			bw=new Bank_wire_Payment_Page(driver);
			
		}
      return bw;
	}

	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}

	public Home_Page getInstanceHomepage() {

		if (hp == null) {
			hp = new Home_Page(driver);

		}
		return hp;
	}

	public ProductsDisplay_Page getInstanceProductsdisplay() {
		if (pd == null) {
			pd = new ProductsDisplay_Page(driver);

		}

		return pd;
	}

	public ProductView_Page getInstanceProductview() {
		if (pv == null) {
			pv = new ProductView_Page(driver);

		}
		return pv;
	}

	public CartSummary_Page getInstanceCartsummary() {
		if (cs == null) {
			cs = new CartSummary_Page(driver);

		}
		return cs;
	}

	public Signin_Page getInstanceSignin() {
		if (si == null) {
			si = new Signin_Page(driver);

		}
		return si;
	}

	public Address_Page getInstanceAdress() {
		if (ad == null) {
			ad = new Address_Page(driver);

		}
		return ad;
	}

	public Shipping_Page getInstanceShipping() {
		if (sh == null) {
			sh = new Shipping_Page(driver);

		}
		return sh;
	}

}
