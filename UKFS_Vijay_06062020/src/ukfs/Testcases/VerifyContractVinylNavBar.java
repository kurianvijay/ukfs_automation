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
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
	
//	@Test
//	public void verifyPageTitleContractVinyl(){
//		
//		HomePage contractVinylPageTitle = new HomePage(driver);
//		contractVinylPageTitle.navContractVinyl();
//		
////		contractVinylPageTitle.hoverOverContractVinylButton();
//		
//		assertTrue(contractVinylPageTitle.checkPageTitleContractVinyl());
//		
//	}
//	
//	@Test 
//	public void verifyPageTitleAltroMarine20() {
//		
//		HomePage altroMarine20PageTitle = new HomePage(driver);
//		altroMarine20PageTitle.hoverOverContractVinylButton();
//		altroMarine20PageTitle.clickAltroMarine20();
//		
//		assertTrue(altroMarine20PageTitle.checkPageTitleAltroMarine20());
//		
//	}
	

}
