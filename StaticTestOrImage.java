package objectandoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTestOrImage {
// identify the object
//capture the data
	public static void main(String[] args) {
		
	
	//get browser instance
	WebDriver driver= new ChromeDriver();
	//open facebook application
	driver.navigate().to("https://www.facebook.com/");	
	//Thread.sleep(2000);
	/// identify the static text 
	WebElement statictext= driver.findElement(By.xpath("//div/h2"));
	String actualtext= statictext.getText();
    String expectedText= "Facebook helps you connect and share with the people in your life.";
    System.out.println(expectedText);
    if(expectedText.equalsIgnoreCase(actualtext))
    {
    	System.out.println("matches with actual");
    }
    else
    {
    	System.out.println("not matched");
    }
    // identify the forgotten password
    WebElement forgotpwdLink= driver.findElement(By.linkText("Forgotten password?"));
    forgotpwdLink.click();
    
    WebElement statictext1= driver.findElement(By.xpath("//td/div"));
	String actualtextOfForgotpwd= statictext1.getText();
	String expectedtextOfForgotpwd= "Please enter your email address or mobile number to search for your account.";

	if(expectedtextOfForgotpwd.equalsIgnoreCase(actualtextOfForgotpwd))
	{
		System.out.println("matches");
	}
	else
	{
		System.out.println("not matched");
	}
    
    
    }
			
}

