package org.one;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossbrowserTesting {
	@Test
	
	public void facebook() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\prem\\eclipse-workspace\\TestOne\\drivers\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	@Test
	public void amazon( ) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prem\\eclipse-workspace\\TestOne\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.close();
	}
}
