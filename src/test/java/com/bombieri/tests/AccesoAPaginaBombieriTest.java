package com.bombieri.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AccesoAPaginaBombieriTest {
	
	WebDriver driver;
	
	@Test
	public void test() {
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("bombieri");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector(".g > div > div > .rc .LC20lb")).click();		
		Assert.assertTrue(driver.findElement(By.id("custom-collapse")).isDisplayed());
	}
  
	@BeforeTest
	public void beforeTest() {
		System.getProperties().setProperty("webdriver.chrome.driver", "src\\test\\resources\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
