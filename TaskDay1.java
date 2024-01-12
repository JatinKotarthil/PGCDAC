package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskDay1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\CDAC\\Downloads\\chrome-win32\\chrome-win32\\chrome.exe");
		WebDriver obj = new ChromeDriver();
		obj.get("https://demo.openmrs.org/openmrs/login.htm");
		String title = obj.getTitle();
		System.out.println("Title is : "+title);
		
		obj.manage().window().maximize();
		
		obj.findElement(By.id("username")).sendKeys("Jatin");
		obj.findElement(By.id("password")).sendKeys("Jatin123");
		obj.findElement(By.xpath("//li[@id='Registration Desk']")).click();
		Thread.sleep(2000);
		obj.findElement(By.xpath("//input[@id='loginButton']")).click();
		obj.findElement(By.xpath("//a[@id='cantLogin']")).click();
		
		obj.navigate().to("https://demo.openmrs.org/openmrs/login.htm");
		
		System.out.println("Done"); 
		
		obj.findElement(By.id("username")).sendKeys("Admin");
		obj.findElement(By.id("password")).sendKeys("Admin123");
		obj.findElement(By.xpath("//li[@id='Registration Desk']")).click();
		Thread.sleep(2000);
		obj.findElement(By.xpath("//input[@id='loginButton']")).click();
		obj.findElement(By.xpath("//a[@id='cantLogin']")).click();
		
		System.out.println("Done1"); 
	}

}
