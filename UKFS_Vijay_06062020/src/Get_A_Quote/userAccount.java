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
public class userAccount {
	
	WebDriver driver;
	
	public userAccount(WebDriver driver)
	{
		this.driver = driver;
	}
	
	Actions actions = new Actions(driver);
	
	By corkWallTiles = By.xpath("//*[@id='nav']/li[6]/a/span[text()='Cork & Wall Tiles']");
	
	By vitaDecor = By.xpath("//ul/li[6]/div/ul/ul/div/li[4]/a/span");
	
	By addToCartCliceNatural = By.xpath("//div[2]/div/button/span/span"); //list pick one
	
	By summaryRow = By.xpath("//div[3]/div/div/div/div");
	
	By mainCheckout = By.xpath("//span/span[1]"); //list pick first one
	
	public void hovercorkwalltilesandClickVitaDecor() {
		System.out.println("Inside hovercorkwalltilesandClickVitaDecor");
		WebElement menuOption = driver.findElement(corkWallTiles);
		System.out.println(menuOption);
		actions.moveToElement(menuOption).perform();
		
		
		WebElement vitaDecorOption = driver.findElement(vitaDecor);
		System.out.println(vitaDecorOption);
		vitaDecorOption.click();
	}
	
	public void addToCart() {
		
		WebElement cart = driver.findElement(addToCartCliceNatural);
		cart.click();
		System.out.println(cart);
	}
	
	public void goToCheckoutMain() {
		
		driver.findElement(summaryRow).click();
		driver.findElement(mainCheckout).click();
		
	}
}
