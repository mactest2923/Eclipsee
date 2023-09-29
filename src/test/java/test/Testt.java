package test;


import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


import Eutill.Datafromxcel;
import base.Basemain;
import page.Cart;
import page.Checkkouttt;
import page.Loggout;
import page.Login;
import page.Removeandscroll;




public class Testt extends Basemain{
	@Test
	public void test1()throws Exception
	{
		Login lo=new Login(driver);
	
		String x1="D:\\\\Mini.xlsx";
		String Sheet="Sheet1";
		//LOGIN PAGE
		int rowcount=Datafromxcel.getRowCount(x1, Sheet);
		for(int i=1;i<=rowcount;i++)
		{
			String username=Datafromxcel.getCellValue(x1, Sheet, i, 0);
			System.out.println("Usernmae :_"+username);
			String pass=Datafromxcel.getCellValue(x1, Sheet, i, 1);
			System.out.println("password :-"+pass);
			
			lo.sendvalue(username, pass);
			lo.log();
			String actualurl=driver.getCurrentUrl();//validation
			System.out.println(actualurl);                                 ///noneed only for verififcation
			String expurl="https://www.saucedemo.com/v1/inventory.html";
			if(expurl.equals(actualurl))
			{
				System.out.println("login sucess");
				break;
			}
			else
			{
				
				System.out.println("login not sucess");

		}
			}
	//ADD CARt PRoGRAM
	Cart c=new Cart(driver);
	List<WebElement>li=driver.findElements(By.xpath("//*[contains(text(),'ADD TO CART')]"));
	System.out.println("no of list    :-"+li.size());	
	for(int i=1;i<=li.size();i++)
	{
		c.buttonclick();
	}
	//---view cart----
	c.viewcart();
	
	//---clicka and remove iteam and scroll dowm
	
	Removeandscroll re=new Removeandscroll(driver);	

re.clickremove()	;
re.clickremove2();


			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,9000)","");
	      
			Thread.sleep(5000);
	
			re.conn();
			re.adp();
			   re.cartvieww();
			JavascriptExecutor js1=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,9000)","");
	
	////////CHEKKOUTTT
			Checkkouttt chh=new Checkkouttt(driver);
			chh.clickchkbutn();
			chh.filldata("mac","tawish","788347");
					chh.cont();
					JavascriptExecutor js2=(JavascriptExecutor)driver;
					js.executeScript("window.scrollBy(0,9000)","");
					
					
					
					
					
 		WebElement ele = chh.finishh();
					Actions action = new Actions(driver);
					
					
					Thread.sleep(5000);
					action.moveToElement(ele);
				
				////////LOGOUT with verify the title and exit the project
					
					
					
					
					String ActualTitle=driver.getTitle();
					System.out.println(" TITLE IS:-"+ActualTitle);
					String ExpectedTitle ="Swag Labs";		
	Assert.assertEquals(ExpectedTitle, ActualTitle);
	
	Loggout lgtt=new Loggout(driver);
                            	lgtt.hbbtn();
            					lgtt.loggt();
            					
			driver.quit();	
	}

	
	}

