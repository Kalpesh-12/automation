package stepDefinition;

import org.openqa.selenium.WebDriver;

import Page.Adduserpagex;
import Page.Loginpage;
import io.cucumber.java.en.When;
public class adduserstpe {
	
	
	
	
//WebDriver driver;
//Loginpage loginpg;
//Adduserpagex Adduserpg;
private TestContext context;

	public adduserstpe(TestContext context )
	{
	
		this.context=context;
	
	}


	@When("admin click on the add agreement")
	public void admin_click_on_the_add_agreement() throws InterruptedException {
		//context.InitializePageObject(driver);
		
	
        Thread.sleep(3000);


	    context.Adduserobj.clickagreement();	    // Write code here that turns the phrase above into concrete actions
	}
	@When("admin click on the add user")
	public void admin_click_on_the_add_user() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
        Thread.sleep(3000);
    	context.Adduserobj.clickadduser();
	
	}
	
		
	
}
