package relativeLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatores {

	public static void main(String[] args) {
		// Q1. Go to https://theautomationzone.blogspot.com/2022/01/calculator.html
		// Using relative locators do a calculation -> 3X8 and capture the result.

		System.setProperty("webdriver.Firefox.driver", "C:\\Users\\Manha\\Desktop\\Selenium&Driver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://theautomationzone.blogspot.com/2022/01/calculator.html");

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Clicking on 3
		driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(By.xpath("//input[@value='2']")))
				.click();
//Clicking on star (*)Sign
		driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(By.xpath("//input[@value='=']")))
				.click();
//Clicking on 8 button
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.xpath("//input[@value='5']"))).click();
//clicking on =(Equal sign)
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.xpath("//input[@value='9']"))).click();

//Identifying result field
		WebElement result = driver
				.findElement(RelativeLocator.with(By.tagName("input")).above(By.xpath("//input[@value='1']")));

		// Capturing the result
		String finalresult = result.getAttribute("value");
		System.out.println("The result is:" + finalresult);

	}

}
