package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page.Loginpage;
import io.github.bonigarcia.wdm.WebDriverManager;

//public class Baseclass {
//	public  WebDriver driver;
//	
//	//public  Loginpage loginpg;
//	
//	
//	
//		// TODO Auto-generated constructor stub
//	
//
//	public Baseclass(WebDriver driver) 
//	
//	{
//		this.driver=driver;
//	}
//	
//
//
//	
//	
//
//}


public class Baseclass  {

	



	public WebDriver launchBrowser() throws Exception  {



		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

	
		driver.manage().window().maximize();

		return driver;

		

	}

}
