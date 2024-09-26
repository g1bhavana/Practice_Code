package com.selenuim.Scripts;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Script_3 {
	WebDriver driver;
	public void launch() {
		System.setProperty("WebDriver.Chrome.driver", "D:\\Qualitythougts\\drivers\\chromedriver-win64\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		
	}
	public void getsourcecode() {
		String data = driver.getPageSource();
		System.out.println(data);
		if(data.contains("label usernamelabel")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}

	public static void main(String[] args) {
		Script_3 obj = new Script_3();
		obj.launch();
		obj.getsourcecode();

	}

}
