package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMsg {

	private static void changePageColor(WebDriver driver, String color) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        String script = "document.body.style.backgroundColor = '" + color + "'";
        jsExecutor.executeScript(script);
    }
	
	public static void main(String[] args) {

		System.setProperty("webdriver.Chrome.driver",
				"C:\\Users\\CDAC\\Downloads\\chrome-win32\\chrome-win32\\chrome.exe");
		WebDriver obj = new ChromeDriver();
		obj.get("https://demo.guru99.com/v4/");

		String title = obj.getTitle();
		System.out.println("Title is : " + title);

		WebElement we1 = obj.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));

		we1.click();

		WebElement we2 = obj.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]"));

		we2.click();

		String str = obj.findElement(By.xpath("//label[@id='message23']")).getText();

		System.out.println("Message From Text Box 1 : " + str);

		obj.findElement(By.xpath("//body")).click();

		String str1 = obj.findElement(By.xpath("//label[@id='message18']")).getText();

		System.out.println("Message From Text Box 2 : " + str1);
		
		obj.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
		
		Alert a = obj.switchTo().alert();
		System.out.println("Message From Alert Box : "+a.getText());
		a.accept();
		
		changePageColor(obj, "Red");
		
	}

}
