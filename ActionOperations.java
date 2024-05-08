package objectandoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionOperations {

	public static void main(String[] args) {
		//create browser instance
		WebDriver driver=new ChromeDriver();
		//open app
		driver.get("https://www.espncricinfo.com/");
		//creating an action 
        WebElement createac=driver.findElement(By.xpath("//div/a[@href='/team']"));
        Actions ac=new Actions(driver);
        ac.moveToElement(createac).perform();
        //click on nepal
       
		
	}
}
