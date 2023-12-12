package org.lUS.comprehensive_1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

//Implement 3 and 4 Programs using TestNG Concepts and write it using @Test annotation.
//And add TestNG Attributes – priority, enabled and timeOut to run the programs.
//Run the program with enabled attribute value as either true or false
//Run the program with timeOut Attribute values
//And run 3 and 4 Programs from TestNG.xml file and verify the generated test reports.
public class Assignment_5 {
	
	@Test(enabled = true)
	public void automationanywhere() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.automationanywhere.com/");
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

	@Test(priority = 1)
	public void AllLinks() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.automationanywhere.com/");
		boolean cookies = driver.findElement(By.id("onetrust-accept-btn-handler")).isDisplayed();
		if (cookies == true) {
			driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		}
		for (int i = 0; i <= 4; i++) {
			System.out.println(driver.findElements(By
					.xpath("//ul[@class='coh-menu-list-container coh-unordered-list menu-level-1 coh-ce-646fa54d']/li"))
					.get(i).getText());
			// String clickOnLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			driver.findElements(By
					.xpath("//ul[@class='coh-menu-list-container coh-unordered-list menu-level-1 coh-ce-646fa54d']/li"))
					.get(i).click();
			System.out.println(driver.getTitle());
			driver.navigate().back();

		}
		driver.close();

	}

	@Test(timeOut = 5000)
	public void AllLinks1() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.automationanywhere.com/");
		boolean cookies = driver.findElement(By.id("onetrust-accept-btn-handler")).isDisplayed();
		if (cookies == true) {
			driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		}
		for (int i = 0; i <= 4; i++) {
			System.out.println(driver.findElements(By
					.xpath("//ul[@class='coh-menu-list-container coh-unordered-list menu-level-1 coh-ce-646fa54d']/li"))
					.get(i).getText());
			// String clickOnLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			driver.findElements(By
					.xpath("//ul[@class='coh-menu-list-container coh-unordered-list menu-level-1 coh-ce-646fa54d']/li"))
					.get(i).click();
			System.out.println(driver.getTitle());
			driver.navigate().back();

		}
		driver.close();

	}

	@Test(enabled = false)
	public void automationanywhere1() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.automationanywhere.com/");
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
