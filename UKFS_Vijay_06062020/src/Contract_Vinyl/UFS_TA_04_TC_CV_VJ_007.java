package Contract_Vinyl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class UFS_TA_04_TC_CV_VJ_007 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ukflooringsale.co.uk/");
		driver.manage().window().maximize();
		
		Actions actions= new Actions(driver);
		
		driver.findElement(By.xpath("//span[@style='color:;' and text()='Contract Vinyl']"));
		
		WebElement menuOption = driver.findElement(By.xpath("//span[@style='color:;' and text()='Contract Vinyl']"));
		
		actions.moveToElement(menuOption).perform();
		System.out.println("Mouse Hover on 'Contract Vinyl' is done");
		
		WebElement subMenuOption = driver.findElement(By.xpath("//span[@style='color:;  ' and text()='ALTRO CONTRAX ']"));
		
		actions.moveToElement(subMenuOption).perform();
		System.out.println("Mouse hover over 'ALTRO CONTRAX ' is done ");
		
		subMenuOption.click();
		
		String pageTitle = driver.getTitle();
		
		if (pageTitle.contains("ALTRO CONTRAX")) {
			
			System.out.println("Test Case - 007 Passed");
			
		} else {
			System.out.println("Test Case - 007 Failed!");
		}
		
		driver.close();

	}

}
