package com.sundayspecial.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sundayspecial.basedriver.Basedriver;
import com.sundayspecial.flows.Flightdetails_flow;

public class Testcase5 extends Basedriver {

	@Test
	@Parameters({"location","date","date1"})
	
	public void testflightDeliveryClass(String location, String date, String date1) throws InterruptedException {
		Flightdetails_flow fli =new Flightdetails_flow();
		fli.Flightdetails(location, date, date1);
	}
}
