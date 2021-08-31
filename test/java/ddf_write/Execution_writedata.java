package ddf_write;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ddf_writingandreading.Excel;

public class Execution_writedata extends Repository_write {
	@DataProvider(name="branchdata")
	public Object [][] branchcreationdata()
	{
		return getExcelContents("X:\\Datadriven_excel1.xls", "branches");
	}

	@Test(priority=3, dataProvider = "branchdata")

	public static void verifybranchcreation(String bname, String add1, String zipcode, String country, String state,
			String city) throws Exception
	{
		branchCreation(bname, add1, zipcode, country, state, city);
		//Reporter.log("new branch creation", true);
		
	}


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
	@Test(priority=2)
	public void verifyBranchCreation(String bname, String add1, String zipcode, String country, String state,String city) throws Exception
	{
		Excel.createoutputexcelconnection("Datadriven_excel1", "Datadriven_excel1", "branches");//Datadriven_excel1
		int rc=Excel.rowcount();
		for(int i=0;i<rc;i++) {
			
		}

	String result=branchCreation(bname, add1, zipcode, country, state, city);
//	String exptitle="admin_banker_master";
//	String Actualtitle=driver.getTitle();
//	if(result.contains("new branch with")) {
//		Excel.writedata(6, 0, result);
//	}
//	else if{
//		
//	}
	

}
}
