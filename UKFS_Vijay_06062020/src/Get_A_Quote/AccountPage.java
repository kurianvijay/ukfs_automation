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
public class AccountPage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	By corkWallTiles = By.linkText("Cork & Wall Tiles");
	
	
}
