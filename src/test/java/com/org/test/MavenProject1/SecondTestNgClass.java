package com.org.test.MavenProject1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SecondTestNgClass {
  @Test
  public void f() {
	  System.out.println("Test");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
      WebDriver driver= new ChromeDriver();
      driver.get("http:www.eclipse.org/m2e");
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
