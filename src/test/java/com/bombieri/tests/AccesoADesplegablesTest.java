package com.bombieri.tests;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class AccesoADesplegablesTest {
	
	WebDriver driver;
	DesiredCapabilities cap;
	
	@Test
	public void f() {
		driver.get("https://es-la.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("probandoooo@gmail.gmail.com");
		//driver.findElement(By.xpath("//a[contains(@href,'#')]")).click();
		//driver.findElement(By.xpath("//a[contains(@href,'https://www.bombieri.com.ar/b/consulting')]")).click();
	}
  
	@BeforeTest
	public void beforeTest() throws MalformedURLException {
		//System.getProperties().setProperty("webdriver.chrome.driver", "src\\test\\resources\\WebDrivers\\chromedriver.exe");
		//driver = new ChromeDriver();
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap.chrome());
		
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
