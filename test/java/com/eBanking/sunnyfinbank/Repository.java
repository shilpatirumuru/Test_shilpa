package com.eBanking.sunnyfinbank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class Repository 
{
	static WebDriver driver;
	public static void launch()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.1.102/sunnyfinbank/home.aspx");
	}
	public static void login()
	{
		//calling normal method
//		loginpage.username(driver).sendKeys("Admin");
//		loginpage.password(driver).sendKeys("Admin");
//		loginpage.login(driver).click();
		PageFactory.initElements(driver, loginpage.class);
		loginpage.username.sendKeys("Admin");
		loginpage.password.sendKeys("Admin");
		loginpage.login.click();
		
	}
	public static void branch()
	{
		PageFactory.initElements(driver, Admin.class);
		Admin.Branches.click();

	}
	public static void newbranch()
	{
		PageFactory.initElements(driver,NewBranchCreation.class);
		NewBranchCreation.newbranch_click.click();
		NewBranchCreation.Branch_name.sendKeys("ABIDS123");
		NewBranchCreation.Adress1.sendKeys("palaceheights");
		NewBranchCreation.Adress2.sendKeys("trivenicomplex");
		NewBranchCreation.Adress3.sendKeys("Abids");
		NewBranchCreation.Area.sendKeys("Hyderabad");
		NewBranchCreation.zipcode.sendKeys("500010");
		new Select(NewBranchCreation.country).selectByVisibleText("INDIA");
        new Select(NewBranchCreation.state).selectByVisibleText("andra pradesh");
        new Select(NewBranchCreation.city).selectByVisibleText("Hyderabad");
		NewBranchCreation.submit.click();
		driver.switchTo().alert().accept();
		
		
		
	}

}
