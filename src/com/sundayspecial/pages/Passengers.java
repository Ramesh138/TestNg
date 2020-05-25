package com.sundayspecial.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.sundayspecial.basedriver.Basedriver;

public class Passengers extends Basedriver {

	public void firstname(String name) {
		driver.findElement(By.name("passFirst0")).sendKeys(name);
		
	}
	public void lastname(String lastname) {
		driver.findElement(By.name("passLast0")).sendKeys(lastname);
	}
	public void mealoption(String mealtype) {
		WebElement ele=driver.findElement(By.name("pass.0.meal"));
		Select mealoption = new Select(ele);
		mealoption.selectByVisibleText(mealtype);
		System.out.println("meal type");
	}
}
