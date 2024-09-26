package com.selenuim.Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_4 {
	WebDriver driver;
	public void launch() throws InterruptedException {
		System.setProperty("WebDriver.Chrome.driver", "D:\\Qualitythougts\\drivers\\chromedriver-win64\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://login.salesforce.com/");
		 Thread.sleep(2000);
		driver.manage().window().maximize();
		
	}
	public void url() {
		String exp = "https://login.salesforce.com/";
		String act = driver.getCurrentUrl();
		if(exp.equalsIgnoreCase(act)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}
	public void close() {
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		Script_4 obj = new Script_4();
		obj.launch();
		obj.url();

	}

}
