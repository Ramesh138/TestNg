package com.sundayspecial.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.sundayspecial.basedriver.Basedriver;

public class Loginclass extends Basedriver {

	public void username(String username) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.name("userName")).sendKeys(username);
	}

	public void password(String password) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	public void clicklogin() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();
	}

	public void windowsize() throws InterruptedException {
		Thread.sleep(1000);
	}

}
