package com.pcm.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pcm.qa.base.TestBase;
import com.pcm.qa.util.TestUtil;
import com.pcm.qa.util.WebEventListener;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MailboxDirectoryCreation extends TestBase {

	public ExtentTest Parent1;
	public ExtentTest child1;
	public ExtentTest child2;

	public MailboxDirectoryCreation() {
		super();
	}


	@Test(priority = 2, enabled = true, description = "Mailbox Directory Creation")

	public void createMailbOX() throws InterruptedException {

		try {
			
			String name = "ftp5000";
			Thread.sleep(2000);
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/resources/chromedriver.exe");

			driver = new ChromeDriver();
			
			e_driver = new EventFiringWebDriver(driver);
			// Now create object of EventListerHandler to register it with
			// EventFiringWebDriver
			eventListener = new WebEventListener();
			e_driver.register(eventListener);
			driver = e_driver;

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			
			WebDriverWait wait = new WebDriverWait(driver, 10);
			
		//	driver.get("http://35.173.166.147:10000/dashboard/Login");  
			driver.get("http://20.55.8.64:10000/dashboard/Login");  
			
			driver.findElement(By.xpath("//input[@name='autho']")).sendKeys("fg_sysadmin");

			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
			
			Thread.sleep(2000);

			driver.findElement(By.xpath("//input[@name='submit']")).click();

			Thread.sleep(4000);

			// leftside contents in Mailbox SI
			
			wait.until(ExpectedConditions.or( ExpectedConditions.visibilityOfElementLocated(By.xpath("//li//a[text()='Deployment']"))));

			driver.findElement(By.xpath("//li//a[text()='Deployment']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//li//a[text()='Mailboxes']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[text()='Configuration'])[2]")).click();

			driver.switchTo().frame(0);
			Thread.sleep(3000);
			wait.until(ExpectedConditions.or( ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='Go1']"))));
			driver.findElement(By.xpath("//input[@name='Go1']")).click();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.or( ExpectedConditions.visibilityOfElementLocated(By.xpath("(//select//option)[1]"))));

			driver.findElement(By.xpath("(//select//option)[1]")).click();
			driver.findElement(By.xpath("//input[@name='mboxName']")).sendKeys(name);
			driver.findElement(By.xpath("//input[@name='desc']")).sendKeys(name);
			driver.findElement(By.xpath("//input[@name='wiznext']")).click();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.or( ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@name='RightDblArrow0']"))));

			driver.findElement(By.xpath("//img[@name='RightDblArrow0']")).click();
			driver.findElement(By.xpath("//input[@name='wiznext']")).click();
			driver.findElement(By.xpath("//img[@name='RightDblArrow0']")).click();
			driver.findElement(By.xpath("//input[@name='wiznext']")).click();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.or( ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='wizfinish']"))));

			driver.findElement(By.xpath("//input[@name='wizfinish']")).click();
			Thread.sleep(3000);
			
			
			wait.until(ExpectedConditions.or( ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='Return']"))));


			driver.findElement(By.xpath("//input[@name='Return']")).click();
			Thread.sleep(5000);
			wait.until(ExpectedConditions.or( ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='Go1']"))));

			driver.findElement(By.xpath("//input[@name='Go1']")).click();
			driver.findElement(By.xpath("//input[@name='mboxFilter']")).sendKeys("/" + name);
			wait.until(ExpectedConditions.or( ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@name='Filter']"))));

			driver.findElement(By.xpath("//img[@name='Filter']")).click();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.or( ExpectedConditions.visibilityOfElementLocated(By.xpath("(//select//option)[1]"))));

			driver.findElement(By.xpath("//select//option[1]")).click();
			driver.findElement(By.xpath("//input[@name='mboxName']")).sendKeys("in");
			driver.findElement(By.xpath("//input[@name='desc']")).sendKeys("in");
			driver.findElement(By.xpath("//input[@name='wiznext']")).click();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.or( ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@name='RightDblArrow0']"))));

			driver.findElement(By.xpath("//img[@name='RightDblArrow0']")).click();
			driver.findElement(By.xpath("//input[@name='wiznext']")).click();
			driver.findElement(By.xpath("//img[@name='RightDblArrow0']")).click();
			driver.findElement(By.xpath("//input[@name='wiznext']")).click();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.or( ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='wizfinish']"))));

			driver.findElement(By.xpath("//input[@name='wizfinish']")).click();
			Thread.sleep(2000);
			
			wait.until(ExpectedConditions.or( ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='Return']"))));

			driver.findElement(By.xpath("//input[@name='Return']")).click();
			Thread.sleep(5000);
			wait.until(ExpectedConditions.or( ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='Go1']"))));

			driver.findElement(By.xpath("//input[@name='Go1']")).click();
			driver.findElement(By.xpath("//input[@name='mboxFilter']")).sendKeys("/" + name);
			wait.until(ExpectedConditions.or( ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@name='Filter']"))));
			driver.findElement(By.xpath("//img[@name='Filter']")).click();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.or( ExpectedConditions.visibilityOfElementLocated(By.xpath("(//select//option)[1]"))));

			driver.findElement(By.xpath("//select//option[1]")).click();
			driver.findElement(By.xpath("//input[@name='mboxName']")).sendKeys("out");
			driver.findElement(By.xpath("//input[@name='desc']")).sendKeys("out");
			driver.findElement(By.xpath("//input[@name='wiznext']")).click();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.or( ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@name='RightDblArrow0']"))));

			driver.findElement(By.xpath("//img[@name='RightDblArrow0']")).click();
			driver.findElement(By.xpath("//input[@name='wiznext']")).click();
			driver.findElement(By.xpath("//img[@name='RightDblArrow0']")).click();
			driver.findElement(By.xpath("//input[@name='wiznext']")).click();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.or( ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='wizfinish']"))));

			driver.findElement(By.xpath("//input[@name='wizfinish']")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			child1.log(LogStatus.FAIL, e.fillInStackTrace());
		}

	}

}
