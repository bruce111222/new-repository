package com.Webportal;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Webportal_XWC {
@Test
  public void TestOperation() {
	  driver.get("https://xwctest.services.xerox.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='login']")).click();
		driver.findElement(By.xpath("//input[@id='EmailAddress']")).sendKeys("kannan.raveendran@xerox.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
	    //WebDriverWait wait = new WebDriverWait(driver1 , 20);
	    //wait.until(ExpectedConditions.elementToBeClickable(password));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    password.sendKeys("Password00");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
  }
  WebDriver driver;
  @BeforeTest
  public void BrowserInvoke() {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\q5vtrmq5\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
  }

  @AfterTest
  public void CloseOperation() {
	 // driver.close();
	 // driver.quit();
  }

}
