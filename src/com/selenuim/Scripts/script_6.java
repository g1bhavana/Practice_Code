package com.selenuim.Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script_6 {
	WebDriver driver;
	public void launch() throws InterruptedException {
		System.setProperty("WebDriver.Chrome.driver","D:\\Qualitythougts\\drivers\\chromedriver-win64\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15 ");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		script_6 obj = new script_6();
		obj.launch();

	}

}
