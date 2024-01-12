package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo2 {

	public static void main(String args[]) throws InterruptedException {

		// System.out.println("Chrome Version 120.0.6099.200 (Official Build)
		// (64-bit)");

		System.setProperty("webdriver.Chrome.driver","C:\\Users\\CDAC\\Downloads\\chrome-win32\\chrome-win32\\chrome.exe");
		WebDriver obj1 = new ChromeDriver();
		obj1.get("https://www.google.com");

		String title = obj1.getTitle();
		System.out.println("Title of Website is : "+title);
		
		System.out.println("Check if Title is Correct or Not : ");
		if(title.equals("Google")) {
			System.out.println("This is Correct ");
		}else {
			System.out.println("Something is wrong");
		}
		
		System.out.println("=================================");
		System.out.println("Current URL : "+obj1.getCurrentUrl());
		System.out.println("=================================");
//		System.out.println("=================================");
//		System.out.println("Html Design of Page : "+obj1.getPageSource());
//		System.out.println("=================================");
		System.out.println("=================================");
		
		// google page will be load first and the below url will load in same browser
		obj1.get("https://www.youtube.com");
		
		// google page will be load first and the above url will load in same browser
		// But below url will load in new Browser
		
		WebDriver obj2 = new ChromeDriver();
		obj2.get("https://www.gmail.com");
		
		// Close Browser
		
		System.out.println("=================================");
		
		obj2.manage().window().minimize();
		obj2.manage().window().maximize();
				
		Thread.sleep(3000);
		obj1.close();
		Thread.sleep(3000);
		obj2.close();
		
		System.out.println("=================================");
		
		// Navigate
		WebDriver obj3 = new ChromeDriver();
		
		obj3.navigate().to("https://www.facebook.com");
		Thread.sleep(2000);
		obj3.navigate().to("https://www.instagram.com");
		Thread.sleep(2000);
		obj3.navigate().back();
//		Thread.sleep(2000);	
//		obj3.close();
		
		
	}
}
