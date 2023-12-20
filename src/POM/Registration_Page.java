package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration_Page {
	
	
	
	private static WebElement element = null;
	
	public static String url = "http://ehrs-frontend-app.s3-website-us-east-1.amazonaws.com/";
	
	
	
	public static WebElement Registration_Link(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//a[contains(text(),'Registration')]"));
		return element;
	}

	public static WebElement Patient_Name(WebDriver driver)
	{
		element = driver.findElement(By.name("PatientName")); 
		return element;
	}
	
	public static WebElement DOB(WebDriver driver)
	{
		element = driver.findElement(By.id("dob"));  
		return element;		
	}

	public static WebElement Gender(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//input[@name='gender' and @value='M']"));
		return element;
	}
	
	public static WebElement email(WebDriver driver)
	{
		element = driver.findElement (By.name("email"));
		return element;
	}
	
	public static WebElement mobile(WebDriver driver)
	{
		element = driver.findElement(By.name("mobile"));
		return element;
	}
	
	public static WebElement address(WebDriver driver)
	{
		element = driver.findElement(By.name("address"));
		return element;
	}
	
	public static WebElement pincode(WebDriver driver)
	{
		element = driver.findElement(By.name("pincode"));
		return element;
	}
	
	public static WebElement Submit(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//button[@type='submit']"));
		return element;
	}

	}

