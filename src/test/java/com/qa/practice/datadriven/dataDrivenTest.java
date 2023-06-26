package com.qa.practice.datadriven;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.FileReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataDrivenTest   {
	WebDriver driver;
	@BeforeClass
	void setup() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
	}
	@AfterClass
	void tearDown() {
		driver.close();
	}
	@Test(dataProvider = "dp")
	void login(String data) {
		String user[] =data.split(",");
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.findElement(By.id("Email")).sendKeys(user[0]);
		driver.findElement(By.id("Password")).sendKeys(user[1]);
		
	}
	@DataProvider(name="dp")
		String[] readJson() throws IOException, ParseException {
		JSONParser jsonparser =new JSONParser();
		FileReader reader =new FileReader("./jsonfiles/testData.json");
		Object obj =jsonparser.parse(reader);
		JSONObject loginsJsonObj = (JSONObject)obj;
		JSONArray loginsArray =(JSONArray)loginsJsonObj.get("logins");
		String arr[]=new String[loginsArray.size()];
		for(int i =0;i<loginsArray.size();i++) {
			JSONObject logins =(JSONObject)loginsArray.get(i);
			String user=(String)logins.get("username");
			String pwd=(String)logins.get("password");
			arr[i]=user+","+pwd;
			
		}
		return arr;
	}
	
}
