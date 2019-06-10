package com.bombieri.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class BombieriAccessTest {
	
	WebDriver driver;
	
  @Test
  public void f() {
	  driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.name("q")).click();
	    driver.findElement(By.name("q")).sendKeys("bombieri");
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  
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
