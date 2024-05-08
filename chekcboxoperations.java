package objectandoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chekcboxoperations {
//count of checkboxes
//identify the specific checkbox
//displayed or not
// enabled or not
//verify default status
// select checkbox
//verify select status
//deselect checkbox
//verify deselect status
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		//count of checkboxes
		WebElement checkbox=driver.findElement(By.xpath("(//*[@class='a-icon a-icon-checkbox'])[1]"));
		checkbox.click();
		
		
		
		
		
		
		
		
		
	}
}
