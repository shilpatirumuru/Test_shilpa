package keyworddriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocatorRepository {
	public static WebDriver driver;
	
	public static By Locatorvalue(String Loctype,String Locvalue)
	{
		By Loc=null;
		switch(Loctype) {
		case "id":
			Loc = By.id(Locvalue); 
			break;
		case"name":
			Loc=By.name(Locvalue);
		case "xpath":
			Loc = By.xpath(Locvalue); 
			break;
		case "cssSelector":
			Loc = By.cssSelector(Locvalue);
			break;
		case "linkText":
			Loc = By.linkText(Locvalue) ;
			break;
		case "partialLinkText":
			Loc = By.partialLinkText(Locvalue) ;
			break;
		default:
			Loc = null;
			break;
		}
		return Loc;
		
	}

}
