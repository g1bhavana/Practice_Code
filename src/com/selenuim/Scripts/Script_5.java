package com.selenuim.Scripts;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_5 {
	WebDriver driver;
	public void launch() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter url");
		String url = sc.nextLine();
		System.out.println("Enter Number");
		int count = sc.nextInt();
		for(int i=0;i<count;i++) {
			System.setProperty("WebDriver.Chrome.driver","D:\\Qualitythougts\\drivers\\chromedriver-win64\\chromedriver.exe" );
			driver = new ChromeDriver();
			driver.get(url);
			Thread.sleep(2000);
			driver.manage().window().maximize();
			driver.close();
		}
		
	}

	
	public static void main(String[] args) throws InterruptedException  {
		Script_5 obj = new Script_5();
		obj.launch();

	}

}
