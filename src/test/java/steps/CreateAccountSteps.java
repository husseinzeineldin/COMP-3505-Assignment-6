package steps;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;

public class CreateAccountSteps {

	WebDriver driver;
	
	
	@Given("^User will start up the Chrome browser$")
	public void user_will_start_up_the_Chrome_browser() throws Throwable {

		
		System.setProperty("webdriver.chrome.driver","/Users/husseinzeineldin/eclipse-workspace/JPetStoretest/chromedriver");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.navigate().refresh();
	    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	@And("^User go to the JPetStore page and entering the store then click on register now$")
	public void user_go_to_the_JPetStore_page_and_entering_the_store_then_click_on_register_now() throws Throwable {
	   
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 
		 driver.get("http://34.69.12.57:8080/jpetstore/");// going to the Store
		 driver.findElement(By.xpath("//*[@id=\"Content\"]/p[1]/a")).click(); // clicking on Enter to store bottom 
		 driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click(); // Clicking into Sign in bottom
		 driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click(); // Clicking into Register Now  bottom
		 driver.navigate().refresh();
		
	}

	@When("^User enter valid \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" ,\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_valid_and(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11, String arg12, String arg13) throws Throwable {
	    
		

		 driver.findElement(By.name("username")).sendKeys(arg1);// sending the username 
		 driver.findElement(By.name("password")).sendKeys(arg2); // sending the password
		 driver.findElement(By.name("repeatedPassword")).sendKeys(arg3); // sending the repeated password 
		 driver.findElement(By.name("account.firstName")).sendKeys(arg4);
		 driver.findElement(By.name("account.lastName")).sendKeys(arg5);
		 driver.findElement(By.name("account.email")).sendKeys(arg6);
		 driver.findElement(By.name("account.phone")).sendKeys(arg7);
		 driver.findElement(By.name("account.address1")).sendKeys(arg8);
		 driver.findElement(By.name("account.address2")).sendKeys(arg9);
		 driver.findElement(By.name("account.city")).sendKeys(arg10);
		 driver.findElement(By.name("account.state")).sendKeys(arg11);
		 driver.findElement(By.name("account.zip")).sendKeys(arg12);
		 driver.findElement(By.name("account.country")).sendKeys(arg13);		
		 driver.findElement(By.name("newAccount")).click(); // Clicking into Register Now  bottom
		
	}
		
	@And("^User will click log in to his new account$")
	public void user_will_click_log_in_to_his_new_account() throws Throwable {
	    
		
		driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click(); // Clicking into Sign in bottom
	}
	
	@When("^User enter valid \"([^\"]*)\" and valid \"([^\"]*)\" combination with new account$")
	public void user_enter_valid_and_valid_combination_with_new_account(String arg1, String arg2) throws Throwable {
	    
		
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
		 driver.findElement(By.name("username")).clear(); // clearing any character in the username field 
		 driver.findElement(By.name("username")).sendKeys(arg1);// sending the username which is quality
	
		 driver.findElement(By.name("password")).clear(); // clearing any character in the password field 
		 driver.findElement(By.name("password")).sendKeys(arg2); // sending the password which is 12345678
	
		 driver.findElement(By.name("signon")).click(); // clicking on login bottom to sign in 
	}

	@Then("^User can be able to login$")
	public void user_can_be_able_to_login() throws Throwable {
	   
		try {
			  driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);	
			
			WebElement element =  driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]"));
			      assertTrue(true);
			    			}
			catch(Exception e) {
				fail();
			}
			finally {
				driver.quit();
			}	
		
	}

	
//--------------------------------------------------------------------------------------------------------------
//testing with phone number is provided
//---------------------------------------------------------------------------------------------------------------
	
	
	@Given("^User will start  the Chrome browser$")
	public void user_will_start_the_Chrome_browser() throws Throwable {
	   

		System.setProperty("webdriver.chrome.driver","/Users/husseinzeineldin/eclipse-workspace/JPetStoretest/chromedriver");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.navigate().refresh();
	    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
	}
	
	
	@And("^User go to the main JPetStore page and entering the store then click on register now$")
	public void user_go_to_the_main_JPetStore_page_and_entering_the_store_then_click_on_register_now() throws Throwable {
	    
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 
		 driver.get("http://34.69.12.57:8080/jpetstore/");// going to the Store
		 driver.findElement(By.xpath("//*[@id=\"Content\"]/p[1]/a")).click(); // clicking on Enter to store bottom 
		 driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click(); // Clicking into Sign in bottom
		 driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click(); // Clicking into Register Now  bottom
		 driver.navigate().refresh();
		
		
	}


