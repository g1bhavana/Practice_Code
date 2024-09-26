package com.selenuim.Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_script {
	WebDriver driver;
	public void launch() throws InterruptedException {
		System.setProperty("WebDriver.Chrome.driver", "D:\\Qualitythougts\\drivers\\chromedriver-win64\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://login.salesforce.com/");
		 Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.id("signup_link")).click();
		driver.findElement(By.name("UserFirstName")).sendKeys("Bhavana");
		driver.findElement(By.name("UserLastName")).sendKeys("Gourishetti");
		driver.findElement(By.name("UserEmail")).sendKeys("bhavana@gmail.com");
		driver.findElement(By.name("UserTitle")).sendKeys("Test Engineer");
		driver.findElement(By.name("CompanyName")).sendKeys("DQ labs");
		driver.findElement(By.name("UserPhone")).sendKeys("987654321");
	}
	public void dropdown() throws InterruptedException {
//		WebElement web = driver.findElement(By.name("UserTitle"));
//		Select obj = new Select(web);
//		obj.selectByIndex(3);
		
		WebElement web1 = driver.findElement(By.name("CompanyEmployees"));
		Select obj1 = new Select(web1);
		obj1.selectByIndex(2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		dropdown_script obje = new dropdown_script();
		obje.launch();
		obje.dropdown();

	}
	

}
