package com.API.Demo;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.Base_Class.Base_Class;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Data_Validation extends Base_Class {
	@Test
	public void Validate_Data() throws IOException {
		
	String baseUrl = readDataSheetAt("C:\\Users\\Manojkrishnan\\OneDrive\\Desktop\\Testing Report for API.xlsx",0, 1, 2);
     RestAssured.baseURI=baseUrl;
     RequestSpecification request = RestAssured.given();
     String url = readDataSheetAt("C:\\Users\\Manojkrishnan\\OneDrive\\Desktop\\Testing Report for API.xlsx", 0, 2, 3);
     Response response = request.get(url);
     
     String responsebody = response.asString();
     System.out.println(responsebody);
     int statuscode = response.getStatusCode();
     System.out.println("Status code ="+statuscode);
     Assert.assertEquals(200, statuscode);
     System.out.println("Data Validation sucessfully");
     
     
	}

}
