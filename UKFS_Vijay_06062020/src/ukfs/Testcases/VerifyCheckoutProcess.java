/**
 * 
 */
package ukfs.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Get_A_Quote.HomePage;
import Get_A_Quote.LogInPage;

/**
 * @author vijaykurian
 *
 */
public class VerifyCheckoutProcess {

	WebDriver driver = new FirefoxDriver();
	
	@BeforeTest
	public void beforetest() {
		driver.get("https://www.ukflooringsale.co.uk/");
		driver.manage().window().maximize();	
		HomePage clickVariable = new HomePage(driver);
		//clickVariable.clickOnHeaderLogInLink();
	}
	

	@Test
	public void checkoutwithoneitem() {
		HomePage clickVariable = new HomePage(driver);
		clickVariable.clickOnHeaderLogInLink();
		
		LogInPage loginVariable = new LogInPage(driver);
		loginVariable.enterEmailAddress();
		loginVariable.enterPassword();
		loginVariable.clickLogInButton();
		
	}
	
	//@AfterTest
	//public void aftertest() {
	//	driver.quit();
	//}
}
