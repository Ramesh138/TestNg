package com.sundayspecial.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sundayspecial.basedriver.Basedriver;
import com.sundayspecial.flows.Deliveryclass_flow;

public class Testcase4 extends Basedriver {

	@Test
	@Parameters({ "purchase", "logout", "adress", "city", "state" })

	public void testDeliveryClass(String purchase, String logout, String adress, String city, String state)
			throws InterruptedException {
		Deliveryclass_flow del = new Deliveryclass_flow();
		del.Deliveryclass(purchase, logout, adress, city, state);
	}
}
