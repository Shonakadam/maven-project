package com.org.test.MavenProject1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Frame {
	WebDriver driver;
  @Test
  public void f() {
	  
	  WebElement frm1=driver.findElement(By.xpath("//frame[@name='packageListFrame']"));
	 driver.switchTo().frame(frm1);
	  
	  WebElement link1=driver.findElement(By.xpath("//a[@href='com/thoughtworks/selenium/condition/package-frame.html']"));
	  link1.click();
	  driver.switchTo().defaultContent();
	  
	  
	  WebElement frm2=driver.findElement(By.xpath("//frame[@src='overview-frame.html']"));
	  driver.switchTo().frame(frm2);
	  WebElement link2=driver.findElement(By.xpath("//a[@href='org/openqa/selenium/chrome/package-frame.html']"));
	  link2.click();
	  driver.switchTo().defaultContent();
	  
	  
  }
  
  @BeforeTest
  public void beforetest() {
	  System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

  }

  
  @AfterTest
  public void aftertest() {
	  driver.quit();
	  
  }
}