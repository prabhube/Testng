package org.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParalelwithPara {
	@Test
	@Parameters({"username1","password1"})
	public void chrome(@Optional("a") String username1,@Optional("b") String password1) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prem\\eclipse-workspace\\TestOne\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(username1);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(password1);
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		driver.close();
	}
	@Test
	@Parameters({"username","password"})
	public void firefox(@Optional("c") String username,@Optional("d") String password) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prem\\eclipse-workspace\\TestOne\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(username);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(password);
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	}
}
