package com.test.guru;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestRegestration {

	private WebDriver obj = new ChromeDriver();

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
		obj.get("https://demo.guru99.com/test/newtours/register.php");
		System.out.println("Current Page URL is : "+obj.getCurrentUrl());
	}

	@Test
	public void Regestrstion() {

		// Contact Information
		obj.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("JATIN");
		obj.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("KOTARTHIL");
		obj.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]")).sendKeys("889555752");
		obj.findElement(By.xpath("//input[@id='userName']")).sendKeys("jaitn@yahoo.com");

		// Mailing Information
		obj.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]")).sendKeys("Bandra");
		obj.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]")).sendKeys("Mumbai");
		obj.findElement(By.xpath("//tbody/tr[9]/td[2]/input[1]")).sendKeys("Maharashtra");
		obj.findElement(By.xpath("//tbody/tr[10]/td[2]/input[1]")).sendKeys("001");
		Select sel = new Select(obj.findElement(By.xpath("//tbody/tr[11]/td[2]/select[1]")));
		sel.selectByValue("INDIA");
		
		// User Information
		obj.findElement(By.xpath("//input[@id='email']")).sendKeys("Jatin");
		obj.findElement(By.xpath("//tbody/tr[14]/td[2]/input[1]")).sendKeys("Jatin123");
		obj.findElement(By.xpath("//tbody/tr[15]/td[2]/input[1]")).sendKeys("Jatin123");

		obj.findElement(By.xpath("//tbody/tr[17]/td[1]/input[1]")).click();
		
		System.out.println("Your Entire Flow is Correct for Registration");
		
		TestLogin testLogin = new TestLogin();
		testLogin.Login();
		
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
