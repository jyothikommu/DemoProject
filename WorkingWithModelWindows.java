package objectandoperations;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WorkingWithModelWindows {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//create page
		WebElement createac=driver.findElement(By.linkText("Create a Page"));
		createac.click();
		Thread.sleep(5000);
		//capture model window title
		String mtitle=driver.getWindowHandle();
		System.out.println(mtitle);
		//switch to model window
		driver.switchTo().window(mtitle);
		//working with model window(open main page with sub page)
		//identify the username
		WebElement fbookusername=driver.findElement(By.xpath("//input[@name='email']"));
		fbookusername.sendKeys("jyothi@gmail.com");
		//identify the password
		WebElement fbookpassword=driver.findElement(By.xpath("//input[@name='pass']"));
		fbookpassword.sendKeys("ajdhsjd");
		
		// identify the login button and click
		WebElement loginbutton=driver.findElement(By.xpath("//button[@id='loginbutton']"));
		loginbutton.click();
	    //switch to default window
		driver.switchTo().defaultContent();
		//identify login username and password
		WebElement fbusername=driver.findElement(By.xpath("//input[@name='email']"));
		fbusername.sendKeys("hdgchsgd");
		
		WebElement fbpassword=driver.findElement(By.xpath("//input[@name='pass']"));
		fbpassword.sendKeys("fhjksdhjsh");
		//identify login
		WebElement loginb=driver.findElement(By.xpath("//button[@name='login']"));
		loginb.click();
		
		
		
		}
	
	
	
	
	
	
}
