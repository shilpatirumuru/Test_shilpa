

package com.eBanking.sunnyfinbank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin {
	
	@FindBy(xpath="//a[@href='admin_banker_master.aspx']")
	public static WebElement Branches;
	@FindBy(xpath="//a[@href='Admin_Roles_details.aspx']")
	public static WebElement Roles;
	@FindBy(xpath="//a[@href='userdetails.aspx']")
	public static WebElement users;
	@FindBy(xpath="//a[@href='Admin_Emp_details.aspx']")
	public static WebElement employees;
	@FindBy(xpath="//a[@href='home.aspx']")
	public static WebElement logout;

}
