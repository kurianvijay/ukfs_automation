package Contract_Vinyl;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class UFS_TA_04_TC_CV_VJ_010 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ukflooringsale.co.uk/");
		driver.manage().window().maximize();
		
		Actions actions= new Actions(driver);
		
		WebElement menuOption = driver.findElement(By.xpath("//span[@style='color:;' and text()='Contract Vinyl']"));
		
		actions.moveToElement(menuOption).perform();
		System.out.println("Mouse Hover on 'Contract Vinyl' is done");
		
		WebElement subMenuOption = driver.findElement(By.xpath("//span[@style='color:;  ' and text()='POLYSAFE ULTIMA ']"));
		
		actions.moveToElement(subMenuOption).perform();
		System.out.println("Mouse hover over 'POLYSAFE ULTIMA ' is done ");
		subMenuOption.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//time.sleep(5);
		//driver.manage().timeouts().implicitlyWait(10,10);
		Thread.sleep(2000);
		
		actions.moveToElement(menuOption).perform();
		System.out.println("Mouse hover over 'Contract Vinyl' is done ");
		
		WebElement subMenuOption1 = driver.findElement(By.xpath("//span[@style='color:;  ' and text()='POLYSAFE STANDARD']"));
		
		actions.moveToElement(subMenuOption1).perform();
		subMenuOption1.click();
		
		
		
		driver.close();
		

	}

}
