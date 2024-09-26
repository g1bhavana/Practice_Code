package com.selenuim.Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic_Script {
	WebDriver driver;
	public void launchAUT() throws InterruptedException{
		
		System.setProperty("Webdriver.ChromeDriver.driver", "D:\\Qualitythougts\\drivers\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//driver.close();
		//driver = new FirefoxDriver();
	}

	public static void main(String[] args) throws InterruptedException {
		Basic_Script obja = new Basic_Script();
		obja.launchAUT();

	}

}
