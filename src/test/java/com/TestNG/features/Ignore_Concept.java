package com.TestNG.features;
import org.testng.annotations.Test;
import org.testng.annotations.Ignore;
public class Ignore_Concept {
	@Test
	private void facebook() {
		System.out.println("facebook");}
    @Test(enabled = false)
	private void whatsapp() {
		System.out.println("whatsapp");}
    @Ignore
	@Test
	private void instagram() {
		System.out.println("instagram");}
    @Test
	private void spotify() {

		System.out.println("spotify");}
    }
