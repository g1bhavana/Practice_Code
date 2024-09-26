package com.selenuim.Scripts;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_9 {
	WebDriver driver;
	public void Launch() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Expected number");
		int count = sc.nextInt();
		for(int i=0;i<count;i++) {
			System.setProperty("Webdriver.Chrome.driver", "D:\\Qualitythougts\\drivers\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			
		}
	}
	public static void main(String[] args) throws InterruptedException {
		Script_9 obj = new Script_9();
		obj.Launch();

	}

}
