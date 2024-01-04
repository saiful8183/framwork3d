package Xpathlocatorsinselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathAxesExemple {

	public static void main(String[] args) {


		
		System.setProperty("webdriver.Firefox.driver", "C:\\Users\\Manha\\Desktop\\Selenium&Driver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.facebook.com/signup");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		
		
		
		
		//Question:Find the sign-up button from the registration form present in the facebook application(Child)
		                    //    //div[@id='reg_form_box']/child::div[11]/button    \\
		
		
		
		driver.findElement(By.xpath("//div[@id='reg_form_box']/child::div[11]/button")).click();
		
		
		
		
		//  Question:Locate firstname from sign-up Button in facebook (Parant)
		
		
		
		
		
		//Identify the password from mobile number field in facebook(Following)
		
		//      //input[@id='u_0_g_ax']/following::input[2]              
		
		
		
		//Question  >Identify the mobilenumber from password field in facebook(Following)
		
		
		//    //input[@id='password_step_input']/preceding::input[2]
		
		
		
		// Question> Locate surname from female radio Button in facebook(Ancestor)
		
		
		//          //input[@id='u_0_4_u2']/ancestor::div[2]/div[1]/div/div[2]
		
		
		//             or           \\
		
		//   //input[@id='u_0_4_u2']/ancestor::div[2]  //input[@id='u_0_d_T5']
		
		
		
		
		
		//   Question > Identify the search text box from the google search button present in the google search homepage(parent)
		
		
		// Question> Identify todays Deals link from the amazon search text box present in the amazon homepage(Following)
		
		//       //input[@id='twotabsearchtextbox']/following::a[@id='nav_link_allhealthingress']//span[contains(text(),'Medical Care')]
		
		
		
		// Question > identify the Hello,Signin from the amazon search text box present in the amazon home page(Folloing)
		
		
		
		
		//              //input[@id='twotabsearchtextbox']/following::span[contains(text(),'Hello,Sign in')]
	}

}
