package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\CDAC\\Downloads\\chrome-win32\\chrome-win32\\chrome.exe");
		WebDriver obj1 = new ChromeDriver();
		obj1.get("https://www.saucedemo.com/v1/");
		obj1.findElement(By.xpath("//input[@id='user-name']")).sendKeys("jatin@gmail.com");
		obj1.findElement(By.xpath("//input[@id='password']")).sendKeys("jatin123");
		
		Thread.sleep(2000);
		
		obj1.findElement(By.xpath("//input[@id='login-button']")).click();
		String s = obj1.getTitle();
		System.out.println(s);
	}
}
