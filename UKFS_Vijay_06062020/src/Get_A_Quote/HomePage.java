/**
 * 
 */
package Get_A_Quote;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author vijaykurian
 *
 */
public class HomePage {
	
WebDriver driver;
	
	By getAQuote = By.xpath("//a[contains(text(),'Get a Quote')]");
	By contractVinyl = By.xpath("//span[@style='color:;' and text()='Contract Vinyl']");
	
	
	
	public HomePage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public void navgetAQuote()
	{
		List<WebElement> getAQuote1= driver.findElements(getAQuote);
		
		getAQuote1.get(1).click();
		
		driver.manage().timeouts().implicitlyWait(15,  TimeUnit.SECONDS);
	}
	
	public void navContractVinyl()
	{
		WebElement contractVinyl1= driver.findElement(contractVinyl);
		
		contractVinyl1.click();
		driver.manage().timeouts().implicitlyWait(15,  TimeUnit.SECONDS);
	}
	
	public boolean checkPageTitle()
	{
		System.out.println(driver.getTitle());
		boolean val = driver.getTitle().equalsIgnoreCase("Free quotes from London Carpet Fitters");
		System.out.println();
		return val;
	}

}
