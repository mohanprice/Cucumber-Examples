package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SendDataviaTableDef {
	 WebDriver driver;
     WebElement elem;

	

		@Given("User should enter Login page")
		public void user_should_enter_Login_page() throws Throwable 
		{
			 System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.get("https://opensource-demo.orangehrmlive.com/");
			 driver.manage().window().maximize(); 
		 
		}

        @When("User gives valid Crediatials like")
		public void user_gives_valid_Crediatials_like(DataTable dataTable)throws Throwable 
        {
		   List <String> ref = dataTable.asList(String.class);
		      String user = ref.get(0);
		      String pass  = ref.get(1);
		      
		       elem = driver.findElement(By.id("txtUsername"));
	        	elem.click();
	        	elem.sendKeys(user);
	            elem = driver.findElement(By.id("txtPassword"));
	            elem.click();
	            elem.sendKeys(pass);
		}
		@When("user gives a press to login button")
		public void user_gives_a_press_to_login_button()throws Throwable 
		{
			elem = driver.findElement(By.id("btnLogin"));
			   elem.click();
		}
		@Then("It should display the HRM HomePage")
		public void it_should_display_the_HRM_HomePage()throws Throwable
		{
		    System.out.println("Login Sucessfull...!!!");
		}



	

}
