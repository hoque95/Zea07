package mctpages;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class MasterPages {
	WebDriver driver = new ChromeDriver();
	public static void main(String[] args) {
				
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hoque\\eclipse-workspace\\Home\\Zeal07\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com");
		    
	}

	public void OpenUrl(String url) {
		driver.get(url);	
	}
	
	
	
	public void browserHandler() {
		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();
	}
	
	public void waitFor(long waitTime ) {
		driver.manage().timeouts().implicitlyWait(waitTime,TimeUnit.SECONDS);
	}
	
	//Click
	
	public void clickOnElement(String locators) {
		 
	try {
		driver.findElement(By.id(locators)).click();
	} catch (Exception e) {
		// TODO: handle exception
		
	     try {
		driver.findElement(By.xpath(locators)).click();
	         } catch (Exception e1) {
		         // TODO: handle exception
	
	           try {
		       driver.findElement(By.cssSelector(locators)).click();
	                 } catch (Exception e2) {driver.findElement(By.name(locators)).click();
		              // TODO: handle exception
	
	}}}}
		
	// Click and type
	
	public void typeOnElement(String locators, String value) {
		
	try {
		driver.findElement(By.id(locators)).sendKeys(value);
	}catch (Exception e1) {	
	try {
		driver.findElement(By.xpath(locators)).sendKeys(value);
	} catch (Exception e2) {
	try {
		driver.findElement(By.cssSelector(locators)).sendKeys(value);
	} catch (Exception e3) {driver.findElement(By.name(locators)).sendKeys(value);
	
		
	}}}}
	
	// Mouse Over
	
	public void mouseOver(String locators) {
		Actions actions = new Actions(driver);
		
	try {
		actions.moveToElement(driver.findElement(By.id(locators))).build().perform();
	} catch (Exception e) {
		// TODO: handle exception
	
	try {
		actions.moveToElement(driver.findElement(By.xpath(locators))).build().perform();
	} catch (Exception e2) {
		// TODO: handle exception
	try {
		actions.moveToElement(driver.findElement(By.cssSelector(locators))).build().perform();
	} catch (Exception e3) {actions.moveToElement(driver.findElement(By.name(locators))).build().perform();
		// TODO: handle exception
	
	}}}}

	public void closeBrowser() {
		driver.close();
		
	}
	
	
	
}
