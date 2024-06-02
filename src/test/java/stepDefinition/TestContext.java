package stepDefinition;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Page.Adduserpagex;
import Page.Loginpage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;




public class TestContext {


  	protected  WebDriver driver;
	 Adduserpagex Adduserobj;
  	 Loginpage loginObj
  	 
  	 ;



	public WebDriver getDriver() {

		return driver;

	}

	

	public void setDriver(WebDriver driver) {
        this.driver=driver;

//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://connectcare-test.steris.com/admin");
	}

		
//
//	 public Adduserpage getHomeObj() {
//
//			return Adduserobj;
//
//		}

	

	public Adduserpagex Adduserpage()
	{

		return Adduserobj;

	}

	public Loginpage Loginpage()
	{

		return loginObj;

	}

	



	public void InitializePageObject(WebDriver driver)
	{

			

		Adduserobj = new Adduserpagex(driver);

		loginObj = new Loginpage(driver);
			

	}
	
	
	@After(order = 1)
	public void takeScraenshotOnFailure(Scenario scenario) throws IOException {
	//	C:\Users\HP\eclipse-workspace\Acucu\src\main\java\extent.properties
		FileReader reader=new FileReader("C:\\Users\\HP\\eclipse-workspace\\Acucu\\src\\main\\java\\extent.properties"); 
        Properties props=new Properties(); 
        props.load(reader); 
    	String dir = props.getProperty("screenshot.dir");
	    System.out.println( "dir!"+dir );
//		String path = props.getProperty("rel.path");
//	    System.out.println( "path!"+path );
//	    System.out.println( "after!" );


		if (scenario.isFailed()) {

		TakesScreenshot ts = (TakesScreenshot)driver;

		byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(src, "image/png", "test1");
		}

		}
	

	
//	@After(order = 0)
//	public void close() {
//
//		driver.quit();
//		}
//
//		
	
}


