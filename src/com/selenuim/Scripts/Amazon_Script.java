package com.selenuim.Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Script {
WebDriver driver;
Actions action;
public void launch() throws InterruptedException {
	//System.setProperty("WebDriver.Chrome.driver", "D:\\Qualitythougts\\drivers\\chromedriver-win64\\chromedriver.exe");
	 driver = new FirefoxDriver();
	 driver.get("https://www.amazon.in/");
	 Thread.sleep(2000);
	 driver.manage().window().maximize();
}
public void Search() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type = 'submit' ])")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[text() = 'Apple iPhone 15 (128 GB) - Black'])")).click();
	driver.getWindowHandle();
	action = new Actions(driver);
	JavascriptExecutor Js = (JavascriptExecutor)driver;
	Js.executeScript("document.body.style.zoom = '1.5'");
	//driver.findElement(By.id("//img[@alt='Apple iPhone 15 (128 GB) - Black']"));
//	driver.switchTo().frame(0);
//	WebElement we = driver.findElement(By.id("magnifierLens"));
//	action.moveToElement(we).build().perform();
	
}

	public static void main(String[] args) throws InterruptedException {
		Amazon_Script obj = new Amazon_Script();
		obj.launch();
		obj.Search();

	}

}
