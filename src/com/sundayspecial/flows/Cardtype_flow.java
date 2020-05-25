package com.sundayspecial.flows;

import com.sundayspecial.basedriver.Basedriver;
import com.sundayspecial.pages.Cardtype;

public class Cardtype_flow extends Basedriver {
	Cardtype car = new Cardtype();

	public void Cardtype(String cardtype, String date, String name, String lastname, String cardnumber)
			throws InterruptedException {
		car.cardnumber(cardnumber);
		car.cardtype(cardtype);
		car.expirydate(date);
		car.firstname(name);
		car.lastname(lastname);

	}
}
