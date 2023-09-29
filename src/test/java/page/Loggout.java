package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loggout {
	WebDriver driver;
	By hambutn=By.xpath("//*[contains(text(),'Open Menu')]");
	By logbtn=By.id("logout_sidebar_link");

	public  Loggout(WebDriver driver)
	{
		this.driver=driver;
	}

	public void hbbtn() {
		driver.findElement(hambutn).click();
	}
	
	public void loggt() {
		driver.findElement(logbtn).click();
	}
	
}
