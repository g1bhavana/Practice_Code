package com.selenuim.Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Appln_8 {
	WebDriver driver;
	public void Edge() throws InterruptedException {
		System.setProperty("WebDriver.Edge.driver", "D:\\Qualitythougts\\drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://www.indiehackers.com/sign-in");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ember27")).sendKeys("Bhavana123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("ember28")).sendKeys("1234567");
		Thread.sleep(2000);
		driver.findElement(By.id("ember29")).click();
		
	}

	public static void main(String[] args) throws InterruptedException {
		Appln_8 obj = new Appln_8();
		obj.Edge();

	}

}
