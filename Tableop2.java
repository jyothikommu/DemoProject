package objectandoperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tableop2 {

	public static void main(String[] args) throws Exception {
		
			//create browser instance
			WebDriver driver=new ChromeDriver();
			
			//open table
			driver.get("file:///C:/Users/life/Downloads/table.html");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//table count
            int tablecount=driver.findElements(By.id("table1")).size();
			System.out.println(tablecount);
			//row count
            int rowcount=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr")).size();
            System.out.println("count of rows="+rowcount);
            //column count
            int colcount=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td")).size();
            System.out.println("count of columns="+colcount);
            //specific row count
            int spcrowcount=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[2]/td[4]")).size();
            System.out.println("spc row count="+spcrowcount);
            //specifi row value count
            int spcrowvcount=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[2]/td")).size();
            System.out.println("spc row value count="+spcrowvcount);
            //specific row column value
            WebElement spcrowcolvalue=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[2]/td[2]"));
            String rowdata= spcrowcolvalue.getText();
            System.out.println(rowdata);
            //count of checkbox
            int cofcheckbox=driver.findElements(By.xpath("//input[@type='checkbox']")).size();
            System.out.println("count of checkbox="+cofcheckbox);
            //clicking the specific checkbox
          /*WebElement clickthespccb=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]/td[1]/input[@value='c1']"));
           //clickthespccb.click();
           //identify each row checkbox
	    	//int rowbasedcb=driver.findElements(By.xpath("//table1']/tbody/tr[1]/td[1]/input[@type='checkbox']")).size();
	    	//System.out.println("row based count"+rowbasedcb);*/
	         //identify row based checkbox of all
	    	for(int i=1; i<rowcount; i++)
	    	{
	    	// col count on row based
	    	int colconrow=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td")).size();
	   		System.out.println("colconrow");
	   		//column loop
			for (int j=1; j<colconrow; j++)
					
					{
			//identify the element/cell
						
			WebElement cloop=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]"));
			String data=cloop.getText();
			System.out.println("row data="+data);
					}
	    	}
            // count of checkboxes in a row
			//select all the check boxes 
			for(int a=1; a<=rowcount;a++)
				{
					
			int rowcheck= driver.findElements(By.xpath("//table[@id='table1']/tbody/tr["+a+"]/td[1]/input[@type='checkbox']")).size();
			//count of check boxes in specific rows 
			System.out.println(+a+" row checkboxcount "+rowcheck);
					
				for(int j=1;j<=rowcheck;j++)
					{
			WebElement element=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+a+"]/td[1]/input[@value='c"+j+"']"));
			element.click();
					}
				
				}
			//deselect all the check boxes which are select
				for(int a=1; a<=rowcount;a++)
				{
			int rowcheck= driver.findElements(By.xpath("//table[@id='table1']/tbody/tr["+a+"]/td[1]/input[@type='checkbox']")).size();
			//System.out.println(rowcheck);
			for(int j=1;j<=rowcheck;j++)
					{
			WebElement element=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+a+"]/td[1]/input[@value='c"+j+"']"));
			element.click();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
					}
				
				}
				
	    	}
	}

