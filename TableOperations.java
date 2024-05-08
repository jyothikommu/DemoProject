package objectandoperations;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableOperations {
//table count
//row count
//column count
//specific table row count
//specific table column count
//specific column count on in specific row count in specific table
//capture specific cell data
//capture all cells data
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.rediff.com/");
	//identify the create account page
	WebElement createaccount=driver.findElement(By.xpath("//a[contains(text(),'Create Account')]"));
	createaccount.click();
	//table count
	int tablecount=driver.findElements(By.xpath("//table")).size();
	//column count using tagname
	int columncount=driver.findElements(By.xpath("//td")).size();
	System.out.println(columncount);
	//specific table row count
	int specificrowcount=driver.findElements(By.xpath("//table[@id='tblcrtac']/tbody/tr")).size();
	System.out.println(specificrowcount);
	//specific table column count
	int specificcolcount=driver.findElements(By.xpath("//table[@id='tblcrtac']/tbody/tr/td")).size();
	System.out.println(specificcolcount);
	//specific table specific row column count
	int spctabspcrowcolcount=driver.findElements(By.xpath("//table[@id='tblcrtac']/tbody/tr[9]/td")).size();
	System.out.println(spctabspcrowcolcount);
	//capture specific cell data
	WebElement spccelldata=driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[3]/td[5]"));
	//text getdata
	String expected="Enter your first name & last name";
	String actual= spccelldata.getText();
	System.out.println(actual);
	//enter data in first name
	WebElement fname=driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[3]/td[3]/input"));
	fname.sendKeys("jyothi");
	//count of all row columns
	for (int i=1; i<=specificcolcount; i++)
	{
		int rowcolcount=driver.findElements(By.xpath("//table[@id='tblcrtac']/tbody/tr["+i+"]/td")).size();
		System.out.println(rowcolcount);
	}
	//capture all data
	//row loop
	for(int i=1; i<=specificrowcount; i++)
	{
		//column count on row based

		int colcountrow=driver.findElements(By.xpath("//table[@id='tblcrtac']/tbody/tr["+i+"]/td")).size();
		System.out.println(colcountrow);
	    for(int j=1; j<=colcountrow; j++)
	    {
	    	//identify the cell or element
	    	WebElement gcell=driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr["+i+"]/td["+j+"]"));
	        String celldata= gcell.getText();
	    	System.out.println(celldata);
	    	
	    	
	    	
	    	
	    	
	    	
	    	{
				
			}
	    	
	   
	    }
	}
	    //
}
	
	
	
}
