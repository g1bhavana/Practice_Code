package com.selenuim.Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
	WebDriver driver;
	public void launch() throws InterruptedException {
		System.setProperty("WebDriver.Chrome.driver", "D:\\Qualitythougts\\drivers\\chromedriver-win64\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(2000);
		driver.manage().window().maximize();
		
	}
	public void login() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@class='oxd-glass-button orangehrm-upgrade-button']")).click();
//		Thread.sleep(2000);
		
	}
	public void dashboard() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title='Apply Leave']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
	}

	public static void main(String[] args) throws InterruptedException {
		xpath obj = new xpath();
		obj.launch();
		obj.login();
		obj.dashboard();

	}

}
