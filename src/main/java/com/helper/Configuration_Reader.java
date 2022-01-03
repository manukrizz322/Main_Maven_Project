package com.helper;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class Configuration_Reader {

	public Properties p;

	public Configuration_Reader() throws Throwable {
		File fi = new File(
				"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Maven_Project_Class\\src\\main\\java\\com\\properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(fi);
		p = new Properties();
		p.load(fis);

	}

	public String getbrowserarg() {

		String browserpara = p.getProperty("getbrowserparameter");

		return browserpara;
	}

	public String geturl() {
		String url = p.getProperty("url");
		return url;

	}

	public String getpropertyconfigparameter() {
		String property = p.getProperty("propertyconfigparameter");
		return property;

	}

	public String getinfo_openurl() {
		String openurl = p.getProperty("info_openurl");
		return openurl;
	}

	public String getlaunchinfo() {
		String launchinfo = p.getProperty("launchinfo");
		return launchinfo;

	}

	public String getmove_element() {
		String moveelement = p.getProperty("move_element");
		return moveelement;

	}

	public String getclick() {
		String clk = p.getProperty("click");
		return clk;

	}

	public String getinfo_categorypage() {
		String catgpage = p.getProperty("info_categorypage");
		return catgpage;
	}

	public String getscrollinto() {
		String srllinto = p.getProperty("scrollinto");
		return srllinto;

	}

	public String getinfo_specpage() {
		String specpage = p.getProperty("info_specpage");
		return specpage;
	}

	public String getindex() {
		String index = p.getProperty("index");
		return index;

	}

	public String getinfo_addcart() {
		String infoaddcart = p.getProperty("info_addcart");
		return infoaddcart;

	}

	public String getdefaultcontent() {
		String dc = p.getProperty("defaultcontent");
		return dc;

	}

	public String getinfo_checkout_btn() {
		String chkout = p.getProperty("info_checkout_btn");
		return chkout;

	}

	public String getinfo_cartsummary() {
		String cartsumry = p.getProperty("info_cartsummary");
		return cartsumry;

	}

	public String getinfo_signinopened() {
		String so = p.getProperty("info_signinopened");
		return so;

	}

	public String getxcel_path() {
		String path = p.getProperty("xcel_path");
		return path;

	}

	public String getsheet_name() {
		String shtname = p.getProperty("sheet_name");
		return shtname;

	}

	public String getinfo_email_entered() {
		String email = p.getProperty("info_email_entered");
		return email;

	}

	public String getinfo_password_entered() {
		String pasword = p.getProperty("info_password_entered");
		return pasword;

	}

	public String getinfo_login_btn_clicked() {
		String login = p.getProperty("info_login_btn_clicked");

		return login;
	}

	public String getpassword() {
		String pass = p.getProperty("password");
		return pass;
	}

	public String getinfo_adresspage() {
		String addresspage = p.getProperty("info_adresspage");
		return addresspage;
	}

	public String getinfo_checkout_btn_clicked() {
		String chkout = p.getProperty("info_checkout_btn_clicked");
		return chkout;
	}

	public String getinfo_Shipping_page_opened() {
		String shpage = p.getProperty("info_Shipping_page_opened");
		return shpage;
	}

	public String getinfo_checkbox_clicked() {
		String chkbox = p.getProperty("info_checkbox_clicked");
		return chkbox;
	}

	public String getinfo_submit_btn_clicked() {
		String submtbtn = p.getProperty("info_submit_btn_clicked");
		return submtbtn;
	}

	public String getscrolby() {
		String scrlby = p.getProperty("scrolby");
		return scrlby;
	}

	public String getwindowscrollby() {
		String wiscrlby = p.getProperty("windowscrollby");
		return wiscrlby;
	}

	public String getsnapshotpath() {
		String path = p.getProperty("snapshotpath");
		return path;
	}

	public String getinfo_snappath() {
		String info = p.getProperty("info_snappath");
		return info;
	}

}
