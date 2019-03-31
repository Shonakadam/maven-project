package com.org.test.MavenProject1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	 

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
	WebDriver	driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		

	}

}
