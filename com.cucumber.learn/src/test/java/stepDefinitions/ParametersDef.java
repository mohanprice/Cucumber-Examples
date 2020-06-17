package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParametersDef {
	
	 WebDriver driver;
     WebElement elem;

	

		@Given("User Enters into the login page of HRM")
		public void user_Enters_into_the_login_page_of_HRM()throws Throwable {
			 System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.get("https://opensource-demo.orangehrmlive.com/");
			 driver.manage().window().maximize(); 
		    
		}


        @When("User gives username as {string} and password as {string}")
		public void user_gives_username_as_and_password_as(String user, String pass)throws Throwable  {
        	elem = driver.findElement(By.id("txtUsername"));
        	elem.click();
        	elem.sendKeys(user);
            elem = driver.findElement(By.id("txtPassword"));
            elem.click();
            elem.sendKeys(pass);
		}
		@When("User press the Login button")
		public void user_press_the_Login_button()throws Throwable  {
			elem = driver.findElement(By.id("btnLogin"));
			   elem.click();
		}
		@Then("HRM Welcome Page Should be Displayed at last")
		public void hrm_Welcome_Page_Should_be_Displayed_at_last()throws Throwable  {
		    System.out.println("Sucessfully Entered...!!!!");
		}




		




}
