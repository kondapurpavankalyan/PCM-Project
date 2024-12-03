package com.pcm.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.jacob.com.LibraryLoader;
import com.pcm.qa.util.TestUtil;
import com.pcm.qa.util.WebEventListener;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import autoitx4java.AutoItX;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;

	public static ExtentReports _extent_report;

	public static ExtentTest _test_logger1;
	public static ExtentTest _test_logger2;
	public static ExtentTest _test_logger3;
	public static ExtentTest _test_logger4;
	public static ExtentTest _test_logger5;
	public static ExtentTest _test_logger6;
	public static ExtentTest _test_logger7;
	public static ExtentTest _test_logger8;
	public static ExtentTest _test_logger9;
	public static ExtentTest _test_logger100;

	public static ExtentTest _test_logger101;
	public static ExtentTest _test_logger201;
	public static ExtentTest _test_logger301;
	public static ExtentTest _test_logger302;
	public static ExtentTest _test_logger401;

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/" + "com/pcm/qa/config/config.properties");
			prop.load(ip);
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void initialization() throws InterruptedException {

		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {

			WebDriverManager.chromedriver().setup();

			//driver = new ChromeDriver();

			//incognito mode
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			options.setAcceptInsecureCerts(true);
			options.setPageLoadStrategy(PageLoadStrategy.EAGER);
				
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			options.merge(capabilities);
			
			driver = new ChromeDriver(options);

		}

		else if (browserName.equals("firefox")) {

			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();
		}

		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with
		// EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;

		driver.manage().window().maximize();
		 Set cookie = driver.manage().getCookies();
		driver.manage().deleteAllCookies();
		System.out.println("The availabe cookies are : " +cookie.size());

		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, 10);

		 driver.get(prop.getProperty("url"));
		
		// Advanced Page Options chrome

		/*
		driver.findElement(By.xpath("//button[@id='details-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
		Thread.sleep(1000);

		*/
		
		wait.until(ExpectedConditions
				.or(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='username']"))));

		driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys(prop.getProperty("username"));

		driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys(prop.getProperty("password"));

		driver.findElement(By.xpath("//button[@class='btn__login mat-flat-button mat-warn']")).click();

		Thread.sleep(1000);

	}

	public static void Actionselection(WebDriver driver, WebElement e) throws InterruptedException {

		Actions a = new Actions(driver);

		a.moveToElement(e).click().build().perform();

	}

	public static void DropDownSelection(WebElement e, String tobeselected) throws InterruptedException {

		/*
		 * Actions a = new Actions(driver); a.moveToElement(e).click().perform();
		 */
		e.click();
		List<WebElement> links = driver.findElements(By.tagName("mat-option")); // storing the size of the links
		boolean f = false;
		for (int j = 0; j < links.size(); j++) {
			// Printing the links
			// System.out.println(links.get(j).getText());

			String s = links.get(j).getText();
			if (s.equalsIgnoreCase(tobeselected)) {

				Thread.sleep(2000);

				links.get(j).click();
				f = true;
			}
			if (f == true) {
				break;
			}
		}
	}

	public void FileUpload(String Filepath) throws Exception {
		/*
		 * System.setProperty(LibraryLoader.JACOB_DLL_PATH,
		 * "C:\\Users\\pavan.kondapur\\Eclipse_Workspace\\PCM\\resources\\jacob-1.19-x64.dll"
		 * ); AutoItX x = new AutoItX(); // System.out.println("x"+x.toString());
		 * x.winWait("Open", ""); Thread.sleep(1000); x.winActive("Open", "");
		 * Thread.sleep(1000); x.controlFocus("Open", "", "Edit1"); Thread.sleep(1000);
		 * x.ControlSetText("Open", "", "Edit1", Filepath); Thread.sleep(1000);
		 * x.controlClick("Open", "", "Button1"); Thread.sleep(1000);
		 */
		Thread.sleep(2000);
		Runtime.getRuntime().exec(Filepath);
		
		

	}

	public static String takeScreenshotAtEndOfTest(WebDriver driver, String scname) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		String dest = currentDir + "/screenshots/" + scname + ".png";

		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + scname + ".png"));
		return dest;

	}

	public static void login() throws Exception {

		driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys(prop.getProperty("username"));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys(prop.getProperty("password"));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn__login mat-flat-button mat-warn']")).click();
		Thread.sleep(3000);

	}

	public static void logout() throws Exception {

		Thread.sleep(2000);

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.or(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//span//mat-icon[contains(text(),'account_box')]"))));

		driver.findElement(By.xpath("//span//mat-icon[contains(text(),'account_box')]")).click();

		Thread.sleep(2000);

		wait.until(ExpectedConditions
				.or(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Logout')]"))));

		driver.findElement(By.xpath("//button[contains(text(),'Logout')]")).click();

		Thread.sleep(3000);

	}

	public static void SelectDate(WebDriver driver, String datevalue, WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + datevalue + "');", element);
	}

	public static void Extentreport() {
		_extent_report = new ExtentReports(System.getProperty("user.dir") + File.separator + "PCMExtent.html");
		_extent_report.loadConfig(new File(
				System.getProperty("user.dir") + "\\src\\main\\java\\com\\pcm\\qa\\config\\extent-config.xml"));

	}

}
