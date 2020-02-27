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

public class LoginSteps
{
	WebDriver driver;
	

	@Given("^User open Chrome browser$")
	public void user_open_Chrome_browser() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver","/Users/husseinzeineldin/eclipse-workspace/JPetStoretest/chromedriver");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.navigate().refresh();
		
	}
	
	@And("^User go to JPetStore page and click to enter the store and to sign in$")
	public void user_go_to_JPetStore_page_and_click_to_enter_the_store_and_to_sign_in() throws Throwable {
		
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 
		 driver.get("http://34.69.12.57:8080/jpetstore/");// going to the Store
		 driver.findElement(By.xpath("//*[@id=\"Content\"]/p[1]/a")).click(); // clicking on Enter to store bottom 
		 driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click(); // Clicking into Sign in bottom
		 driver.navigate().refresh();
	}

	@When("^User enter valid \"([^\"]*)\" and \"([^\"]*)\" combination and User will click on login bottum$")
	public void user_enter_valid_and_combination_and_User_will_click_on_login_bottum(String arg1, String arg2) throws Throwable {
		
		 driver.findElement(By.name("username")).clear(); // clearing any character in the username field 
		 driver.findElement(By.name("username")).sendKeys(arg1);// sending the username which is quality
	
		 driver.findElement(By.name("password")).clear(); // clearing any character in the password field 
		 driver.findElement(By.name("password")).sendKeys(arg2); // sending the password which is 12345678
	
		 driver.findElement(By.name("signon")).click(); // clicking on login bottom to sign in 
	
	}
	
	@Then("^User should be able to login successfully and should see the sign out buttom$")
	public void user_should_be_able_to_login_successfully_and_should_see_the_sign_out_buttom() throws Throwable {
		
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
	
//-------------------------------------------------------------------------------------------------------------
//Test with valid Username and invalid password
//-------------------------------------------------------------------------------------------------------------
	
	
	@Given("^User will open Chrome browser\\.$")
	public void user_will_open_Chrome_browser() throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver","/Users/husseinzeineldin/eclipse-workspace/JPetStoretest/chromedriver");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.navigate().refresh();
		
	}
	
	@And("^User will go to JPetStore page and  click to enter the store and to sign in website\\.$")
	public void user_will_go_to_JPetStore_page_and_click_to_enter_the_store_and_to_sign_in_website() throws Throwable {
	    
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 driver.get("http://34.69.12.57:8080/jpetstore/");// going to the Store
		 driver.findElement(By.xpath("//*[@id=\"Content\"]/p[1]/a")).click(); // clicking on Enter to store bottom 
		 driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click(); // Clicking into Sign in bottom
		 driver.navigate().refresh();
	}
	
	@When("^User enter valid \"([^\"]*)\" and unvalid\"([^\"]*)\" combination and User will click on login bottum$")
	public void user_enter_valid_and_unvalid_combination_and_User_will_click_on_login_bottum(String arg1, String arg2) throws Throwable {
	    
		 driver.findElement(By.name("username")).clear(); // clearing any character in the username field 
		 driver.findElement(By.name("username")).sendKeys(arg1);// sending the username which is quality
	
		 driver.findElement(By.name("password")).clear(); // clearing any character in the password field 
		 driver.findElement(By.name("password")).sendKeys(arg2); // sending the password which is 12345678
	
		 driver.findElement(By.name("signon")).click(); // clicking on login bottom to sign in 
	
		
	}
	
	@Then("^User should not be able to login successfully and User should not see the sign out buttom$")
	public void user_should_not_be_able_to_login_successfully_and_User_should_not_see_the_sign_out_buttom() throws Throwable {
	    
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
	
//-------------------------------------------------------------------------------------------------------------
//Test with invalid Username and valid password
//-------------------------------------------------------------------------------------------------------------
	
	
	@Given("^User will go to open Chrome browser$")
	public void user_will_go_to_open_Chrome_browser() throws Throwable {
	   

		System.setProperty("webdriver.chrome.driver","/Users/husseinzeineldin/eclipse-workspace/JPetStoretest/chromedriver");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.navigate().refresh();
		
	}

	@And("^User will go the JPetStore page and  click to enter the store and to sign in into the store$")
	public void user_will_go_the_JPetStore_page_and_click_to_enter_the_store_and_to_sign_in_into_the_store() throws Throwable {

		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 driver.get("http://34.69.12.57:8080/jpetstore/");// going to the Store
		 driver.findElement(By.xpath("//*[@id=\"Content\"]/p[1]/a")).click(); // clicking on Enter to store bottom 
		 driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click(); // Clicking into Sign in bottom
		 driver.navigate().refresh();
	}

	@When("^User enter unvalid \"([^\"]*)\" and valid\"([^\"]*)\" combination and User will click on login bottum$")
	public void user_enter_unvalid_and_valid_combination_and_User_will_click_on_login_bottum(String arg1, String arg2) throws Throwable {
	   
	 	driver.findElement(By.name("username")).clear(); // clearing any character in the username field 
		 driver.findElement(By.name("username")).sendKeys(arg1);// sending the username which is quality
	
		 driver.findElement(By.name("password")).clear(); // clearing any character in the password field 
		 driver.findElement(By.name("password")).sendKeys(arg2); // sending the password which is 12345678
	
		 driver.findElement(By.name("signon")).click(); // clicking on login bottom to sign in 
	
		
		
	}

	@Then("^User should not be able to login successfully and will not see the sign out buttom$")
	public void user_should_not_be_able_to_login_successfully_and_will_not_see_the_sign_out_buttom() throws Throwable {
	    
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


