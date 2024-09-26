package com.selenuim.Scripts;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sales_Appln {
WebDriver driver;
public void launch() throws InterruptedException {
//	System.setProperty("WebDriver.Chrome.driver","D:\\Qualitythougts\\drivers\\chromedriver-win64\\chromedriver.exe" );
//	driver = new ChromeDriver();
	driver = new FirefoxDriver();
	driver.get("https://login.salesforce.com/?locale=in");
	driver.manage().window().maximize();
}
public void sendData(String username,String password) throws InterruptedException {
	driver.findElement(By.id("username")).sendKeys(username);
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys(password);
	Thread.sleep(2000);
	driver.findElement(By.id("Login")).click();
}
		
	
	public static void main(String[] args) throws InterruptedException {
		sales_Appln obj = new sales_Appln();
		obj.launch();
		obj.sendData("Priya@123", "Priyanka");
		obj.sendData("likitha123@gmail.com", "Likhitha");
		
	}

}
