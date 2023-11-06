package Test_Cases;

import static org.testng.AssertJUnit.assertEquals;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;  
import POM.Registration_Page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration_Blank_PatientName {
	
	public static void main(String[] args) throws InterruptedException {  
	
	WebDriverManager.chromedriver().setup();  
    WebDriver driver = new ChromeDriver();  

    driver.get(Registration_Page.url);  
   
    
    Registration_Page.Registration_Link(driver).click();
   
    Thread.sleep(2000);
    
    Registration_Page.DOB(driver).click();
	Registration_Page.DOB(driver).sendKeys("22-10-2023");
	
	Actions action = new Actions(driver);  
    action.sendKeys(Keys.TAB).build().perform();  
	
	Registration_Page.Gender(driver).click();
	
	Registration_Page.email(driver).click();
	Registration_Page.email(driver).sendKeys("test@gmail.com");
	
	Registration_Page.mobile(driver).click();
	Registration_Page.mobile(driver).sendKeys("9000000000");
	
	Registration_Page.address(driver).click();
	Registration_Page.address(driver).sendKeys("Thane West");
	
	Registration_Page.pincode(driver).click();
	Registration_Page.pincode(driver).sendKeys("421567");
	
	Registration_Page.Submit(driver).click(); 
	
    // Find the element with the html info tooltip
    driver.findElement(By.name("PatientName"));  
    String message = driver.findElement(By.name("PatientName")).getAttribute("validationMessage");
    System.out.println("The error message displayed on the page is: " +message);
    
    // Validate the text message
    if (message.equals("Please enter a Patient Name.")) {
        System.out.println("The error message is displayed correctly. Validation for blank Patient Name field is Passed");
    } else {
        System.out.println("The error message is not displayed correctly. Validation for blank Patient Name field is Failed");
    }

    
    driver.close();

	}
}
