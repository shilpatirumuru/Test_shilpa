package com.eBanking.sunnyfinbank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NewBranchCreation 
{
	//@FindBy(id="BtnNewBR'")
	@FindBy(xpath = "//a[@id='BtnNewBR']")	
	public static WebElement newbranch_click;
	@FindBy(id= "txtbName")
	public static WebElement Branch_name;
	@FindBy(id="txtAdd1")
	public static WebElement Adress1;
	@FindBy(id="Txtadd2")
	public static WebElement Adress2;
	@FindBy(id="txtadd3")
	public static WebElement Adress3;
	@FindBy(id="txtArea")
	public static WebElement Area;
	@FindBy(id="txtZip")
	public static WebElement zipcode;
	@FindBy(id="lst_counrtyU")//lst_counrtyU
	public static WebElement country;
	@FindBy(id="lst_stateI")//lst_stateI
	public static WebElement state;
	@FindBy(id="lst_cityI")//lst_cityI
	public static WebElement city;
	@FindBy(id="btn_insert")
	public static WebElement submit;
	

}
