package objectandoperations;

import java.lang.reflect.Array;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v120.browser.Browser;
import org.openqa.selenium.devtools.v120.domsnapshot.model.ArrayOfStrings;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowsers {

	
	public static void main(String[] args) {
	  String[] browser= {"Chrome","Firefox","Edge"};
	  WebDriver driver=null;
	  for (int i=0; i< browser.length; i++)
	  {
		  String bname= browser[i];
		  if(bname.equalsIgnoreCase("Chrome"))
		  {
			  driver=new ChromeDriver();
		
			    }
		  else if(bname.equalsIgnoreCase("Firefox"))
		  {
			  driver= new FirefoxDriver();
		  }
		  else if(bname.equalsIgnoreCase("Edge"))
		  {
			  driver= new EdgeDriver();
		  }
		//open app
			driver.get("https://www.facebook.com/");
	}
}
}