package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Basemain {
public WebDriver driver;               // webdriver isa interface
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();  //casting into chromedriver which webdriverused to open chrome
	}
	@BeforeMethod
	public void url()                          //where url set here
	{
		//driver.get("https://www.google.com/https://www.saucedemo.com/v1/index.html/");
		driver.get("https://www.saucedemo.com/v1/index.html");
	}
}


