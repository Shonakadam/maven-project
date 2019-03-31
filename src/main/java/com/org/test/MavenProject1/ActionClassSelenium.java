package com.org.test.MavenProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionClassSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource.demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		
		

	}

}
