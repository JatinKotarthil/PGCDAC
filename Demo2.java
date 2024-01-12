package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\CDAC\\Downloads\\chrome-win32\\chrome-win32\\chrome.exe");
		WebDriver obj1 = new ChromeDriver();
		obj1.get("https://www.saucedemo.com/v1/");  
		obj1.findElement(By.id("user-name")).sendKeys("Jatin");
		obj1.findElement(By.id("password")).sendKeys("123456");
		
		obj1.findElement(By.id("login-button")).click();
		String s = obj1.getTitle();
		System.out.println("Title : "+s);
		
	
		obj1.navigate().to("https://www.google.com");
		
		// obj1.findElement(By.linkText("//a[contains(text(),'മലയാളം')]")).click();
		
		String s1 = obj1.getTitle();
		System.out.println("Title : "+s1);
	}
}
