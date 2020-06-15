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

import Get_A_Quote.GetAQuotePage;
import Get_A_Quote.HomePage;

/**
 * @author vijaykurian
 *
 */
public class VerifyGetQuoteForm {
	
	WebDriver driver = new FirefoxDriver();
	
	@BeforeTest
	public void beforeTest() {
		
		driver.manage().window().maximize();
		driver.get("https://www.ukflooringsale.co.uk/");

		HomePage home = new HomePage(driver);
		home.navgetAQuote();
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
	
	@Test
	public void verifyPageTitle() {
		
		HomePage home = new HomePage(driver);
		assertTrue(home.checkPageTitle());
		
	}
	
	@Test
	public void verifyBlankPageSubmission() {
		
		GetAQuotePage blankSubmit = new GetAQuotePage(driver);
		
		blankSubmit.clicksubmitButton();
		
		assertTrue(blankSubmit.checkNameError());
		assertTrue(blankSubmit.checktelephoneError());
		assertTrue(blankSubmit.checkemailError());
		assertTrue(blankSubmit.checkconfirmEmailError());
		assertTrue(blankSubmit.checkaddressError());
		assertTrue(blankSubmit.checkappDateError());
		assertTrue(blankSubmit.checkcityError());
		assertTrue(blankSubmit.checkpostcodeError());
		assertTrue(blankSubmit.checkservicedescError());
		assertTrue(blankSubmit.checkservicereqError());	
		
		}
		              	
	@Test
	public void verifyYourname() {
		
		GetAQuotePage enterName = new GetAQuotePage(driver);
		enterName.typeyourName();
		
		enterName.clicksubmitButton();
		
		try {
			enterName.checkNameError();
		}
		catch(Exception e) {
			System.out.println("Exception caught - "+e);
		}
	
	}

	
	@Test
	public void verifyYourTelephone() {
		
		GetAQuotePage enterPhone = new GetAQuotePage(driver);
		enterPhone.typetelephone("020 8553 5282");
		
		enterPhone.clicksubmitButton();
		
		try {
			enterPhone.checktelephoneError();
		}
		catch(Exception e) {
			System.out.println("Exception caught - "+e);
		}
		
	}
	
	@Test
	public void enterAlphabetsInPhone() {
		
		GetAQuotePage enterPhone = new GetAQuotePage(driver);
		enterPhone.typetelephone("TESTING");
		
		enterPhone.clicksubmitButton();
		
		enterPhone.checktelephoneError();
		
	}
	
	@Test
	public void verifyEmail() {
		
		GetAQuotePage enterEmail = new GetAQuotePage(driver);
		enterEmail.typeemail("info@ukflooringsale.co.uk");
		
		enterEmail.clicksubmitButton();
		
		try {
			enterEmail.checkemailError();
		}
		catch(Exception e) {
			System.out.println("Exception caught - "+e);
		}
	
		
	}

	@Test
	public void verifyConfirmEmail() {
		
		
		GetAQuotePage confirmEmail = new GetAQuotePage(driver);
		confirmEmail.typeconfirmEmail("info@ukflooringsale.co.uk");
		
		confirmEmail.clicksubmitButton();
		
		try {
			confirmEmail.checkconfirmEmailError();
		}
		catch(Exception e) {
			System.out.println("Exception caught - "+e);
		}
	}
	
	@Test
	public void compareEmail() {
		
		
		GetAQuotePage compareEmail = new GetAQuotePage(driver);
		
		compareEmail.typeemail("info@ukflooringsale.co.uk");
		compareEmail.typeconfirmEmail("info@ukflooringsale.co.uk");
		
		compareEmail.clicksubmitButton();
		
		try {
			compareEmail.checkconfirmEmailError();
			compareEmail.checkemailError();
		}
		catch(Exception e) {
			System.out.println("Exception caught - "+e);
		}
	}
	

	@Test
	public void verifyCity() {
		
		GetAQuotePage enterCity = new GetAQuotePage(driver);
		enterCity.typecity();
		
		enterCity.clicksubmitButton();
		
		try {
			enterCity.checkcityError();
		}
		catch(Exception e) {
			System.out.println("Exception caught - "+e);
		}
		
	}
	
	@Test
	public void verifyAddress() {
		
		GetAQuotePage enterAddress = new GetAQuotePage(driver);
		enterAddress.typeaddress();
		
		enterAddress.clicksubmitButton();
		
		try {
			enterAddress.checkaddressError();
		}
		catch(Exception e) {
			System.out.println("Exception caught - "+e);
		}
		
	}
	
	@Test
	public void verifyDate() {
		
		GetAQuotePage enterDate = new GetAQuotePage(driver);
		enterDate.typeappDate();
		
		enterDate.clicksubmitButton();
		
		try {
			enterDate.checkappDateError();
		}
		catch(Exception e) {
			System.out.println("Exception caught - "+e);
		}
	
	}
	
	@Test
	public void verifyPostcode() {
		
		GetAQuotePage enterPostcode = new GetAQuotePage(driver);
		enterPostcode.typepostcode();
		
		enterPostcode.clicksubmitButton();
		
		try {
			enterPostcode.checkpostcodeError();
		}
		catch(Exception e) {
			System.out.println("Exception caught - "+e);
		}
	
		
	}
	
	@Test
	public void verifyServiceDesc() {
		
		GetAQuotePage enterServiceDesc = new GetAQuotePage(driver);
		enterServiceDesc.typeservicedesc();
		
		enterServiceDesc.clicksubmitButton();
		
		try {
			enterServiceDesc.checkservicedescError();
		}
		catch(Exception e) {
			System.out.println("Exception caught - "+e);
		}
	
	}
	
	@Test
	public void verifyServiceReq() {
		
		GetAQuotePage enterServiceReq = new GetAQuotePage(driver);
		enterServiceReq.selectOneOption();
		
		enterServiceReq.clicksubmitButton();
		
		try {
			enterServiceReq.checkservicereqError();
		}
		catch(Exception e) {
			System.out.println("Exception caught - "+e);
		}
	
	}
	
	@Test
	public void selectAllServiceReq() {
		
		GetAQuotePage selectServiceReq = new GetAQuotePage(driver);
		selectServiceReq.selectAllOptions();
		
		selectServiceReq.clicksubmitButton();
		
		try {
			selectServiceReq.checkservicereqError();
		}
		catch(Exception e) {
			System.out.println("Exception caught - "+e);
		}
	
	}
}

