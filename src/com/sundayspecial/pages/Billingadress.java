package com.sundayspecial.pages;

import org.openqa.selenium.By;

import com.sundayspecial.basedriver.Basedriver;

public class Billingadress extends Basedriver {
	Billingadress  bil=new Billingadress();
	
	public void adress(String adress) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.name("billAddress1")).clear();
		driver.findElement(By.name("billAddress1")).sendKeys(adress);
	}
	public void city(String cityname) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.name("billCity")).clear();
		driver.findElement(By.name("billCity")).sendKeys(cityname);
	}
	public void state(String statename) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.name("billState")).clear();
		driver.findElement(By.name("billState")).sendKeys(statename);
	}
	public void postalcode(String postalcode) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.name("billZip")).clear();
		driver.findElement(By.name("billZip")).sendKeys(postalcode);
	}
	public void country(String country) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.name("billCountry")).clear();
		driver.findElement(By.name("billCountry")).sendKeys(country);
	}
}
