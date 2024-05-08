package objectandoperations;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkOperations {
//count of links
//all links store into list
//displayed all link names and URLS
//identify the specific one
//enabled or not
//displayed or not
//click on specific link
//verify title
//back
//verify title
//click on another link
//verify title
//back
public static void main(String[] args) throws InterruptedException {
	

	//get browser instance
	WebDriver driver= new ChromeDriver();
	//open facebook application
	driver.navigate().to("https://www.facebook.com/");	
	//count of links
    int links= driver.findElements(By.xpath("//a")).size();
    System.out.println(links);
    //all links store into list
    List<WebElement> links1= driver.findElements(By.xpath("//a"));
    System.out.println(links1);
    //displayed all link names and URLS
    for(int i=0; i<links1.size(); i++)
    {
    	//capture link name
    	String linkname= links1.get(i).getText();
    	System.out.println(linkname);
    	//capture url
    	String urlname=links1.get(i).getAttribute("href");
    	System.out.println(urlname);
    }

    //identify the specific one
    //  driver.findElement(By.xpath("//Forgotten password?")).click();
    
    
    //capture home page title
    String hometitle=driver.getTitle();
    System.out.println(hometitle);
    //identify the forgot password
    WebElement forgotpwd=driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?']"));
    forgotpwd.click();
    //verify title
    if(hometitle.equalsIgnoreCase(driver.getTitle())==false) {
    	System.out.println("forgotpwd displayed");
    	Thread.sleep(5000);
    	driver.navigate().back();
    	Thread.sleep(5000);
    	}
    	
    	else
    	{
    		System.out.println("page not displayed");
    	}
    	if(hometitle.equalsIgnoreCase(driver.getTitle())==true) {
        	System.out.println("home page");
        	Thread.sleep(5000);
        	driver.navigate().back();
        	Thread.sleep(5000);
    	}
        	else
        	{
        		System.out.println("page not displayed");
        	}
    	//identify the another link text by using linktext
        WebElement element=driver.findElement(By.linkText("Help"));
        element.click();        	
        	
        	
    }
    
    
    
}
