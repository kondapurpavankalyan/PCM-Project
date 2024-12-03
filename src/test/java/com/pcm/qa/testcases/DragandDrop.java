package com.pcm.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.pcm.qa.base.TestBase;



public class DragandDrop extends TestBase{
	
	
	@Test
	public void test1() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/resources/chromedriver.exe");  
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://35.173.166.147:7080/#/pcm/settings/pooling-interval");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        
        driver.get("https://35.173.166.147:7080/#/login");

		// Advanced Page Options chrome
	
		driver.findElement(By.xpath("//button[@id='details-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.or( ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='username']"))));

		driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys(prop.getProperty("username"));

		driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys(prop.getProperty("password"));

		driver.findElement(By.xpath("//button[@class='btn__login mat-flat-button mat-warn']")).click();

        Thread.sleep(3000);
        
        driver.findElement(By.xpath("(//*[text()[contains(.,'Setting')]])[1]")).click();
        
    	Thread.sleep(1000);
     
    	driver.findElement(By.xpath("(//*[text()[contains(.,'Polling Interval')]])[1]")).click();
    	
    	  Thread.sleep(2000);
        
        Actions action = new Actions(driver);
        action.clickAndHold(driver.findElement(By.xpath("(//tr//td[3])[1]"))).moveToElement(driver.findElement(By.xpath("(//tr//td[3])[2]"))).release().build().perform();
        
        
     //   driver.close();
		
		
	}
	
	

}
