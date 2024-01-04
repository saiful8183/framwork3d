package Xpathlocatorsinselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Or {

	public static void main(String[] args) {

		System.setProperty("webdriver.Firefox.driver", "C:\\Users\\Manha\\Desktop\\Selenium&Driver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

		driver.findElement(By.xpath("//input[@name='username' or @class='oxd-input oxd-input--active']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password' or @class='oxd-input oxd-input--active']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit' or @class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();

		// chained xpath
		//input[contains(@name,'username')]
		//input[@name='username']
		//driver.close();
	
	}

}
