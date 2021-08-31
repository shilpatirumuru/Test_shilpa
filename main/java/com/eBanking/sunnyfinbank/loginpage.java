package com.eBanking.sunnyfinbank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class loginpage {
//	//normal method
//	public static WebElement username(WebDriver driver)
//	{
//	 WebElement username =driver.findElement(By.name("txtuId"));
//	 return username;
//	}
//	public static WebElement password(WebDriver driver)
//	{
//		WebElement password  =driver.findElement(By.name("txtPword"));
//		 return password;
//	}
//	public static WebElement login(WebDriver driver)
//	{
//		WebElement login  =driver.findElement(By.name("login"));
//		 return login;
//	}
	//using findBY
	@FindBy(name="txtuId")
	public static WebElement username;
	@FindBy(name="txtPword")
	public static WebElement password;
	@FindBy(name="login")
	public static WebElement login;

}
