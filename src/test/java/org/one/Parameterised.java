package org.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameterised {
	@Test
	@Parameters({"username","password"})
private void facebook(@Optional String a,@Optional String b) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prem\\eclipse-workspace\\TestOne\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(a);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(b);
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	
	}
}
