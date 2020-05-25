package com.sundayspecial.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sundayspecial.basedriver.Basedriver;
import com.sundayspecial.flows.Billingadress_flow;
import com.sundayspecial.flows.Loginflow;
import com.sundayspecial.pages.Billingadress;

public class Testcase2 extends Basedriver {

	

	@Test
	@Parameters({ "adress", "cityname", "country", "postalcode", "statename" })
	public void testBillingadress(String adress, String cityname, String country, String postalcode, String statename)
			throws InterruptedException {
		Billingadress_flow bif = new Billingadress_flow();
		bif.Billingadress(adress, cityname, country, postalcode, statename);
	}

}
