package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart {
	WebDriver driver;
	By cartt=By.id("shopping_cart_container");
	By addb=By.xpath("//*[contains(text(),'ADD TO CART')]");

	
	public  Cart(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public void buttonclick()
	{
		driver.findElement(addb).click();
	}
	public void viewcart()
	{
		driver.findElement(cartt).click();
	}
}
