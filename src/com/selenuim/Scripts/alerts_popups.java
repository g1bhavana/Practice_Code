package com.selenuim.Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts_popups {
	WebDriver driver;
	
	public void launch() throws InterruptedException {
		System.setProperty("WebDriver.Chrome.driver", "D:\\Qualitythougts\\drivers\\chromedriver-win64\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.indiehackers.com/sign-in");
		 Thread.sleep(2000);
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Reset")).click();
	}
public void Clickok() throws InterruptedException {
	driver.findElement(By.xpath("(//a[@class='auth-wizard__repair-link'])[2]")).click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	
	
}
public void ClickCancel() throws InterruptedException {
	driver.findElement(By.xpath("(//a[@class='auth-wizard__repair-link'])[2]")).click();
	Thread.sleep(2000);
	driver.switchTo().alert().dismiss();
	Thread.sleep(2000);
	
}
public void sendData() throws InterruptedException {
	driver.findElement(By.xpath("(//a[@class='auth-wizard__repair-link'])[2]")).click();
	Thread.sleep(2000);
	driver.switchTo().alert().sendKeys("bhavana@gmail.com");
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
}
public void GetText() throws InterruptedException {
	driver.findElement(By.xpath("(//a[@class='auth-wizard__repair-link'])[2]")).click();
	Thread.sleep(2000);
	String data = driver.switchTo().alert().getText();
	System.out.println(data);
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	
}
	public static void main(String[] args) throws InterruptedException {
		alerts_popups obj = new alerts_popups();
		obj.launch();
		obj.Clickok();
		obj.ClickCancel();
		obj.sendData();
		obj.GetText();

	}

}
