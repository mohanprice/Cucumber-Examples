package stepDefinitions;

import io.cucumber.java.en.Given;

public class RegularStepDef {

 @Given("I am having {int} Laptops")
 public void I_am_having_2_Laptops(Integer num)throws Throwable
 {
	System.out.println("Laptop count is:" +num);
 }
 
 

	 @Given("{double} is a decimal number")
	 public void is_a_decimal_number(Double dec)throws Throwable {
	     System.out.println("Decimal entered is:" +dec);
	     
	 }


	

	 @Given("{string} is elder than {string}")
	 public void is_elder_than(String name, String name1)throws Throwable {
	 System.out.println("String entered in the Sentence is:"+name +"and" +name1 );
	 }



 

}


