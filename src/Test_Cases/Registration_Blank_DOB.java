package Test_Cases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import POM.Registration_Page;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Registration_Blank_DOB {
		
		public static void main(String[] args) throws InterruptedException {  
	        WebDriverManager.chromedriver().setup();  
	        WebDriver driver = new ChromeDriver();  
	  
	        driver.get(Registration_Page.url);  
	        
	        Registration_Page.Registration_Link(driver).click();
	        
	        Thread.sleep(2000);
	        
	        Registration_Page.Patient_Name(driver).click();
			Registration_Page.Patient_Name(driver).sendKeys("Santosh Kumar");
			
			//Registration_Page.DOB(driver).click();
			//Registration_Page.DOB(driver).sendKeys("22-10-2023");
			
			//Actions action = new Actions(driver);  
	        //action.sendKeys(Keys.TAB).build().perform(); 
	        
			
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

	        
	       	        
	        Thread.sleep(2000);
	        
	        
	        try {  
	            // Switch to the alert box  
	            Alert alert = driver.switchTo().alert();  
	              
	            // Print the text from the alert box  
	            System.out.println("Alert text is: " + alert.getText()); 
	            String alertText = alert.getText();
	            System.out.println(alertText);
	              
	            // Accept the alert  
	            alert.accept();  
	        } catch (NoAlertPresentException e) {  
	            // Handle the case where there is no alert present  
	            System.out.println("No alert is present.");  
	        } 
	        
	        Thread.sleep(2000);
	        
	        
	        
	        // Assume that the span error message has an id "errorMessage"  
	        WebElement errorMessage = driver.findElement(By.className("error"));
	  
	        // Get the text of the error message  
	        String errorMessageText = errorMessage.getText();  
	        
	     // Find the element with the html info tooltip
	       // driver.findElement(By.id("dob"));  
	        //String message = driver.findElement(By.id("dob")).getAttribute("validationMessage");
	        System.out.println("The error message displayed on the page is: " +errorMessageText);
	        
	        // Validate the text message
	        if (errorMessageText.equals("Please select a date of birth")) {
	            System.out.println("The error message is displayed correctly. Validation for blank DOB field is Passed");
	        } else {
	            System.out.println("The error message is not displayed correctly. Validation for blank DOB field is Failed");
	        }

	        
	        driver.close();


		}
	}



