package com.learn.automation.maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class noddleLoginTest {
	WebDriver driver;
	
	@BeforeTest
	public void setUp(){
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		}
	
	@Test
	public void loginPageTest(){
		driver.navigate().to("https://noddle.co.uk");
		String title=driver.getTitle();
		System.out.println(title+ "Passed Mvn");
		}
	@AfterTest
	public void testDown(){
		driver.quit();
	}

}
