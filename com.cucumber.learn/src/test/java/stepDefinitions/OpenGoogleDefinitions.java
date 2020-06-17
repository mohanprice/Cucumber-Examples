package stepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenGoogleDefinitions {
	
	     WebDriver driver;
	     WebElement elem;
		@Given("user is entering google.co.in")
		public void user_is_entering_google_co_in()throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		   
		   
		 System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.google.com");
		  }

        @When("user is typing he search term {string}")
		public void user_is_typing_he_search_term(String string)throws Throwable {
		   
		   elem = driver.findElement(By.xpath("//input[@name='q']"));
		   elem.click();
		   elem.sendKeys("Selenium");
		   
		}
		@When("enters the return key")
		public void enters_the_return_key()throws Throwable {
		  
		   elem.sendKeys(Keys.ENTER);
		}
		@Then("the user should see the search results")
		public void the_user_should_see_the_search_results()throws Throwable {
		    System.out.println("Results Showed Sucessfully...!!!");
		    
		} 





}
