package com.sundayspecial.testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sundayspecial.basedriver.Basedriver;
import com.sundayspecial.flows.Loginflow;
import com.sundayspecial.pages.Passengers;

public class Setup extends Basedriver {

	@BeforeSuite
	@Parameters({"url"})
	public void launchLogin(String url) throws InterruptedException
	{
		launchurl(url);
	}

	@AfterSuite
	public void closeTheBrowser() {
		driver.quit();
	}

}
