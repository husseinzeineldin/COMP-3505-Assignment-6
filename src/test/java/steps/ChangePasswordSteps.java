package steps;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;

public class ChangePasswordSteps {
	WebDriver driver;
	

	@Given("^User will open Chrome browser$")
	public void user_will_open_Chrome_browser() throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver","/Users/husseinzeineldin/eclipse-workspace/JPetStoretest/chromedriver");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.navigate().refresh();
	    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
	
	
	@And("^User go to JPetStore page$")
	public void user_go_to_JPetStore_page() throws Throwable {
	    
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 
		 driver.get("http://34.69.12.57:8080/jpetstore/");// going to the Store
		 driver.findElement(By.xpath("//*[@id=\"Content\"]/p[1]/a")).click(); // clicking on Enter to store bottom 
		 driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click(); // Clicking into Sign in bottom
		 driver.navigate().refresh();
		
		
	}
	
	
	
	@When("^User enter valid \"([^\"]*)\" and valid \"([^\"]*)\" combination$")
	public void user_enter_valid_and_valid_combination(String arg1, String arg2) throws Throwable {
	   
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		 driver.findElement(By.name("username")).clear(); // clearing any character in the username field 
		 driver.findElement(By.name("username")).sendKeys(arg1);// sending the username which is quality
	
		 driver.findElement(By.name("password")).clear(); // clearing any character in the password field 
		 driver.findElement(By.name("password")).sendKeys(arg2); // sending the password which is 12345678
	
		 driver.findElement(By.name("signon")).click(); // clicking on login bottom to sign in 
		
		
	}

	
	
	@And("^User go to My Account After login$")
	public void user_go_to_My_Account_After_login() throws Throwable {
	   
		
		driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[3]")).click();
		
	}
	
	
	
	@When("^User enter valid new password \"([^\"]*)\" and re-type password \"([^\"]*)\"$")
	public void user_enter_valid_new_password_and_re_type_password(String arg1, String arg2) throws Throwable {
 
		 driver.findElement(By.name("password")).sendKeys(arg1);// sending the username which is quality1
		 driver.findElement(By.name("repeatedPassword")).sendKeys(arg2); // sending the password which is 123456789
		 driver.findElement(By.name("editAccount")).click();
		
	}
	
	
	@And("^User log out from their account$")
	public void user_log_out_from_their_account() throws Throwable {
	   
	driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();  //clicking on the sign out buttom
	driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();  //clicking on the sign out buttom
		 
	}
	
	
	@When("^User enter valid \"([^\"]*)\" and valid \"([^\"]*)\" combination with new password change$")
	public void user_enter_valid_and_valid_combination_with_new_password_change(String arg1, String arg2) throws Throwable {
		
		 driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click(); // Clicking into Sign in bottom
		
		 driver.findElement(By.name("username")).clear(); // clearing any character in the username field 
		 driver.findElement(By.name("username")).sendKeys(arg1);// sending the username which is quality1
	
		 driver.findElement(By.name("password")).clear(); // clearing any character in the password field 
		 driver.findElement(By.name("password")).sendKeys(arg2); // sending the password which is 1234

		 driver.findElement(By.name("signon")).click(); // clicking on login bottom to sign in

	}
	
	
	
	@Then("^User can be able to login with new password$")
	public void user_can_be_able_to_login_with_new_password() throws Throwable {
	    
		try {
			  driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);	
			
			WebElement element =  driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")); // My Account tab
			      assertTrue(true);
			    			}
			catch(Exception e) {
				fail();
			}
			finally {
				driver.quit();
			}	
		
		
	}

//---------------------------------------------------------------------------------------------------
//Enter valid password but entering invalid password 
//---------------------------------------------------------------------------------------------------
	
	
	@Given("^User open Chrome Browser\\.$")
	public void user_open_Chrome_Browser() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver","/Users/husseinzeineldin/eclipse-workspace/JPetStoretest/chromedriver");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.navigate().refresh();
	    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
	}
	
	@And("^User will go to JPetStore page$")
	public void user_will_go_to_JPetStore_page() throws Throwable {
	   
		 driver.get("http://34.69.12.57:8080/jpetstore/");// going to the Store
		 driver.findElement(By.xpath("//*[@id=\"Content\"]/p[1]/a")).click(); // clicking on Enter to store bottom 
		 driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click(); // Clicking into Sign in bottom
		 driver.navigate().refresh();
	}
	
	
	@When("^User enter valid \"([^\"]*)\" and valid \"([^\"]*)\" combination to log im$")
	public void user_enter_valid_and_valid_combination_to_log_im(String arg1, String arg2) throws Throwable {
	   
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
		 driver.findElement(By.name("username")).clear(); // clearing any character in the username field 
		 driver.findElement(By.name("username")).sendKeys(arg1);// sending the username which is quality
	
		 driver.findElement(By.name("password")).clear(); // clearing any character in the password field 
		 driver.findElement(By.name("password")).sendKeys(arg2); // sending the password which is 12345678
	
		 driver.findElement(By.name("signon")).click(); // clicking on login bottom to sign in 
		
		
	}

	
	@And("^User go to My Account information$")
	public void user_go_to_My_Account_information() throws Throwable {
	   
		
		driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[3]")).click();
		
	}
	
	@When("^User enter valid new password \"([^\"]*)\" but re-type invalid password \"([^\"]*)\"$")
	public void user_enter_valid_new_password_but_re_type_invalid_password(String arg1, String arg2) throws Throwable {
	   
		
		 driver.findElement(By.name("password")).sendKeys(arg1);// sending the username which is quality1
		 driver.findElement(By.name("repeatedPassword")).sendKeys(arg2); // sending the password which is 123456789
		 driver.findElement(By.name("editAccount")).click();
	}
	
	@Then("^User will have an error message$")
	public void user_will_have_an_error_message() throws Throwable {
	    
		try {
			  driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);	
			
			WebElement element =  driver.findElement(By.xpath("//*[@id=\"Content\"]/ul/li")); // My Account tab
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
