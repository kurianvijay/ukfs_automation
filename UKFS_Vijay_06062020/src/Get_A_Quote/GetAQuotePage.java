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
public class GetAQuotePage {
	
	WebDriver driver;
	
	
	By submitButton = By.xpath("//input[@id='submit-inquiry']");
	
	By yourNameError = By.xpath("//div[@id='advice-required-entry-firstname']");
	By yourName = By.xpath(".//*[@id='firstname']");
	
	By telephoneError = By.xpath("//div[@id='advice-required-entry-phone']");
	By telephone = By.id("phone");
	
	By emailError = By.xpath("//div[@id='advice-required-entry-email']");
	By email = By.id("email");
	
	By confirmEmailError = By.xpath("//div[@id='advice-required-entry-confirmemail']");
	By confirmEmail = By.id("confirmemail");
	
	By addressError = By.xpath("//div[@id='advice-required-entry-address']");
	By address = By.id("address");

	By appDateError = By.xpath("//div[@id='advice-required-entry-date_time']");
	By appDate = By.id("date_time");

	By cityError = By.xpath("//div[@id='advice-required-entry-city']");
	By city = By.id("city");

	By postcodeError = By.xpath("//div[@id='advice-required-entry-zip']");
	By postcode = By.id("zip");

	By servicedescError = By.xpath("//div[@id='advice-required-entry-desc']");
	By servicedesc = By.id("desc");
	
	By servicereqError = By.xpath(".//*[@id='advice-validate-one-required-by-name-services[]']");
	By servicereq1 = By.xpath(".//*[@class='checkbox'][1]");
	
	
	public GetAQuotePage(WebDriver driver)
	{
		this.driver = driver;
	}
	

	public void selectOneOption()
	{
		List<WebElement> serviceReq= driver.findElements(servicereq1);
		
		serviceReq.get(1).click();
		
	}
	
	public void selectAllOptions()
	{
		List<WebElement> serviceReq= driver.findElements(servicereq1);
		
		for(int i=0;i<=11;i++) {
			serviceReq.get(i).click();
		}
		
	}
	
	public void clicksubmitButton()
	
	{
		driver.findElement(submitButton).click();
	}
	
	public void typeyourName()
	{
		driver.findElement(yourName).sendKeys("Vijay Kurian");
	}
	
	public void typetelephone(String tel)
	{
		driver.findElement(telephone).sendKeys(tel);
	}

	public void typeemail(String email1)
	{
		driver.findElement(email).sendKeys(email1);
	}
	
	public void typeconfirmEmail(String email2)
	{
		driver.findElement(confirmEmail).sendKeys(email2);
	}
	
	public void typeaddress()
	{
		driver.findElement(address).sendKeys("82 Brixton Road, Kennington");
	}
	
	public void typeappDate()
	{
		driver.findElement(appDate).sendKeys("11/06/2020");
	}
	
	public void typecity()
	{
		driver.findElement(city).sendKeys("London");
	}
	
	public void typepostcode()
	{
		driver.findElement(postcode).sendKeys("SW9 6BH");
	}
	
	public void typeservicedesc()
	{
		driver.findElement(servicedesc).sendKeys("This is a test for the form");
	}
	
	public boolean checkservicereqError() {
		boolean val= driver.findElement(servicereqError).getText().contains("Please select one of the options.");
		return val;
	}
	
	public boolean checkNameError() {
		boolean val= driver.findElement(yourNameError).getText().contains("This is a required field.");
		return val;
	}
	
	public boolean checktelephoneError() {
		boolean val= driver.findElement(telephoneError).getText().contains("This is a required field.");
		return val;
	}
	
	public boolean checkemailError() {
		boolean val= driver.findElement(emailError).getText().contains("This is a required field.");
		return val;
	}
	
	public boolean checkconfirmEmailError() {
		boolean val= driver.findElement(confirmEmailError).getText().contains("This is a required field.");
		return val;
	}
	
	public boolean checkaddressError() {
		boolean val= driver.findElement(addressError).getText().contains("This is a required field.");
		return val;
	}
	
	public boolean checkappDateError() {
		boolean val= driver.findElement(appDateError).getText().contains("This is a required field.");
		return val;
	}
	
	public boolean checkcityError() {
		boolean val= driver.findElement(cityError).getText().contains("This is a required field.");
		return val;
	}
	
	public boolean checkpostcodeError() {
		boolean val= driver.findElement(postcodeError).getText().contains("This is a required field.");
		return val;
	}
	
	public boolean checkservicedescError() {
		boolean val= driver.findElement(servicedescError).getText().contains("This is a required field.");
		return val;
	}


}
