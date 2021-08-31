package DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Locators {
		
	public static By Loginpage_Username=By.name("txtuId");
	public static By Login_password=By.name("txtPword");
	public static By login=By.name("login");
	public static By Admin=By.xpath("//a[@href='admin_banker_master.aspx']");
	//public static By newbranch_click=By.xpath("//a[@id='BtnNewBR']");
	public static By newbranch_click=By.id("BtnNewBR");
	public static By Branch_name=By.id("txtbName");
	public static By Adress1=By.id("txtAdd1");
	public static By zipcode=By.id("txtZip");
	public static By country=By.id("lst_counrtyU");//id="lst_counrtyU"
	public static By state=By.id("lst_stateI");
	public static By city=By.id("lst_cityI");
	public static By submit=By.id("btn_insert");

}
