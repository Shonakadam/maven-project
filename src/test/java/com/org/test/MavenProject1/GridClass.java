package com.org.test.MavenProject1;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class GridClass {
  public static void main(String args[]) {
	  System.setProperty("webdriver.chrome.driver ", "Resoures/chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.freecrm.com/index.html”");
	  driver.manage().window().maximize();
	  driver.quit();
	  
	 
	 
  }
  

}
