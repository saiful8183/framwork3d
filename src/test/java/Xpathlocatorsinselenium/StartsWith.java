package Xpathlocatorsinselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StartsWith {

	public static void main(String[] args) {


		System.setProperty("webdriver.Firefox.driver", "C:\\Users\\Manha\\Desktop\\Selenium&Driver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

		driver.findElement(By.xpath("//input[starts-with(@name,'u')]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[starts-with(@name,'pa')]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[starts-with(@class,'oxd')]")).click();

		// chained xpath
		//input[contains(@name,'username')]
		//input[@name='username']
		//driver.close();
	

	}

}
