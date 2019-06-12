package com.bombieri.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AccesoAPaginaBombieriTest {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Test
	public void test() {
		driver.get("http://www.bombieri.com.ar/?lang=spanish");
		//driver.findElement(By.name("q")).sendKeys("bombieri software factory");
		//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		//driver.findElement(By.className("LC20lb")).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("custom-collapse")));
			//wait.until(ExpectedConditions.elementToBeClickable (By.xpath("//a[contains(@href,'https://www.bombieri.com.ar/b/contact')]")));
			//driver.findElement(By.xpath("//a[contains(@href,'https://www.bombieri.com.ar/b/contact')]")).click();
		//Assert.assertTrue(driver.findElement(By.id("custom-collapse")).isDisplayed());
	}
  
	@BeforeTest
	public void beforeTest() {
		System.getProperties().setProperty("webdriver.chrome.driver", "src\\test\\resources\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver,30);
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
