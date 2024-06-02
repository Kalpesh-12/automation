package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import Page.Loginpage;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import runner.run;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;

public class LoginSteps  {
	
WebDriver driver;
private TestContext context;

String browser ;
public LoginSteps(TestContext context )

{
this.context=context;
System.out.println( "loginpg object"+this.context );

}



@Given("admin launch broweser")
public void admin_launch_broweser() throws Exception {

//     browser = run.BROWSER.get();
//     
//     
//    if(browser.equalsIgnoreCase("CHROME"))
//    {
//
//  WebDriverManager.chromedriver().setup();//webmncs
//  driver = new ChromeDriver();//chrome
//  driver.manage().window().maximize();
//
//    }
//  
//    if(browser.equalsIgnoreCase("FF"))
//    {
//
//    	WebDriverManager.firefoxdriver().setup();
//        driver = new FirefoxDriver();
//  driver.manage().window().maximize();
//
//    }
  
  
  
  WebDriverManager.chromedriver().setup();
   ChromeOptions option = new ChromeOptions();
    driver = new ChromeDriver(option);
    driver.manage().window().maximize();
    System.out.println( "laucnh succsefully" );

  //  option.setPageLoadStrategy(PageLoadStrategy.EAGER);


 //  option.addArguments("--headless");
  //  option.addArguments("--no-sandbox");
  //  option.addArguments("--disable-dev-shm-usage");
   // option.setPageLoadStrategy(PageLoadStrategy.NORMAL);
    

	//ChromeOptions chromeOptions = new ChromeOptions();  
	//chromeOptions.addArguments("--headless");  

  //chrome_options.add_argument('--no-sandbox')
 // chrome_options.add_argument('--disable-dev-shm-usage')

    

}

@When("admin hit url  {string}")
public void admin_hit_url(String urlF) throws Exception {
 
	driver.get(urlF);
	context.setDriver(driver);


}

@When("admin enter {string} and {string}")
public void admin_enter_and(String user, String pass) throws InterruptedException {
	context.InitializePageObject(driver);
  
	context.loginObj.userlogin(user, pass);//comtfrom step, login ob from logoin page


    
}


@Then("home page is displayed")
public void admin_loginsuccessfully() throws InterruptedException
{
	context.loginObj.loginsuccessfully();

}


@Then("error message is displayed")
public void error_message_is_displayed() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	context.loginObj.loginerrormessage();
}




}
