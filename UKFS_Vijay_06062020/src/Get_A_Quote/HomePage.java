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
	
	public HomePage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	By getAQuote = By.xpath("//a[contains(text(),'Get a Quote')]");
	
	By LogIn = By.xpath("//a[@title='Log In']");
	
	
//	By contractVinyl = By.xpath("//span[@style='color:;' and text()='Contract Vinyl']");
//	
//	By altroMarine20 = By.xpath("//span[@style='color:;  ' and text()='ALTRO MARINE 20 ']");
//	
//	By altroClassic25 = By.xpath("//span[@style='color:;  ' and text()='ALTRO CLASSIC 25 ']");
//
//	By altroStronghold30 = By.xpath("//span[@style='color:;  ' and text()='ALTRO STRONGHOLD 30']");
//
//	By polySafeWoodFX = By.xpath("//span[@style='color:;  ' and text()='POLYSAFE WOOD FX PUR']");
//
//	By altroWalkway20 = By.xpath("//span[@style='color:;  ' and text()='ALTRO WALKWAY 20 ']");
//
//	By altroContrax = By.xpath("//span[@style='color:;  ' and text()='ALTRO CONTRAX ']");
//
//	By polysafeStandard = By.xpath("//span[@style='color:;  ' and text()='POLYSAFE STANDARD']");
//	
//	By polysafeUltima = By.xpath("//span[@style='color:;  ' and text()='POLYSAFE ULTIMA ']");

	
	
	public void navgetAQuote()
	{
		List<WebElement> getAQuote1= driver.findElements(getAQuote);
		
		getAQuote1.get(1).click();
		
		driver.manage().timeouts().implicitlyWait(15,  TimeUnit.SECONDS);
	}
	
	public boolean checkPageTitle()
	{
		System.out.println(driver.getTitle());
		boolean val = driver.getTitle().contains("Flooring sale");
		System.out.println(val);
		return val;
	}
	
	public void clickOnHeaderLogInLink()
	{
		List<WebElement> logInButton= driver.findElements(LogIn);
		
		logInButton.get(1).click();
		System.out.println("After clicking Login link");
	}
	
	
//	public void navContractVinyl()
//	{
//		WebElement contractVinyl1= driver.findElement(contractVinyl);
//		
//		contractVinyl1.click();
//		driver.manage().timeouts().implicitlyWait(15,  TimeUnit.SECONDS);
//	}
//	
//	public boolean checkPageTitleContractVinyl()
//	{
//		System.out.println(driver.getTitle());
//		boolean val = driver.getTitle().contains("Commercial Contract Vinyl Flooring");
//		System.out.println(val);
//		return val;
//	}
//	
//	public void hoverOverContractVinylButton()
//	{
//		WebElement menuOption = driver.findElement(contractVinyl);
//		actions.moveToElement(menuOption).build().perform();
//	}
//	
//	
//	public void clickAltroMarine20()
//	{
//		driver.findElement(altroMarine20).click();
//	}
//	
//	public boolean checkPageTitleAltroMarine20()
//	{
//		boolean val = driver.getTitle().equalsIgnoreCase("ALTRO MARINE 20");
//		return val;
//	}
//	
//	public void clickAltroClassic25()
//	{
//		driver.findElement(altroClassic25).click();
//	}
//	
//	public boolean checkPageTitleAltroClassic25()
//	{
//		boolean val = driver.getTitle().equalsIgnoreCase("ALTRO CLASSIC 25");
//		return val;
//	}
//	
//	public void clickPolySafeWoodFX()
//	{
//		driver.findElement(polySafeWoodFX).click();
//	}
//	
//	public boolean checkPageTitlePolySafeWoodFX()
//	{
//		boolean val = driver.getTitle().equalsIgnoreCase("ALTRO MARINE 20");
//		return val;
//	}
//	
//	public void clickAltroWalkway20()
//	{
//		driver.findElement(altroWalkway20).click();
//	}
//	
//	public boolean checkPageTitleAltroWalkway20()
//	{
//		boolean val = driver.getTitle().equalsIgnoreCase("ALTRO MARINE 20");
//		return val;
//	}
//	
//	public void clickAltroContrax()
//	{
//		driver.findElement(altroContrax).click();
//	}
//	
//	public boolean checkPageTitleAltroContrax()
//	{
//		boolean val = driver.getTitle().equalsIgnoreCase("ALTRO MARINE 20");
//		return val;
//	}
//	
//	public void clickPolysafeStandard()
//	{
//		driver.findElement(polysafeStandard).click();
//	}
//	
//	public boolean checkPageTitleAPolysafeStandard()
//	{
//		boolean val = driver.getTitle().equalsIgnoreCase("ALTRO MARINE 20");
//		return val;
//	}
//	
//	public void clickPolysafeUltima()
//	{
//		driver.findElement(polysafeUltima).click();
//	}
//	
//	public boolean checkPageTitleAPolysafeUltima()
//	{
//		boolean val = driver.getTitle().equalsIgnoreCase("ALTRO MARINE 20");
//		return val;
//	}
}
