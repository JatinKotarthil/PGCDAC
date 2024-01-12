package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumDemo3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.Chrome.driver",
				"C:\\Users\\CDAC\\Downloads\\chrome-win32\\chrome-win32\\chrome.exe");
		WebDriver obj = new ChromeDriver();
		obj.get("https://demo.guru99.com/v4/");
		obj.manage().window().maximize();
		String title = obj.getTitle();
		System.out.println("Title is : " + title);
		
		obj.findElement(By.xpath("//body/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		
		

	}
}
