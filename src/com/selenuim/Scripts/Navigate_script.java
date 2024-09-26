package com.selenuim.Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_script {
	WebDriver driver;
	
	public void launch() throws InterruptedException {
		System.setProperty("WebDriver.Chrome.driver", "D:\\Qualitythougts\\drivers\\chromedriver-win64\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 Thread.sleep(2000);
		driver.manage().window().maximize();
		
	}
	public void navigateto() throws InterruptedException {
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
	}

	public static void main(String[] args) throws InterruptedException {
		Navigate_script obj = new Navigate_script();
		obj.launch();
		obj.navigateto();
	}

}
