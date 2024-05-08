package objectandoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionSequence {

	
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//identify username and password
		WebElement username=driver.findElement(By.id("email"));
		//username.sendKeys("iwiqpppp");
		Actions acts=new Actions(driver);
		
		Action act= acts.moveToElement(username).click()
				.keyDown(Keys.SHIFT)  //copy the username
				.sendKeys("ioqioeiyrywi")
				.keyUp(Keys.SHIFT)
				.doubleClick()
				.keyDown(Keys.CONTROL)
				.sendKeys("c")
				.keyUp(Keys.CONTROL)
		
				.build();
		act.perform();
		Thread.sleep(3000);
		WebElement password=driver.findElement(By.id("pass"));
		Action act1=acts.moveToElement(password).click()
				
				.keyDown(Keys.CONTROL)
				.sendKeys("v").build();
        act1.perform();
        
		//act.moveToElement(password).sendKeys("dgjagkgka").build().perform();
		//password.sendKeys("ijkjkjjk");
	    
		
		
		
		
	}
}
