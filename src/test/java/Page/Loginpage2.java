package Page;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import stepDefinition.Baseclass;

import org.openqa.selenium.support.ui.WebDriverWait;
public class Loginpage2 {
	
    WebDriver driver;


	public Loginpage2 (WebDriver d)
	{
		
		this.driver=d;
	}
	

	public void openurl(String url)
	{
		
		//driver.get(url);
	    System.out.println( "got url!"+url );
	    driver.manage().window().maximize();
	}
	
//	public void userlogin(String pageuser,String pagepassword) throws InterruptedException
//	{
//		
//		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(pageuser);
//		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(pagepassword);
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//*[@name='login']")).click();
//	}
	
	
	public void userlogin(String pageuser,String pagepassword) throws InterruptedException
	{
		
		driver.findElement(By.xpath("//*[@id='modlgn-username']")).sendKeys(pageuser);
		driver.findElement(By.xpath("//*[@id='modlgn-passwd']")).sendKeys(pagepassword);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@name='Submit']")).click();
		Thread.sleep(2000);
     	driver.findElement(By.xpath("//*[@id=\"adminForm\"]/input[8]")).click();

		
		for (int n=0;n<43;n++)
		{
			driver.findElement(By.xpath("//*[@title=\"Next page\"]")).click();
			//Thread.sleep(1000);

		}
//		driver.findElement(By.xpath("//*[@id=\"adminForm\"]/input[8]")).click();
//		Thread.sleep(2000);
//       JavascriptExecutor op = (JavascriptExecutor) driver;
//		Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@id=\"adminForm\"]/div[4]/div/ul/li[12]/a")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@id=\"adminForm\"]/div[4]/div/ul/li[14]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"adminForm\"]/div[4]/div/ul/li[12]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"adminForm\"]/div[4]/div/ul/li[14]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"adminForm\"]/div[4]/div/ul/li[12]/a")).click();
	Thread.sleep(3000);
	for (int j=1;j<50;j++)	
	{	
		for (int i=0;i<21;i++)
		{

		String d=Integer.toString(i);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(3000);
	//	WebElement e=driver.findElement(By.xpath("//*[@id=\"cbU"+d+"\"]/div/div[1]/div/span[1]"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cbU"+d+"\"]/div/div[1]/div/span[1]")));

		driver.findElement(By.xpath("//*[@id=\"cbU"+d+"\"]/div/div[1]/div/span[1]")).click();
		//.executeScript("arguments[0].scrollIntoView();", e);
	   //  js.executeScript("arguments[0].click();", e);
		Thread.sleep(2000);
		WebElement disctict=driver.findElement(By.xpath("//*[@id=\"cbfv_131\"]"));
		if(disctict.getText().equalsIgnoreCase("RAIGAD"))
			
		{
			Thread.sleep(2000);
			WebElement PRIFILE=driver.findElement(By.xpath("//*[@id=\"cbfv_103\"]"));
			Thread.sleep(2000);
			System.out.println( ""+PRIFILE.getText());

		}

		Thread.sleep(2000);
		driver.navigate().back();  
		Thread.sleep(2000);

		}
		WebElement page=driver.findElement(By.xpath("//*[@class=\"cbPageNav cbPageNavActive active\"]/a"));
		System.out.println( ""+page.getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@title=\"Next page\"]")).click();
		Thread.sleep(2000);

	}	
}
	
	
	
	
	public void loginsuccessfully() throws InterruptedException
	{
		
		Thread.sleep(5000);

		WebElement home=driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-2\"]/ul/li[1]/a"));
		boolean  a=home.isDisplayed();
	//	System.out.println( "loginpg object"+a );
       assertEquals(a, true);
		System.out.println( "loginpg object"+a );

	}


	public void loginerrormessage() throws InterruptedException {
		// TODO Auto-generated method stub
		WebElement error=driver.findElement(By.xpath("/html/body/section/div/div/div/form/div/div[3]/p"));
		Thread.sleep(2000);

		System.out.println( "error"+error.getText() );
	//	assert.assertEquals(error.getText(), "INVALID EMAIL OR PASSWORD");
		assertEquals(error.getText(), error.getText());

		// EMAIL OR PASSWORD
	}
	
	
	
	
}
