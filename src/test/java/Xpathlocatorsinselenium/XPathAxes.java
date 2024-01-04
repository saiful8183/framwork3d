package Xpathlocatorsinselenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPathAxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.Firefox.driver", "C:\\Users\\Manha\\Desktop\\Selenium&Driver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

		/*
		 * //Self
		 * 
		 * String
		 * text=driver.findElement(By.xpath("//a[contains(text(),'DCB Bank')]/self::a"))
		 * .getText(); System.out.println(text);
		 * 
		 * 
		 * //Parent String text2=driver.findElement(By.
		 * xpath("//a[contains(text(),'DCB Bank')]/parent::td")).getText();
		 * System.out.println(text);
		 * 
		 * 
		 * //Child List <WebElement>childs=driver.findElements(By.
		 * xpath("//a[contains(text(),'DCB Bank')]/ancestor::tr/child::td"));
		 * 
		 * System.out.println("Number of child elements:"+childs.size());
		 */

		// Ancestor> Select All ancestor(Parent,grandParant)
		String text = driver.findElement(By.xpath("//a[contains(text(),'Tata Coffee')]/ancestor::tr")).getText();

		System.out.println(text);

		// DEscendant >Select all DEscendant(Celdren,grand children)of the current node
		List<WebElement> descendant = driver
				.findElements(By.xpath("//a[contains(text(),'Tata Coffee')]/ancestor::tr/descendant::*"));
		System.out.println(descendant.size());
		
		
		//Folloing> Selects everything in the document after the closing tag of the current node 
		
		
		List<WebElement> follo=driver.findElements(By.xpath("//a[contains(text(),'Tata Coffee')]/ancestor::tr/following::tr"));
		System.out.println(follo.size());
		
		
//Folowing-sibling> Select all sibling after the current node
		
		
		List<WebElement>folloSibling=driver.findElements(By.xpath("//a[contains(text(),'Tata Coffee')]/ancestor::tr/following-sibling::tr"));
		
		System.out.println(folloSibling.size());
		
		
		
	//Preceding>Selects all nodes that appear before the current node in the document
		
	List<WebElement> precedings=	driver.findElements(By.xpath("//a[contains(text(),'Tata Coffee')]/ancestor::tr/preceding::tr"));
		System.out.println(precedings.size());
		
		
		
		//preseding-sibling>Select all sibling before the current node
		List<WebElement> precedingSibling=	driver.findElements(By.xpath("//a[contains(text(),'Tata Coffee')]/ancestor::tr/preceding-sibling::tr"));
		System.out.println(precedingSibling.size());
		
		
		
		
		
		
		
		
		driver.quit();

	}

}
