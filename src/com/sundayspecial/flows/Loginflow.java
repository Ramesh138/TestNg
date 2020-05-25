package com.sundayspecial.flows;

import com.sundayspecial.basedriver.Basedriver;
import com.sundayspecial.pages.Loginclass;

public class Loginflow extends Basedriver {
	
	Loginclass lc =new Loginclass();
	
	
	public void flow_login(String username,String password) throws InterruptedException   {
		lc.username(username);
		lc.password(password);
		lc.clicklogin();
	}
	
}