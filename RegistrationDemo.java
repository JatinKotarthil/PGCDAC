package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\CDAC\\Downloads\\chrome-win32\\chrome-win32\\chrome.exe");
		WebDriver obj = new ChromeDriver();
		obj.get("https://demo.automationtesting.in/Register.html");
		
		String title = obj.getTitle();
		System.out.println("Title is : "+title);
		
		obj.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("Vinay");
		
		obj.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]")).sendKeys("Kotarthil");
		
        obj.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]")).sendKeys("Mumbai");
      
        obj.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys("jatin@gmail.com");
        
        obj.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")).sendKeys("9579049364");
	
        obj.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/label[1]/input[1]")).click();
        
        obj.findElement(By.xpath("//input[@id='checkbox2']")).click();

        
        Select skill = new Select(obj.findElement(By.id("Skills")));
        skill.selectByValue("Unix");
        
        Select year = new Select(obj.findElement(By.xpath("//select[@id='yearbox']")));
        year.selectByValue("2000");
        
        Select month = new Select(obj.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[11]/div[2]/select[1]")));
        month.selectByValue("October");
        
        Select day = new Select(obj.findElement(By.xpath("//select[@id='daybox']")));
        day.selectByValue("2");
        
        obj.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("jatin123");
        obj.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("jatin123");
        
        Thread.sleep(3000);
        
        obj.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).clear();
        
        Thread.sleep(3000);
        
        obj.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("Jatin");
        
	}

}
