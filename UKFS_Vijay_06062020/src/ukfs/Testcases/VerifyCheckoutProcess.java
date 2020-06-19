/**
 * 
 */
package ukfs.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import Get_A_Quote.HomePage;
import Get_A_Quote.LogInPage;
import Get_A_Quote.userAccount;

/**
 * @author vijaykurian
 *
 */
public class VerifyCheckoutProcess {

	WebDriver driver = new FirefoxDriver();
	Actions actions = new Actions(driver);
	
	@BeforeTest
	public void beforetest() {
		driver.get("https://www.ukflooringsale.co.uk/");
		driver.manage().window().maximize();	

	}
	

	@Test
	public void checkoutwithoneitem() {
		HomePage clickVariable = new HomePage(driver);
		clickVariable.clickOnHeaderLogInLink();
		
		LogInPage loginVariable = new LogInPage(driver);
		loginVariable.enterEmailAddress();
		loginVariable.enterPassword();
		loginVariable.clickLogInButton();
		
//		userAccount accountVariable = new userAccount(driver);
//		accountVariable.hovercorkwalltilesandClickVitaDecor();
//		accountVariable.addToCart();
//		accountVariable.goToCheckoutMain();
		
		
		WebElement menuOption = driver.findElement(By.xpath("//*[@id='nav']/li[6]/a/span[text()='Cork & Wall Tiles']"));
		
		actions.moveToElement(menuOption).perform();
		
		
		WebElement vitaDecorOption = driver.findElement(By.xpath("//ul/li[6]/div/ul/ul/div/li[4]/a/span"));
		
		vitaDecorOption.click();
		WebElement cart = driver.findElement(By.xpath("//div[2]/div/button/span/span"));
		cart.click();
		
		driver.findElement(By.xpath("//div[3]/div/div/div/div")).click();
		driver.findElement(By.xpath("//span/span[1]")).click();
		
		
	}
	

	
	//@AfterTest
	//public void aftertest() {
	//	driver.quit();
	//}
}
