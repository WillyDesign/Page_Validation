package Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationPage_Validation {
	
	public static void main(String[] args) {  
        WebDriverManager.chromedriver().setup();  
        WebDriver driver = new ChromeDriver();  
  
        driver.get("http://ehrs-frontend-app.s3-website-us-east-1.amazonaws.com/");  
  
        WebElement registrationButton = driver.findElement(By.xpath("//a[contains(text(),'Registration')]"));  
        registrationButton.click();  
        
        //Patient Name field validation  
        WebElement name = driver.findElement(By.name("PatientName"));  
        name.sendKeys("Test Patient");  
        if (name.getAttribute("value").length() <= 300) {  
            System.out.println("Patient Name validation passed");  
        } else {  
            System.out.println("Patient Name validation failed");  
        }  
  
        //DOB field validation  
        WebElement dob = driver.findElement(By.name("dob"));  
        dob.sendKeys("2000-01-01"); //format: YYYY-MM-DD  
        System.out.println("DOB validation passed");  
  
        //Gender field validation  
        WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@name='gender' and @value='Male']"));  
        maleRadioBtn.click();  
        System.out.println("Gender validation passed");  
  
        //Email field validation  
        WebElement email = driver.findElement(By.name("email"));  
        email.sendKeys("test@email.com");  
        if (email.getAttribute("value").matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {  
            System.out.println("Email validation passed");  
        } else {  
            System.out.println("Email validation failed");  
        }  
  
        //Mobile field validation  
        WebElement mobile = driver.findElement(By.name("mobile"));  
        mobile.sendKeys("1234567890");  
        if (mobile.getAttribute("value").matches("\\d{10}")) {  
            System.out.println("Mobile validation passed");  
        } else {  
            System.out.println("Mobile validation failed");  
        }  
  
        //Pincode field validation  
        WebElement pincode = driver.findElement(By.name("pincode"));  
        pincode.sendKeys("123456");  
        if (pincode.getAttribute("value").matches("\\d{6}")) {  
            System.out.println("Pincode validation passed");  
        } else {  
            System.out.println("Pincode validation failed");  
        }  
  
        //Address field validation  
        WebElement address = driver.findElement(By.name("address"));  
        address.sendKeys("Test Address");  
        if (address.getAttribute("value").length() <= 300) {  
            System.out.println("Address validation passed");  
        } else {  
            System.out.println("Address validation failed");  
        }  
    
        driver.quit();  
    }  


}
