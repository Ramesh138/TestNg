package com.sundayspecial.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.sundayspecial.basedriver.Basedriver;

public class Flightdetails extends Basedriver {

	public void departfrom(String location) throws InterruptedException {
		Thread.sleep(1000);
		WebElement ele=driver.findElement(By.name("fromPort"));
		Select departfrom = new Select(ele);
		departfrom.selectByVisibleText(location);
		System.out.println("print no.of passengers");
		
	}
	public void arriveto(String location) throws InterruptedException {
		Thread.sleep(1000);
		WebElement ele=driver.findElement(By.name("toPort"));
		Select arriveto = new Select(ele);
		arriveto.selectByVisibleText(location);
		System.out.println("print no.of passengers");
		
		
	}
	public void fromdate(String date) throws InterruptedException {
		Thread.sleep(1000);
		WebElement ele=driver.findElement(By.name("fromMonth"));
		Select fromdate = new Select(ele);
		fromdate.selectByVisibleText(date);
		System.out.println("from date");
		
	}
	public void todate(String date) throws InterruptedException {
		Thread.sleep(1000);
		WebElement ele=driver.findElement(By.name("toMonth"));
		Select todate = new Select(ele);
		todate.selectByVisibleText(date);
		System.out.println("to date");
		
	}
	public void clickcontinue() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.name("findFlights")).click();
		System.out.println("click on flights");
	}
}
