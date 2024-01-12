package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationDemo2 {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\CDAC\\Downloads\\chrome-win32\\chrome-win32\\chrome.exe");
		WebDriver obj = new ChromeDriver();
		obj.get("https://demo.automationtesting.in/Register.html");
		
		String title = obj.getTitle();
		System.out.println("Title is : "+title);
		
		// To Clear method 1 
		
//		obj.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("Vinay");
		        
//        Thread.sleep(3000);
        
//        obj.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).clear();
        
//        Thread.sleep(3000);
        
//        obj.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("Jatin");
        
		// To Clear method 2
        
        WebElement we = obj.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]"));
        
        we.sendKeys("Mark");
        Thread.sleep(3000);
        we.clear();
        Thread.sleep(3000);
        we.sendKeys("John");
        
        String data = we.getAttribute("value");
        System.out.println("Value in TextBox : "+data);
	}

}
