package com.selenuim.Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_2 {
	WebDriver driver;
		public void Launch() {
			System.setProperty("WebDriver.Chrome.driver","D:\\Qualitythougts\\drivers\\chromedriver-win64\\chromedriver.exe" );
			driver = new ChromeDriver();
			driver.get("https://login.salesforce.com/");
			driver.manage().window().maximize();
		}
		public void gettitle() {
			String exp = "Login | Salesforce";
			String act = driver.getTitle();
			System.out.println(act);
			if(exp.equalsIgnoreCase(act))
			{
				System.out.println("Both are samre");
			}
			else {
				System.out.println("Not same");
			}
			
		}
		
	public static void main(String[] args) {
		Script_2 obj = new Script_2();
		obj.Launch();
		obj.gettitle();

	}

}
