package DataDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Repository  {
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
		driver.findElement(Locators.Loginpage_Username).sendKeys("Admin");
		driver.findElement(Locators.Login_password).sendKeys("Admin");
		driver.findElement(Locators.login).click();
	}
	
	public static void newbranch()
	{
		driver.findElement(Locators.Admin).click();
		//driver.findElement(Locators.newbranch_click).click();
	}
	
	public static String branchCreation(String bname, String add1, String zipcode, String country, String state,String city) throws Exception {
		
	
		driver.findElement(Locators.newbranch_click).click();
		//Thread.sleep(2000);
		
		driver.findElement(Locators.Branch_name).sendKeys(bname);
		Thread.sleep(1000);
		driver.findElement(Locators.Adress1).sendKeys(add1);
		Thread.sleep(1000);
		driver.findElement(Locators.zipcode).sendKeys(zipcode);
		Thread.sleep(1000);
		new Select(driver.findElement(Locators.country)).selectByVisibleText(country);
		Thread.sleep(1000);
		new Select(driver.findElement(Locators.state)).selectByVisibleText(state);
		Thread.sleep(1000);
		new Select(driver.findElement(Locators.city)).selectByVisibleText(city);
		Thread.sleep(1000);
		driver.findElement(Locators.submit).click();
		Thread.sleep(1000);
		String result = driver.switchTo().alert().getText();
		System.out.println(result);
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		return result;
		
	}
	
	
	
	public Object[][] getExcelContents(String fileName, String sheetName) {
		Excel_Class.createconnection(fileName, sheetName);
		//Excel_class.createExcelConnection(fileName, sheetName);
		
		int rc = Excel_Class.rowcount();
		System.out.println(rc);
		int cc = Excel_Class.columncount();
		System.out.println(cc);
		
		String[][] data = new String[rc - 1][cc];
		for (int r = 1; r < rc; r++) {
			for (int c = 0; c < cc; c++) {
				data[r-1][c] = Excel_Class.readdata(c, r);
			}
		}
		return data;
	}
}


