package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAVEEN\\eclipse-workspace\\Selinium 1\\driver\\chromedriver.exe");
	WebDriver d = new ChromeDriver();	
		
		d.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjQ2MTAyMzM4LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
		
	d.manage().window().maximize();
	
	WebElement txtuser = d.findElement(By.id("email"));
	txtuser.sendKeys("praveen");
	
	WebElement txtpwd = d.findElement(By.id("pass"));
	txtpwd.sendKeys("chan");
	WebElement txtlgn = d.findElement(By.name("login"));
	txtlgn.click();
	
	}
	
	
	
	

}
