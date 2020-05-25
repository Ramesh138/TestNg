package com.sundayspecial.flows;

import com.sundayspecial.pages.Flightdetails;

public class Flightdetails_flow {
Flightdetails fli =new Flightdetails();

public void Flightdetails(String location,String date,String date1) throws InterruptedException {
	fli.arriveto(location);
	fli.clickcontinue();
	fli.departfrom(location);
	fli.fromdate(date1);
	fli.todate(date1);
	
}
}
 