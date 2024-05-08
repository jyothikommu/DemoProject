package objectandoperations;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class ListBoxOperations {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		// get browser instance
			WebDriver driver= new ChromeDriver();
			
			//how to apply implicit weight

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		//open facebook application
		 driver.navigate().to("https://www.facebook.com/");
		 
	
	    // identify the create account and click
		
		 driver.findElement(By.linkText("Create new account")).click();
		 
		// Thread.sleep(5000);
		 
        // count of list boxes
		int ListCount= driver.findElements(By.xpath("//select")).size();
		
		System.out.println(ListCount);
				
		// all list boxes store into list
		List<WebElement> selectcount= driver.findElements(By.xpath("//select"));
		
		System.out.println(selectcount.size());
        // identify the month object
		
		WebElement objmonth = driver.findElement(By.name("birthday_month"));
		
		//month object displayed or not
		//month object enabled or not
		//capture month data
		
		String Monthdata= objmonth.getText();
		
		System.out.println(Monthdata);
		
		//count of month items
		
	   int monthItems = driver.findElements(By.xpath("//select [@id='month']/option")).size();

         System.out.println(monthItems);
         
    // month object convert to select category   
    Select mselect= new Select(objmonth);
    //  all list items store into list     
    List<WebElement> mlistitems= mselect.getOptions();
    System.out.println(mlistitems.size());		 
    // select specific month using visible text
     mselect.selectByVisibleText("Sep");
    Thread.sleep(5000);
    //select specific month (using value)
	mselect.selectByValue("4");
	//System.out.println("4");
	Thread.sleep(5000);
    // select by using index
    mselect.selectByIndex(4);
    // select any index (using random), define random
    Random myran= new Random();
    int anyPosition= myran.nextInt(monthItems-1);
    System.out.println(anyPosition);
    mselect.selectByIndex(anyPosition);
    // select one by one item 
    for(int i=0; i<monthItems; i++)
    {
    mselect.selectByIndex(i);
    Thread.sleep(500);
    // capture selected month text
    String mText= mlistitems.get(i).getAttribute("label");
    System.out.println(mText);
  /*  // capture selected month value
    String mValue= mlistitems.get(i).getAttribute("value");
    System.out.println(mValue);
    // capture month value from web element
    String mValue2= objmonth.getAttribute("Value");
    System.out.println(mValue2);*/
    
    
    
    
    
    }
         
         
		
	}
}
