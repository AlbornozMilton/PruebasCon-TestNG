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
		
		driver.findElement(By.cssSelector("div:nth-child(2) > .rc .LC20lb")).click();
		driver.findElement(By.cssSelector(".inner-nav > li:nth-child(1) > a")).click();
		driver.findElement(By.cssSelector(".inner-nav > li:nth-child(2) > a")).click();
		driver.findElement(By.cssSelector(".inner-nav > li:nth-child(1) > a")).click();
		driver.findElement(By.cssSelector("li:nth-child(5) > a")).click();
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.getProperties().setProperty("webdriver.chrome.driver", "C:\\Users\\Bombieri5\\Downloads\\Instaladores\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
