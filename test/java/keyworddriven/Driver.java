package keyworddriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Driver {
	
	public WebDriver driver;
	
	@BeforeTest
	public void launchApp() 
	  {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.1.102/sunnyfinbank/home.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 }
	
	@Test
	public void KeywordOperations() 
	{   
		//Excelconnection
		Excel_Class.createconnection("X:\\keyworddriven.xls", "role");
		//read no of rows in excel
		int rowcount=Excel_Class.rowcount();
		//iterarte no of rows
		for(int i=0;1<=rowcount;i++)
		{
		String className=Excel_Class.readdata(2,i);
		String locatortype=Excel_Class.readdata(3,i);
		String locatorvalue=Excel_Class.readdata(4,i);
		String inputdata=Excel_Class.readdata(5, i);
		
		
		  switch (className) 
	      {
		case "editbox":
			driver.findElement(LocatorRepository.Locatorvalue(locatortype, locatorvalue )).clear();
			driver.findElement(LocatorRepository.Locatorvalue(locatortype,locatorvalue )).sendKeys(inputdata);
			break;

		case "button":
			driver.findElement(LocatorRepository.Locatorvalue(locatortype, locatorvalue )).click();
			break;

		case "link":
			driver.findElement(LocatorRepository.Locatorvalue(locatortype, locatorvalue )).click();
			break;

		case "checkbox":
			driver.findElement(LocatorRepository.Locatorvalue(locatortype, locatorvalue )).click();
			break;

		case "dropdown":
			new Select(driver.findElement(LocatorRepository.Locatorvalue(locatortype,locatorvalue))).selectByVisibleText(inputdata);
			break;

		case "alert":
			driver.switchTo().alert().accept();
			break;

		case "wait":
			try 
			    {
			     Thread.sleep(5000);
			    } 
			catch (Exception e) 
			    {
				e.getMessage();
			    }
			break;

		case "image":
			driver.findElement(LocatorRepository.Locatorvalue(locatortype, locatorvalue)).click();
			break;

		default:
			break;
	    }
	}
	}
}
