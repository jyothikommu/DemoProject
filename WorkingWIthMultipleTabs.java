package objectandoperations;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v120.browser.Browser;

public class WorkingWIthMultipleTabs {
public static void main(String[] args) throws InterruptedException {
// create browser instance
WebDriver driver= new ChromeDriver();
// open app
driver.get("https://www.facebook.com/");
//open meta pay
WebElement metapay= driver.findElement(By.xpath("//a[contains(text(),'Meta Pay')]"));
metapay.click();
//open meta quest
WebElement metaquest= driver.findElement(By.xpath("//a[contains(text(),'Meta Quest')]"));
metaquest.click();
//open metastore
WebElement metastore= driver.findElement(By.xpath("//a[contains(text(),'Meta Store')]"));
metastore.click();
// instagram op
WebElement instagram= driver.findElement(By.linkText("Instagram"));
instagram.click();
//all tabs store into list or array list
// tabs count
ArrayList<String> tabs= new ArrayList<String>(driver.getWindowHandles());
System.out.println(tabs.size());
//display all tabs names or titles
 for(int i=0; i<tabs.size(); i++)
 {
	 driver.switchTo().window(tabs.get(i));
	 //capture title
	 String btitle=driver.getTitle();
	 System.out.println(btitle);
	 Thread.sleep(5000);
     // verify instagram and get user name and password
	 if(btitle.equalsIgnoreCase("Instagram")==true)
	 {
     WebElement instausername=driver.findElement(By.xpath("//input[@name='username']"));
     instausername.sendKeys("jyothi");
     
     WebElement instapassword=driver.findElement(By.xpath("//input[@name='password']"));
     instapassword.sendKeys("jyo123");
	 }
	 if( btitle.equalsIgnoreCase("Facebook – log in or sign up")==true)
	 {
		 
     // verify facebook
     WebElement fbookusername=driver.findElement(By.xpath("//input[@name='email']"));
     fbookusername.sendKeys("jyothikommu@gmail.com");
     WebElement fbookpassword=driver.findElement(By.xpath("//input[@name='pass']"));
     fbookpassword.sendKeys("Jyo@123");
	 }
     //close metastore tab
     if(btitle.equalsIgnoreCase("Meta - Shop VR Headsets & Smart Glasses | Meta Store")==true)
{
	 driver.close();
}
     
     
     
     
     
     
     
     
	 }
     
     
	 }
    
		
	}

	
	
	

