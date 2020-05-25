package com.sundayspecial.pages;

import org.openqa.selenium.By;

import com.sundayspecial.basedriver.Basedriver;

public class Deliveryclass extends Basedriver {

	public void deliveryadr(String adress) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.name("delAddress1")).clear();
		driver.findElement(By.name("delAddress1")).sendKeys(adress);
		
	}
	public void deliverycity(String city) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.name("delCity")).sendKeys(city);
		System.out.println("print city name");
	}
	public void deliverystate(String state) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.name("delCity")).sendKeys(state);
		System.out.println("print state name");
	}
	public void deliverypostalcode(String postalcode) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.name("delZip")).clear();
		driver.findElement(By.name("delZip")).sendKeys(postalcode);
	}
	public void deiverycountry(String country) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.name("delCountry")).clear();
		driver.findElement(By.name("delCountry")).sendKeys(country);
		
	}
	public void clicksecurepurchase(String purchase) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.name("buyFlights")).click();
	}
	public void clicklogout() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("mercurysignoff.php")).click();
	}
}
