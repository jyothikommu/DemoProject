package objectandoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class RadioButtonOperations {
// count of radio buttons
// identify the specific one
// displayed or not
// enabled or not
// verify default status
//select radio button
// verify select status
// select one by one

	
	public static void main(String[] args) throws InterruptedException {
	//get browser instance
	WebDriver driver= new ChromeDriver();
	//open facebook application
	driver.navigate().to("https://www.facebook.com/");
	// identify the create account and click
	driver.findElement(By.linkText("Create new account")).click();
	Thread.sleep(2000);
    // count of radio buttons
	int radiobutton= driver.findElements(By.xpath("//input[@type='radio']")).size();
	System.out.println(radiobutton);
	// identify the specific one
    WebElement rbutton=driver.findElement(By.xpath("//input[@value='-1']"));
    rbutton.click();
    // displayed or not
    if(rbutton.isDisplayed()==true)
    {
    	System.out.println("is displayed");
    }
    else
    {
    	System.out.println("not displayed");
    }
    if(rbutton.isEnabled()==true)
    {
    	System.out.println("is enabled");
    }
    else
    {
    	System.out.println("not enabled");
    }
    
		
		
		
		
		
		
		
		
	}
	
}
