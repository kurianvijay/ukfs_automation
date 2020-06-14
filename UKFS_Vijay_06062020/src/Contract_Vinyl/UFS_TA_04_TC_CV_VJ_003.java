package Contract_Vinyl;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class UFS_TA_04_TC_CV_VJ_003 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ukflooringsale.co.uk/");
		driver.manage().window().maximize();
		
//		Actions actions= new Actions(driver);
				
		WebElement menuOption = driver.findElement(By.xpath("//span[@style='color:;' and text()='Contract Vinyl']"));
		
//		actions.moveToElement(menuOption).perform();
		System.out.println(menuOption);
		System.out.println("Mouse Hover on 'Contract Vinyl' is done");
		
		menuOption.click();
		
//		WebElement subMenuOption = driver.findElement(By.xpath("//span[@style='color:;  ' and text()='ALTRO CLASSIC 25 ']"));
//		
//		actions.moveToElement(subMenuOption).perform();
//		System.out.println("Mouse hover over 'ALTRO CLASSIC 25' is done ");
//		
//		driver.manage().timeouts().implicitlyWait(15,  TimeUnit.SECONDS);
//		 
//		subMenuOption.click();
//		
//		String pageTitle = driver.getTitle();
//		
//		if (pageTitle.contains("ALTRO CLASSIC 25")) {
//			
//			System.out.println("Test Case - 003 Passed");
//			
//		} else {
//			System.out.println("Test Case - 003 Failed!");
//		}

	}

}
