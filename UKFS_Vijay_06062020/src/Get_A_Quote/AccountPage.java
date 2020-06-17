/**
 * 
 */
package Get_A_Quote;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * @author vijaykurian
 *
 */
public class AccountPage {
	
	WebDriver driver;
	
	Actions actions = new Actions(driver);
	
	public AccountPage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	By corkWallTiles = By.xpath("//ul[@id='nav']/li[6]/a/span");
	
	By vitaDecor = By.xpath("//ul/li[6]/div/ul/ul/div/li[4]/a/span");
	
	By addToCartCliceNatural = By.xpath("//div[2]/div/button/span/span"); //list pick one
	
	By summaryRow = By.xpath("//div[3]/div/div/div/div");
	
	By mainCheckout = By.xpath("//span/span[1]"); //list pick first one 
	
	
	public void hovercorkwalltilesandClickVitaDecor() {
		
		WebElement menuOption = driver.findElement(corkWallTiles);
		actions.moveToElement(menuOption).perform();
		
		WebElement vitaDecorOption = driver.findElement(vitaDecor);
		vitaDecorOption.click();
	}
	
	public void addToCart() {
		
		driver.findElement(addToCartCliceNatural).click();
	}
	
	public void goToCheckoutMain() {
		
		driver.findElement(summaryRow).click();
		driver.findElement(mainCheckout).click();
		
	}
	
	

	
	
}
