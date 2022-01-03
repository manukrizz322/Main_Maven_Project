package com.TestNG.features;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
public class Simple_Annotations {
	@BeforeSuite
	private void setProperty() {
		System.out.println("set Property");}
    @BeforeTest
	private void browserlaunch() {
		System.out.println("browser launch");}
    @BeforeClass
	private void url() {
		System.out.println("url");}
	@BeforeMethod
	private void login() {
		System.out.println("login sucessfully");}
    @Test
	private void Men() {
		System.out.println("Men");}
	@Test
	private void Women() {
		System.out.println("women");}
    @Test
	private void Kids() {
		System.out.println("Kids");}
    @AfterMethod
	private void logout() {
		System.out.println("logout sucessfully");}
    @AfterClass
	private void verifyHomePage() {
		System.out.println("verified");}
    @AfterTest
	private void close() {
		System.out.println("close");}
    @AfterSuite
	private void deleteCookies() {
		System.out.println("delete cookies");}
    }
