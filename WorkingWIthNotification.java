package objectandoperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class WorkingWIthNotification {

	
  public static void main(String[] args) {
		//define chrome options
	  ChromeOptions coptions= new ChromeOptions();
	  coptions.addArguments("--disable-notifications");
	  
	  WebDriver driver= new ChromeDriver(coptions);
	  driver.get("https://www.ajio.com/");
	  //edge browser and chrome
	  EdgeOptions edoptions= new EdgeOptions();
	  edoptions.addArguments("--disable-notifications");
	  WebDriver edriver= new EdgeDriver(edoptions);
	  
	  //open test app
	  edriver.get("https://www.ajio.com/");
		
		
		
			}
		}
	

