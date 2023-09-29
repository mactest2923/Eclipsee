package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Removeandscroll {
	WebDriver driver;
	By remov=By.xpath("//*[contains(text(),'REMOVE')]");
	By remov2=By.xpath("//*[contains(text(),'REMOVE')]");
	By con=By.xpath("//*[contains(text(),'Continue Shopping')]");
	By add1=By.xpath("//*[contains(text(),'ADD TO CART')]");
	By cartv=By.id("shopping_cart_container");

	public  Removeandscroll(WebDriver driver)
	{
		this.driver=driver;
	}

	
	public void clickremove()
	{
	driver.findElement(remov).click();

	}
	public void clickremove2()
	{
	driver.findElement(remov2).click();
	}
	
	public void conn()
	{
	driver.findElement(con).click();
	}
	
	public void adp()
	{
	driver.findElement(add1).click();
	}
	
	
	public void cartvieww()
	{
	driver.findElement(cartv).click();
	}
	
	
	
	
}
