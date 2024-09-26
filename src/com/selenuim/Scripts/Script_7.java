package com.selenuim.Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_7 {
	WebDriver driver;
	public void browser() throws InterruptedException {
		System.setProperty("WebDriver.Chrome.driver","D:\\Qualitythougts\\drivers\\chromedriver-win64\\chromedriver.exe" );
		driver = new ChromeDriver();
		Thread.sleep(2000);
		driver = new FirefoxDriver();
		Thread.sleep(2000);
		System.setProperty("WebDriver.Edge.driver", "D:\\Qualitythougts\\drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
	}
	

	public static void main(String[]args) throws InterruptedException {
		Script_7 obj = new Script_7();
		obj.browser();
	}
}
