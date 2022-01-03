package com.TestNG.features;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priority_features {
	@BeforeMethod
	private void login() {
		System.out.println("login");}
   @Test(priority = -5)
	private void Men() {
		System.out.println("men");}
   @Test(priority = 1)
	private void Women() {
		System.out.println("Women");}
   @Test(priority = 5)
	private void Kids() {
		System.out.println("kids");}
   @AfterMethod
	private void logout() {
		System.out.println("logout");}
}
