package com.test.guru;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestLogin {

	private WebDriver obj = new ChromeDriver();

	public TestLogin() {
		beforeTest();
		beforeMethod();
	}
	
	@BeforeSuite
	public void beforeSuite() {
	}

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.Chrome.driver",
				"C:\\Users\\CDAC\\Downloads\\chrome-win32\\chrome-win32\\chrome.exe");

	}

	@BeforeClass
	public void beforeClass() {
	}

	@BeforeMethod
	public void beforeMethod() {
		obj.get("https://demo.guru99.com/test/newtours");
		System.out.println("Current Page URL is : " + obj.getCurrentUrl());
	}

	@Test
	public void Login() {
		
		obj.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("Jatin");
		obj.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("Jatin123");
		String a  = obj.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).getAttribute("value");
		String b  = obj.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).getAttribute("value");
		System.out.println("user name : "+a);
		System.out.println("password : "+b);
		obj.findElement(By.xpath("//tbody/tr[4]/td[2]/div[1]/input[1]")).click();
		
		System.out.println("Your Entire Flow is Correct for Login");
		
	}

	@AfterMethod
	public void afterMethod() {
	}

	@AfterClass
	public void afterClass() {
	}

	@AfterTest
	public void afterTest() {
	}

	@AfterSuite
	public void afterSuite() {
	}

}
