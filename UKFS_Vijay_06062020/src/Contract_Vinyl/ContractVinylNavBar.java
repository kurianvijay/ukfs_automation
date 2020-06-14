/**
 * 
 */
package Contract_Vinyl;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * @author vijaykurian
 *
 */
public class ContractVinylNavBar {
	
	WebDriver driver;
	
	Actions actions= new Actions(driver);
	
	By ContractVinylButton = By.xpath("//*[@id='nav']/li[2]/a/span[text()='Contract Vinyl']");
	
	//*[@id="nav"]/li[2]/a[1]/span[1]

	
//	findElement(By.ByLinkText("Contract Vinyl")).click();
	
	By altroMarine20 = By.xpath("//span[@style='color:;  ' and text()='ALTRO MARINE 20 ']");
	
//	By altroClassic25 = By.xpath("//span[@style='color:;  ' and text()='ALTRO MARINE 20 ']");
//
//	By altroStronghold30 = By.xpath("//span[@style='color:;  ' and text()='ALTRO MARINE 20 ']");
//
//	By polySafeWoodFX = By.xpath("//span[@style='color:;  ' and text()='ALTRO MARINE 20 ']");
//
//	By altroWalkway20 = By.xpath("//span[@style='color:;  ' and text()='ALTRO MARINE 20 ']");
//
//	By altroContrax = By.xpath("//span[@style='color:;  ' and text()='ALTRO MARINE 20 ']");
//
//	By polysafeStandard = By.xpath("//span[@style='color:;  ' and text()='ALTRO MARINE 20 ']");
//	
//	By polysafeUltima = By.xpath("//span[@style='color:;  ' and text()='ALTRO MARINE 20 ']");


	
	
	
	public ContractVinylNavBar(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void clickContractVinylButton()
	{
		WebElement clicker = driver.findElement(ContractVinylButton);
		driver.manage().timeouts().implicitlyWait(15,  TimeUnit.SECONDS);
		clicker.click();
	}
	
	public void hoverOverContractVinylButton()
	{
		WebElement menuOption = driver.findElement(ContractVinylButton);
		actions.moveToElement(menuOption).build().perform();
	}
	
	public boolean checkPageTitleContractVinyl()
	{
		System.out.println(driver.getTitle());
		boolean val = driver.getTitle().contains("Commercial Contract Vinyl Flooring");
		System.out.println(val);
		return val;
	}
	
	public void clickAltroMarine20()
	{
		driver.findElement(altroMarine20).click();
	}
	
	public boolean checkPageTitleAltroMarine20()
	{
		boolean val = driver.getTitle().equalsIgnoreCase("ALTRO MARINE 20");
		return val;
	}
	

}
