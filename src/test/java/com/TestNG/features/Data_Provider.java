package com.TestNG.features;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Data_Provider {
@Test(dataProvider = "testData")
	private void data(String username, int password, int a, int b, String pas, int w, int r, String e, int f,String jr) {
		System.out.println("username" + username);
		System.out.println("password" + password);
		System.out.println(a);
		System.out.println(b);
		System.out.println(pas);
		System.out.println(w);
		System.out.println(r);
		System.out.println(e);
		System.out.println(f);
		System.out.println(jr);
    }
    @DataProvider
	private Object[][] testData() {
		return new Object[][] {

				{ "starc", 34, 56, 53, "jack", 56, 43, "string", 45, "jio" },
				{ "starc", 34, 56, 53, "jack", 56, 43, "string", 45, "jio" },
				{ "starc", 34, 56, 53, "jack", 56, 43, "string", 45, "jio" },
				{ "starc", 34, 56, 53, "jack", 56, 43, "string", 45, "jio" },
				{ "starc", 34, 56, 53, "jack", 56, 43, "string", 45, "jio" },
				{ "starc", 34, 56, 53, "jack", 56, 43, "string", 45, "jio" },
				{ "starc", 34, 56, 53, "jack", 56, 43, "string", 45, "jio" },
				{ "starc", 34, 56, 53, "jack", 56, 43, "string", 45, "jio" },
				{ "starc", 34, 56, 53, "jack", 56, 43, "string", 45, "jio" },
				{ "starc", 34, 56, 53, "jack", 56, 43, "string", 45, "jio" },
				{ "starc", 34, 56, 53, "jack", 56, 43, "string", 45, "jio" },
				{ "starc", 34, 56, 53, "jack", 56, 43, "string", 45, "jio" },
				{ "starc", 34, 56, 53, "jack", 56, 43, "string", 45, "jio" },
				{ "starc", 34, 56, 53, "jack", 56, 43, "string", 45, "jio" },

		};}}
