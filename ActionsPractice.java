package objectandoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsPractice {

	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//identify username and password
		WebElement username=driver.findElement(By.id("email"));
		Actions acts =new Actions(driver);
		acts.moveToElement(username).sendKeys("testerwd123").build().perform();
		//username.sendKeys("dghghd");
		WebElement password=driver.findElement(By.id("pass"));
		//username.sendKeys("dhhaksl");
		acts.moveToElement(password).sendKeys("gsjagjagbbb").build().perform();
		
		
	}
}


