package com.sundayspecial.testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sundayspecial.basedriver.Basedriver;
import com.sundayspecial.flows.Loginflow;

public class Testcase1 extends Loginflow {


	@BeforeSuite
	@Parameters({"url"})
	public void launchlogin(String url) throws InterruptedException
	{
		Loginflow log = new Loginflow();
		launchurl(url);
	}
	@Test
	@Parameters({"username","password"})
	public void testflow(String username ,String password) throws InterruptedException {
		
		Loginflow lo =new Loginflow();
		lo.flow_login(username, password);
	}
	@AfterSuite
	public void closeTheBrowser() {
		driver.quit();
	}


}


