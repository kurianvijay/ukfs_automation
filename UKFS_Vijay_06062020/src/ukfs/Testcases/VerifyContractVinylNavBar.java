/**
 * 
 */
package ukfs.Testcases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Contract_Vinyl.ContractVinylNavBar;
import Get_A_Quote.HomePage;

/**
 * @author vijaykurian
 *
 */
public class VerifyContractVinylNavBar {
	
WebDriver driver = new FirefoxDriver();
	
	@BeforeTest
	public void beforeTest() {
		
		driver.get("https://www.ukflooringsale.co.uk/");
		driver.manage().window().maximize();
	}
	
//	@AfterTest
//public void afterTest() {
//		driver.quit();
//	}
	
	@Test
	public void verifyPageTitleContractVinyl(){
		
//////		System.setProperty("webdriver.gecko.driver", "/Users/vijaykurian/Downloads/Automation/Drivers.geckodriver");
//		ContractVinylNavBar contractVinylPageTitle = new ContractVinylNavBar(driver);
//		contractVinylPageTitle.hoverOverContractVinylButton();
////		contractVinylPageTitle.clickContractVinylButton();
		
		HomePage obj = new HomePage(driver);
		obj.navContractVinyl();
		
		ContractVinylNavBar contractVinylPageTitle = new ContractVinylNavBar(driver);
		contractVinylPageTitle.hoverOverContractVinylButton();
		
		assertTrue(contractVinylPageTitle.checkPageTitleContractVinyl());
		
	}
	
	@Test 
	public void verifyPageTitleAltroMarine20() {
		
		ContractVinylNavBar altroMarine20PageTitle = new ContractVinylNavBar(driver);
		altroMarine20PageTitle.hoverOverContractVinylButton();
		altroMarine20PageTitle.clickAltroMarine20();
		
		assertTrue(altroMarine20PageTitle.checkPageTitleAltroMarine20());
		
	}
	

}
