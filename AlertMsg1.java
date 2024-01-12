package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMsg1 {

	private static void changePageColor(WebDriver driver, String color) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		String script = "document.body.style.backgroundColor = '" + color + "'";
		jsExecutor.executeScript(script);
	}

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.Chrome.driver",
				"C:\\Users\\CDAC\\Downloads\\chrome-win32\\chrome-win32\\chrome.exe");
		WebDriver obj = new ChromeDriver();
		obj.get("https://demo.automationtesting.in/Alerts.html");

		String title = obj.getTitle();
		System.out.println("Title is : " + title);

		obj.findElement(By.xpath("//button[contains(text(),'alert box:')]")).click();

		Alert a = obj.switchTo().alert();
		System.out.println("Message From Alert Box 1 : " + a.getText());
		a.accept();

		changePageColor(obj, "Red");
		Thread.sleep(2000);

		obj.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		obj.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).click();

		Alert a1 = obj.switchTo().alert();
		System.out.println("Message From Alert Box 2 : " + a1.getText());
		a1.accept();

		changePageColor(obj, "Yellow");
		Thread.sleep(2000);

		obj.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		obj.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]"))
				.click();

		Alert a2 = obj.switchTo().alert();
		a2.sendKeys("Jatin");
		a2.accept();
		String s = obj.findElement(By.xpath("//p[@id='demo1']")).getText();
		System.out.println("Message from 3 : " + s);

		changePageColor(obj, "Pink");

		Thread.sleep(2000);

		String back = obj.getWindowHandle();

		// Open New TAB
		obj.switchTo().newWindow(WindowType.TAB);
		obj.get("https://www.google.com");

		// storing obj for current tab

		String back1 = obj.getWindowHandle();
		
		// Open 2nd TAB
		
		obj.switchTo().newWindow(WindowType.TAB);
		obj.get("https://www.google.com");
		
		obj.switchTo().window(back1);
		
		Thread.sleep(2000);
		
		obj.switchTo().window(back);
	}

}
