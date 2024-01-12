package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// https://demo.guru99.com/test/drag_drop.html

		System.setProperty("webdriver.Chrome.driver",
				"C:\\Users\\CDAC\\Downloads\\chrome-win32\\chrome-win32\\chrome.exe");
		WebDriver obj = new ChromeDriver();
		obj.get("https://demo.guru99.com/test/drag_drop.html");
		obj.manage().window().maximize();
		String title = obj.getTitle();
		System.out.println("Title is : " + title);

		WebElement drag = obj.findElement(By.xpath(
				"//body/section[@id='g-container-main']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]"));

		WebElement drop = obj.findElement(By.xpath(
				"//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ol[1]/li[1]"));

		Actions act = new Actions(obj);

		act.dragAndDrop(drag, drop).build().perform();

		WebElement dragBank = obj.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		WebElement dragSales = obj.findElement(By.xpath("//a[contains(text(),'SALES')]"));

		WebElement dropBank = obj.findElement(By.xpath(
				"//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/ol[1]/li[1]"));
		WebElement dropSales = obj.findElement(By.xpath(
				"//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/ol[1]/li[1]"));

		Actions bank = new Actions(obj);
		Actions sales = new Actions(obj);

		bank.dragAndDrop(dragBank, dropBank).build().perform();
		sales.dragAndDrop(dragSales, dropSales).build().perform();
		
		WebElement drag1 = obj.findElement(By.xpath("//body/section[@id='g-container-main']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]"));
		WebElement drop1 = obj.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ol[1]/li[1]"));
		
		new Actions(obj).dragAndDrop(drag1, drop1).build().perform();
		
		Thread.sleep(2000);
		
		obj.get("https://www.google.com");
		
		// User define xpath
		
		obj.findElement(By.xpath("//textarea[@ id='APjFqb']")).sendKeys("Telusko");
		obj.findElement(By.xpath("//body")).click();
		obj.findElement(By.xpath("//textare  a[@id='APjFqb']//following::input[1]")).click();
	}
}
