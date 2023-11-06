package Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import POM.Registration_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration_Blank_Mobile {
	
	public static void main(String[] args) throws InterruptedException {  
        WebDriverManager.chromedriver().setup();  
        WebDriver driver = new ChromeDriver();  
  
        driver.get(Registration_Page.url);  
       
Registration_Page.Registration_Link(driver).click();
        
        Thread.sleep(2000);
        
        Registration_Page.Patient_Name(driver).click();
		Registration_Page.Patient_Name(driver).sendKeys("Santosh Kumar");
		
		Registration_Page.DOB(driver).click();
		Registration_Page.DOB(driver).sendKeys("22-10-2023");
		
		Actions action = new Actions(driver);  
        action.sendKeys(Keys.TAB).build().perform();  
		
		//Registration_Page.Gender(driver).click();
		
		Registration_Page.email(driver).click();
		Registration_Page.email(driver).sendKeys("test@gmail.com");
		
		//Registration_Page.mobile(driver).click();
		//Registration_Page.mobile(driver).sendKeys("9000000000");
		
		Registration_Page.address(driver).click();
		Registration_Page.address(driver).sendKeys("Thane West");
		
		Registration_Page.pincode(driver).click();
		Registration_Page.pincode(driver).sendKeys("421567");
		
		Registration_Page.Submit(driver).click(); 
		
        Thread.sleep(2000);
		
        


                
        
        
     // Find the element with the html info tooltip
        driver.findElement(By.name("mobile"));  
        String message = driver.findElement(By.name("mobile")).getAttribute("validationMessage");
        System.out.println("The error message displayed on the page is: " +message);
        
        // Validate the text message
        if (message.equals("Please fill out this field.")) {
            System.out.println("The error message is displayed correctly. Validation for blank Mobile field is Passed");
        } else {
            System.out.println("The error message is not displayed correctly. Validation for blank Mobile field is Failed");
        }

        
        driver.close();
	}


}
