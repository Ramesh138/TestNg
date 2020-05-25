package com.sundayspecial.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sundayspecial.basedriver.Basedriver;
import com.sundayspecial.flows.Cardtype_flow;

public class Testcase3 extends Basedriver {

	@Test
	@Parameters({"cardtype","date","name","lastname","cardnumber"})
	public void testCardType(String cardtype, String date, String name, String lastname, String cardnumber)
			throws InterruptedException {
		Cardtype_flow car =new Cardtype_flow();
		car.Cardtype(cardtype, date, name, lastname, cardnumber);
	}
}