	@When("^User enter valid \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" ,\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" without phone$")
	public void user_enter_valid_and_without_phone(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11, String arg12) throws Throwable {
	   
		 driver.findElement(By.name("username")).sendKeys(arg1);// sending the username 
		 driver.findElement(By.name("password")).sendKeys(arg2); // sending the password
		 driver.findElement(By.name("repeatedPassword")).sendKeys(arg3); // sending the repeated password 
		 driver.findElement(By.name("account.firstName")).sendKeys(arg4);// sending firstname 
		 driver.findElement(By.name("account.lastName")).sendKeys(arg5);// sending lastname 
		 driver.findElement(By.name("account.phone")).sendKeys(arg6); // sending phone number 
		 driver.findElement(By.name("account.address1")).sendKeys(arg7); //sending address1 
		 driver.findElement(By.name("account.address2")).sendKeys(arg8);//sending address12
		 driver.findElement(By.name("account.city")).sendKeys(arg9);  //sending city 
		 driver.findElement(By.name("account.state")).sendKeys(arg10); //sending state 
		 driver.findElement(By.name("account.zip")).sendKeys(arg11); // //sending address1 
		 driver.findElement(By.name("account.country")).sendKeys(arg12);	// country	
		 driver.findElement(By.name("newAccount")).click(); // Clicking into Register Now  bottom
		
	}

	

	@Then("^User cannot be able to create an account and error message will be display$")
	public void user_cannot_be_able_to_create_an_account_and_error_message_will_be_display() throws Throwable {
	
	
		try {
			  driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);	
			
			WebElement element =  driver.findElement(By.xpath("//*[@id=\"Content\"]/ul/li")); 
			      assertTrue(true);
			    			}
			catch(Exception e) {
				fail();
			}
			finally {
				driver.quit();
			}	
		
	}
	    
//-----------------------------------------------------------------------------------------------------------
//testing with address2 
//-----------------------------------------------------------------------------------------------------------


	@Given("^User open the Chrome browser$")
	public void user_open_the_Chrome_browser() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver","/Users/husseinzeineldin/eclipse-workspace/JPetStoretest/chromedriver");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.navigate().refresh();
	    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
	
	@And("^User go to the JPetStore page then click on register now$")
	public void user_go_to_the_JPetStore_page_then_click_on_register_now() throws Throwable {
	    
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 
		 driver.get("http://34.69.12.57:8080/jpetstore/");// going to the Store
		 driver.findElement(By.xpath("//*[@id=\"Content\"]/p[1]/a")).click(); // clicking on Enter to store bottom 
		 driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click(); // Clicking into Sign in bottom
		 driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click(); // Clicking into Register Now  bottom
		 driver.navigate().refresh();
	}
	
	@When("^User enter valid \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" without address(\\d+)$")
	public void user_enter_valid_and_without_address(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11, String arg12, int arg13) throws Throwable {
	
		 driver.findElement(By.name("username")).sendKeys(arg1);// sending the username 
		 driver.findElement(By.name("password")).sendKeys(arg2); // sending the password
		 driver.findElement(By.name("repeatedPassword")).sendKeys(arg3); // sending the repeated password 
		 driver.findElement(By.name("account.firstName")).sendKeys(arg4);
		 driver.findElement(By.name("account.lastName")).sendKeys(arg5);
		 driver.findElement(By.name("account.email")).sendKeys(arg6);
		 driver.findElement(By.name("account.phone")).sendKeys(arg7);
		 driver.findElement(By.name("account.address1")).sendKeys(arg8);
		 driver.findElement(By.name("account.city")).sendKeys(arg9);
		 driver.findElement(By.name("account.state")).sendKeys(arg10);
		 driver.findElement(By.name("account.zip")).sendKeys(arg11);
		 driver.findElement(By.name("account.country")).sendKeys(arg12);		
		 driver.findElement(By.name("newAccount")).click(); // Clicking into Register Now  bottom
		
		
	}
	
	@And("^User will press log in to new account$")
	public void user_will_press_log_in_to_new_account() throws Throwable {
	    
  	driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click(); // Clicking into Sign in bottom
		
	}
	
	@When("^User enter valid \"([^\"]*)\" and valid \"([^\"]*)\"  with new account$")
	public void user_enter_valid_and_valid_with_new_account(String arg1, String arg2) throws Throwable {
	    
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		 driver.findElement(By.name("username")).clear(); // clearing any character in the username field 
		 driver.findElement(By.name("username")).sendKeys(arg1);// sending the username which is quality
	
		 driver.findElement(By.name("password")).clear(); // clearing any character in the password field 
		 driver.findElement(By.name("password")).sendKeys(arg2); // sending the password which is 12345678
	
		 driver.findElement(By.name("signon")).click(); // clicking on login bottom to sign in 
		
		
	}
	
	@Then("^User can be able to login  successful$")
	public void user_can_be_able_to_login_successful() throws Throwable {
	    
		
		try {
			  driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);	
			
			WebElement element =  driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]"));
			      assertTrue(true);
			    			}
			catch(Exception e) {
				fail();
			}
			finally {
				driver.quit();
			}	
		
		
		
	}
}
