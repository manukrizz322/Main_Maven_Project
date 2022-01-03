package com.API.Demo;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
public class Json_Validation {
	public static void main(String[] args) throws IOException, ParseException {
	
	File fi = new File("C:\\Users\\Manojkrishnan\\eclipse-workspace\\Maven_Project_Class\\src\\test\\java\\com\\Payload\\Payload.json");
    FileReader reader = new FileReader(fi);
    
    JSONParser parser = new JSONParser();
    
    Object parse = parser.parse(reader);
    
    
    JSONObject jsonObj= (JSONObject) parse;
    
    Object object = jsonObj.get("total_pages");
    
    String value = object.toString();
    
    System.out.println("total_pages:"+value);
    
    Assert.assertEquals("2", value);
    
    System.out.println("Validation sucessfully");
    }
	
}
