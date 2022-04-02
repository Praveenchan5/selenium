package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRAVEEN\\eclipse-workspace\\Selinium 1\\driver\\chromedriver.exe" );
		
WebDriver driver = new ChromeDriver();
driver.get("https://www.airindia.in//");

driver.manage().window().maximize();

//WebElement btncreate = driver.findElement(By.xpath("//a[@role='button'])[2]"));
		//btncreate.click();
		
		//WebElement txtfirst = driver.findElement(By.id("u_i_b_5P"));
//txtfirst.sendKeys("praveen");

//WebElement txtsecond = driver.findElement(By.id("u_i_d_kM"));
//txtsecond.sendKeys("chan");
	


	}

}
