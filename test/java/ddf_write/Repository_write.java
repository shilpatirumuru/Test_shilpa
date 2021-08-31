package ddf_write;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import ddf_writingandreading.Excel;
import ddf_writingandreading.Locators;


public class Repository_write {
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
		Thread.sleep(2000);
		driver.findElement(Locators.Branch_name).sendKeys(bname);
		Thread.sleep(2000);
		driver.findElement(Locators.Adress1).sendKeys(add1);
		Thread.sleep(2000);
		driver.findElement(Locators.zipcode).sendKeys(zipcode);
		Thread.sleep(2000);
		new Select(driver.findElement(Locators.country)).selectByVisibleText(country);
		Thread.sleep(2000);
		new Select(driver.findElement(Locators.state)).selectByVisibleText(state);
		Thread.sleep(2000);
		new Select(driver.findElement(Locators.city)).selectByVisibleText(city);
		Thread.sleep(2000);
		driver.findElement(Locators.submit).click();
		Thread.sleep(2000);
		String result = driver.switchTo().alert().getText();
		System.out.println(result);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		return result;
	}
	
	public Object[][] getExcelContents(String fileName, String sheetName) {
		Excel.createexcelconnection(fileName, sheetName);		
		int rc = Excel.rowcount();
		System.out.println(rc);
		int cc = Excel.columncount();
		System.out.println(cc);
		
		String[][] data = new String[rc - 1][cc-1];
		for (int r = 1; r < rc; r++) {
			for (int c = 1; c < cc; c++) {
				data[r - 1][c-1] = Excel.readdata(c, r);
			}
		}
		return data;
	}
	

}
