package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkkouttt {
WebDriver driver;
By checkk=By.xpath("//*[contains(text(),'CHECKOUT')]");  

By fname=By.id("first-name");
By lname=By.id("last-name");
By pincd=By.id("postal-code");
By con=By.xpath("//*[contains(@type,'submit')]");
By fi=By.xpath("//*[contains(text(),'FINISH')]");
public  Checkkouttt(WebDriver driver)
{
	this.driver=driver;
}

public void filldata(String name,String lame,String co)
{
	driver.findElement(fname).sendKeys(name);
	driver.findElement(lname).sendKeys(lame);
	driver.findElement(pincd).sendKeys(co);
}




public void clickchkbutn()
{
	driver.findElement(checkk).click();
}

public void cont()
{
	driver.findElement(con).click();
}
    public WebElement finishh()
{
	return driver.findElement(fi);
}







}
