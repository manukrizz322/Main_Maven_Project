package com.TestNG.features;

import org.testng.annotations.Test;

public class Grouping_Features {
	@Test(groups = "Social media")
	private void facebook() {
		System.out.println("facebook");

	}

	@Test(groups = "Social media")
	private void whatsapp() {
		System.out.println("whatsapp");

	}

	@Test(groups = "Music")
	private void spotify() {
		System.out.println("spotify");

	}

	@Test(groups = "Music")
	private void wynkMusic() {
		System.out.println("wynkmusic");

	}

	@Test(groups = "Books")
	private void books() {
		System.out.println("books");

	}

}
