package Contract_Vinyl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class UFS_TA_04_TC_CV_VJ_005 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ukflooringsale.co.uk/");
		driver.manage().window().maximize();
		
		Actions actions= new Actions(driver);
				
		WebElement menuOption = driver.findElement(By.xpath("//span[@style='color:;' and text()='Contract Vinyl']"));
		
		actions.moveToElement(menuOption).perform();
		System.out.println("Mouse Hover on 'Contract Vinyl' is done");
		
		WebElement subMenuOption = driver.findElement(By.xpath("//span[@style='color:;  ' and text()='POLYSAFE WOOD FX PUR']"));
		
		actions.moveToElement(subMenuOption).perform();
		System.out.println("Mouse hover over 'POLYSAFE WOOD FX' is done ");
		
		subMenuOption.click();
		
		String pageTitle = driver.getTitle();
		
		if (pageTitle.contains("POLYSAFE WOOD FX")) {
			
			System.out.println("Test Case - 005 Passed");
			
		} else {
			System.out.println("Test Case - 005 Failed!");
		}
		
		driver.close();

	}

}
