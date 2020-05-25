package com.sundayspecial.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sundayspecial.basedriver.Basedriver;
import com.sundayspecial.pages.Passengers;

public class Testcase6 extends Basedriver {

	@Test
	@Parameters({ "name", "lastname", "mealtype" })

	public void testPassengerClass(String name, String lastname, String mealtype) {
		Passengers pas = new Passengers();
		pas.firstname(name);
		pas.lastname(lastname);
		pas.mealoption(mealtype);
	}
}
