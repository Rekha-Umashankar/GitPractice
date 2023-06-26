package com.qa.practice.datadriven;



import java.io.FileReader;
import java.io.IOException;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenJ {
	String[][] data=null;
	WebDriver driver;
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();	
		//driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	@Test(dataProvider="dp")
	public void login(String data) {
		String users[]=data.split(",");
		driver.get("https://admin-demo.nopcommerce.com/");
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(users[0]);
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys(users[1]);
	
		
	}
	@DataProvider(name="dp")
	String[] readJson() throws IOException, ParseException
	{
		JSONParser jsonparser=new JSONParser();
		FileReader reader=new FileReader(".\\jsonfiles\\testdata.json");
		return null;
		
	}
}
