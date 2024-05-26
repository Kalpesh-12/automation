package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import stepDefinition.Baseclass;



public class Adduserpagex  {
	
    WebDriver driver;
	

	public Adduserpagex (WebDriver d)
	{
		
		this.driver=d;
	}
	
	

	
	public void clickagreement()
	{
		
		


	    driver.findElement(By.xpath("//*[@title=\"1Agreements\"]")).click();

	}

	
	public void clickadduser()
	{
		driver.findElement(By.xpath("//*[@title='Manage Users']")).click();

	}
	
}
