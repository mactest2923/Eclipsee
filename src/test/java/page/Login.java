package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
	By hname =By.id("user-name");
	By hpass=By.id("password");
	By hbutton=By.id("login-button");                                         //xpath("//*[contains(text(),'Submit')]");
	public  Login(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void sendvalue(String username,String password)
	{
		driver.findElement(hname).clear();
		driver.findElement(hname).sendKeys(username);
		driver.findElement(hpass).clear();
		driver.findElement(hpass).sendKeys(password);	
	}
	
	public void log()
	{
		driver.findElement(hbutton).click();
	}
}
