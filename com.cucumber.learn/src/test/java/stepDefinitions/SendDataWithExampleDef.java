package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SendDataWithExampleDef {
	 WebDriver driver;
     WebElement elem;

	
	
		@Given("User enters Login Page")
		public void user_enters_Login_Page()throws Throwable {
			System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.get("https://opensource-demo.orangehrmlive.com/");
			 driver.manage().window().maximize(); 
		    
		}
        @When("User gives {string} and {string}")
		public void user_gives_and(String username, String password)throws Throwable  {
        	elem = driver.findElement(By.id("txtUsername"));
        	elem.click();
        	elem.sendKeys(username);
            elem = driver.findElement(By.id("txtPassword"));
            elem.click();
            elem.sendKeys(password);
		}
		@When("Click login buton")
		public void click_login_buton()throws Throwable 
		{
			elem = driver.findElement(By.id("btnLogin"));
			   elem.click();
		}



	
	
}
