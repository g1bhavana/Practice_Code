package com.selenuim.Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Instance_variable_Browser {
WebDriver driver;
String browser1="Chrome";
String browser2="Fire";
String browser3="edge";
public void launch() throws InterruptedException {
	//Instance_variable_Browser obj = new Instance_variable_Browser();
	if(browser1.equalsIgnoreCase("Chrome")) {
		
		System.setProperty("WebDriver.Chrome.driver","D:\\Qualitythougts\\drivers\\chromedriver-win64\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	 if(browser2.equalsIgnoreCase("Fire")) {
		driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	 if(browser3.equalsIgnoreCase("edge")) {
		System.setProperty("WebDriver.Edge.driver", "D:\\Qualitythougts\\drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://www.indiehackers.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
}
	public static void main(String[] args) throws InterruptedException {
		Instance_variable_Browser obj = new Instance_variable_Browser();
		obj.launch();

	}

}
