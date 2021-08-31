package DataDriven;

//import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestExecution extends Repository
{
	@BeforeTest
	
	public void verifylaunch()
	{
		launch();
	}
	@Test(priority=1)
	public void verifylogin()
	{
		login();
		newbranch();
		
	}
	@DataProvider(name="branchdata")
	public Object [][] branchcreationdata()
	{
		return getExcelContents("X:\\Datadriven_excel1.xls", "branches");
	}

	@Test(priority=2, dataProvider = "branchdata")

	public static void verifybranchcreation(String bname, String add1, String zipcode, String country, String state,String city) throws Exception
	{
		branchCreation(bname, add1, zipcode, country, state, city);
		//Reporter.log("new branch creation", true);
		
	}



//	@Test(priority=2)
//	public void verifyBranchCreation(String bname, String add1, String zipcode, String country, String state,String city) throws Exception
//	{
//
//	String result=branchCreation(bname, add1, zipcode, country, state, city);
//	
//	}
}
