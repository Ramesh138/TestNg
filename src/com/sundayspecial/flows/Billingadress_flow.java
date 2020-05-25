package com.sundayspecial.flows;

import com.sundayspecial.basedriver.Basedriver;
import com.sundayspecial.pages.Billingadress;

public class Billingadress_flow extends Basedriver{
Billingadress bil =new Billingadress();

public void Billingadress(String adress,String cityname,String country,String postalcode,String statename ) throws InterruptedException {
	bil.adress(adress);
	bil.city(cityname);
	bil.country(country);
	bil.postalcode(postalcode);
	bil.state(statename);
	
}
}
