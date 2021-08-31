package com.eBanking.sunnyfinbank;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Execution extends Repository
{
	@BeforeTest
	public void verifyLaunch()
	{
		launch();
	}
	
	//verify login method
	@Test(priority=0)
	public void verifyLogin()
	{
		login();
	}

	@Test(priority =1)
	
	public void clickbranch()
	{
		branch();
	}
	@Test(priority =2)
	public void newbranchcreation()
	{
		newbranch();
	}
	

}
