package com.org.test.MavenProject1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowHandling {
	WebDriver driver;

	@Test
	public void f() {
		String parentwin = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		for (String winner : windows) {
			driver.switchTo().window(winner);
			String title = driver.getTitle();
			System.out.println(title);

			if (!winner.equals(parentwin)) {
				driver.close();

			}

			driver.switchTo().window(parentwin);

		}

	}

	@BeforeTest
	public void beforetest() {
		System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@AfterTest
	public void aftertest() {
		driver.quit();
	}
}
