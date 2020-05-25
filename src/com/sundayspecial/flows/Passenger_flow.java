package com.sundayspecial.flows;

import com.sundayspecial.pages.Passengers;

public class Passenger_flow {
Passengers  pas =new Passengers();

public void Passenger(String name,String lastname,String mealtype) {
	pas.firstname(name);
	pas.lastname(lastname);
	pas.mealoption(mealtype);
	
}
}
