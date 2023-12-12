package org.lUS.comprehensive_1;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Launch a below browser in Chrome and verify below conditions using Selenium (Use XPaths to Identify Web Elements) with Java https://www.automationanywhere.com/
Verify below list is present on home page and click on each and every link and verify that it is navigating to the proper page
a. Products b. Solutions c. Resources d. Beyond RPA e. Company*/
public class Assignment_4 {

	public static void main(String[] args) throws InterruptedException {
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

}
