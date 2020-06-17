/**
 * 
 */
package Get_A_Quote;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author vijaykurian
 *
 */
public class LogInPage {
	
	WebDriver driver;
	
	By emailAddress = By.id("email");
	By password = By.id("pass");
	By logInButton = By.xpath("//button[@title='Login']");
	
	
	public LogInPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void enterEmailAddress() 
	{
		driver.findElement(emailAddress).sendKeys("kurianvijay7@gmail.com");
	}
	
	public void enterPassword() 
	{
		driver.findElement(password).sendKeys("Welcome123");
	}
	
	public void clickLogInButton() 
	{
		driver.findElement(logInButton).click();
	}
	
	
	

}
