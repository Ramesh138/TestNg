package com.sundayspecial.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.sundayspecial.basedriver.Basedriver;

public class Cardtype extends Basedriver {

	public void cardtype(String cardtype) throws InterruptedException {
		Thread.sleep(1000);		
		WebElement ele=driver.findElement(By.name("creditCard"));
		Select arriveto = new Select(ele);
		arriveto.selectByVisibleText(cardtype);
		System.out.println("select card type");
	}
	public void cardnumber(String cardno) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.name("creditnumber")).sendKeys(cardno);
		System.out.println("print card no");
	}
	public void expirydate(String date) throws InterruptedException {
		Thread.sleep(1000);
		WebElement ele=driver.findElement(By.name("cc_exp_dt_mn"));
		Select value=new Select(ele);
		value.selectByVisibleText(date);
		System.out.println("print expiry date");
	}
	public void firstname(String name) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.name("cc_frst_name")).sendKeys(name);
		System.out.println("print name");		
	}
	public void lastname(String lastname) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.name("cc_last_name")).sendKeys(lastname);
		System.out.println("print lastname");
	}
	
	
	
	
	
		
	}
	
	


