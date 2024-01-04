package Xpathlocatorsinselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class And {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.Firefox.driver", "C:\\Users\\Manha\\Desktop\\Selenium&Driver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username' and @placeholder='Username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit' and @class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();

		// chained xpath
		//input[contains(@name,'username')]
		//input[@name='username']
		//driver.close();
	
	}

}
