package com.qa.testngdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AppTest {
  @Test
  public void seltest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver\\\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		WebDriver wd = new ChromeDriver(co);
		Reporter.log("the browser is opennow");
		wd.get("http://localhost:8080/addressbook/");

		
		
		wd.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		wd.findElement(By.className("v-button")).click();
		wd.findElement(By.id("gwt-uid-5")).sendKeys("Niladri Sankar");
		wd.findElement(By.id("gwt-uid-7")).sendKeys("Mondal");
		wd.findElement(By.id("gwt-uid-9")).sendKeys("9999999999");
		wd.findElement(By.id("gwt-uid-11")).sendKeys("nil@gmail.com");
		wd.findElement(By.id("gwt-uid-13")).sendKeys("6/6/23,");
		Reporter.log("details are specified");
		Thread.sleep(2000);
		
		wd.findElement(By.className("v-button-primary")).click();
		
		Thread.sleep(2000);
		wd.quit();
		
	}

}
