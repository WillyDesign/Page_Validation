package Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Registration_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationPage_Validation {
	
	
	
	public static void main(String[] args) {  
        WebDriverManager.chromedriver().setup();  
        WebDriver driver = new ChromeDriver();  
        
        driver.get(Registration_Page.url); 
  
        WebElement registrationButton = driver.findElement(By.xpath("//a[contains(text(),'Registration')]"));  
        registrationButton.click();  
        
        //Check if Patient Name field is present 
        if (!driver.findElements(By.name("PatientName")).isEmpty()) {  
            System.out.println("Patient Name field is present.");  
        } else {  
            System.out.println("Patient Name field is not present.");  
        }  
  
        //Check if DOB calendar is present
        if (!driver.findElements(By.id("dob")).isEmpty()) {  
            System.out.println("Date of Birth field is present.");  
        } else {  
            System.out.println("Date of Birth field is not present.");  
        }  
 
  
        //Check if Gender option is present  
        if (!driver.findElements(By.name("gender")).isEmpty()) {  
            System.out.println("Gender field is present.");  
        } else {  
            System.out.println("Gender field is not present.");  
        }  
        
        //Check if Email field is present  
        if (!driver.findElements(By.name("email")).isEmpty()) {  
            System.out.println("Email field is present.");  
        } else {  
            System.out.println("Email field is not present.");  
        }  
        
        //Check if Mobile field is present  
        if (!driver.findElements(By.name("mobile")).isEmpty()) {  
            System.out.println("Mobile field is present.");  
        } else {  
            System.out.println("Mobile field is not present.");  
        }  
          
        //Check if Address field is present  
        if (!driver.findElements(By.name("address")).isEmpty()) {  
            System.out.println("Address field is present.");  
        } else {  
            System.out.println("Address field is not present.");  
        }  
        
        // Check if Pincode field is present  
        if (!driver.findElements(By.name("pincode")).isEmpty()) {  
            System.out.println("Pincode field is present.");  
        } else {  
            System.out.println("Pincode field is not present.");  
        }  
  
    
        driver.quit();  
    }  


}
