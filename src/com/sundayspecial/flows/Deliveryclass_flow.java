package com.sundayspecial.flows;

import com.sundayspecial.basedriver.Basedriver;
import com.sundayspecial.pages.Deliveryclass;

public class Deliveryclass_flow extends Basedriver {
Deliveryclass del=new Deliveryclass();

public void Deliveryclass(String purchase,String logout,String adress,String city,String state) throws InterruptedException {
	del.clicksecurepurchase(purchase);
	del.clicklogout();
	del.deliveryadr(adress);
	del.deliverycity(city);
	del.deliverystate(state);
}

}
