package org.lUS.comprehensive_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Launch a below browser in Chrome and verify below conditions using Selenium (Use XPaths to Identify Web Elements) with Java https://www.automationanywhere.com/
//a. Automation Anywhere logo should be present //b. Verify Request demo button is present and verify if it is clickable or not
public class Assignment_3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationanywhere.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		boolean cookies = driver.findElement(By.id("onetrust-accept-btn-handler")).isDisplayed();
		if (cookies == true) {
			driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		}
		boolean logName = driver
				.findElement(By.xpath("//img[@src='/sites/default/files/images/default-images/logo-aa-new.svg']"))
				.isDisplayed();
		System.out.println("logo is present  " + logName);
		boolean requestDemo = driver
				.findElement(By.xpath("//a[@class='coh-link coh-style-solid-orange-button btn-link']")).isDisplayed();
		System.out.println("Request Demo button is avalilable  " + requestDemo);
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(6));
		wt.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@class='coh-link coh-style-solid-orange-button btn-link']")));
		driver.close();

	}

}
