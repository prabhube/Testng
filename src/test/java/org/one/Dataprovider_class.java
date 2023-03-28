package org.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_class {

	String[][] data= {
			{ "prabhu","prem1817"},
			{"prem","pervesh"},
			{"rajaraman","kasthuri"},
	
	};
	@DataProvider(name="login")
	public String[][] TestDataProvider() {
		return data;
	}
	@Test(dataProvider="login")
	public void facebook(String username, String password) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prem\\eclipse-workspace\\TestOne\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(username);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(password);
		WebElement log= driver.findElement(By.name("login"));
		log.click();
		
	}
}
