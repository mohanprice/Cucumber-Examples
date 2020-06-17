package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HrmLogin {
         WebDriver driver;
         WebElement elem;
	
		@Given("User enters into the login page")
		public void user_enters_into_the_login_page() {
		    
		    System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.get("https://opensource-demo.orangehrmlive.com/");
			 driver.manage().window().maximize();
		}
        @When("User gives the valid Credentails")
		public void user_gives_the_valid_Credentails() {
        	elem = driver.findElement(By.id("txtUsername"));
        	elem.click();
        	elem.sendKeys("Admin");
            elem = driver.findElement(By.id("txtPassword"));
            elem.click();
            elem.sendKeys("admin123");
		   }
		@And("User Clicks the login buton")
		public void user_Clicks_the_login_buton() {
		   elem = driver.findElement(By.id("btnLogin"));
		   elem.click();
		}
		@Then("HRM Welcome Page Should be Displayed")
		public void hrm_Welcome_Page_Should_be_Displayed() {
		    System.out.println("HRM Login Page Sucessfully Opened...!!!");
		    driver.quit();
		}
}
