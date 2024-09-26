package com.selenuim.Scripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	WebDriver driver;
	public void launch() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
	}
	public void sendData() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("bhavana123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("1234567");
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
		Thread.sleep(3000);
	}
	public void screenshot() throws IOException, InterruptedException {
		Thread.sleep(3000);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\User\\Desktop\\xyz.jpg");
		FileHandler.copy(src, des);
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		Screenshot obj = new Screenshot();
		obj.launch();
		obj.sendData();
		obj.screenshot();
		

			}

}
