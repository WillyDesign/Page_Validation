package Test_Cases;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import POM.Registration_Page;
import io.github.bonigarcia.wdm.WebDriverManager;  
  

public class Registration_Submit {
	

	
	public static void main(String[] args) throws InterruptedException {  
        WebDriverManager.chromedriver().setup();  
        WebDriver driver = new ChromeDriver();  
        //String Patient = Robit Kumar;
  
        driver.get(Registration_Page.url);
       
        Registration_Page.Registration_Link(driver).click();
                
        Thread.sleep(2000);
        
        Registration_Page.Patient_Name(driver).click();
		Registration_Page.Patient_Name(driver).sendKeys("Santosh Kumar");
		
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
		
        Thread.sleep(2000);
		
        // Assuming alert is present  
        Alert alert = driver.switchTo().alert(); 
        String alertText = alert.getText();
        System.out.println(alertText);

       
        // Dismiss the alert  
        alert.dismiss();  
       
        WebElement registrationListLink = driver.findElement(By.linkText("View Registration List"));
        registrationListLink.click();  
       
        Thread.sleep(2000);
          
     // assuming that you want to check if a specific patient name is present in the table  
        WebElement patientName5 = driver.findElement(By.xpath("//td[contains(text(), 'Santosh Kumar')]"));  
          
        if(patientName5 != null) {  
            System.out.println("Patient name is present on the page.");  
        } else {  
            System.out.println("Patient name is not present on the page.");  
        }  
        
             driver.quit(); 

	}
}
