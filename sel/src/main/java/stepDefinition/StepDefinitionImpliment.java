package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionImpliment {
	
	WebDriver h;

@Given("^navigate to website and click on sign in button$")
public void navigate_to_website_and_click_on_sign_in_button()
{
	System.setProperty("webdriver.chrome.driver", "C:\\selenium project\\Selenium webdriver\\chromedriver_win32 (2)\\chromedriver.exe");
	h =new ChromeDriver();
	h.get("http://automationpractice.com/index.php");
	h.manage().window().maximize();
	h.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
}

@When("^Enter e-mail Address \"([^\"]*)\"and click on create an account button$")
public void enter_e_mail_Address_and_click_on_create_an_account_button(String emailid)
{
    h.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	h.findElement(By.xpath("//input[@name='email_create' and @id='email_create']")).sendKeys(emailid);
	h.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
	
}

@Then("^display successfully open the form message$")
public void display_successfully_open_the_form_message() 
{
   System.out.println("successfully click on create an account");
}


@Then("^click on title radio button$")
public void click_on_title_radio_button() 
{
   h.findElement(By.xpath("//input[@type='radio' and @id='id_gender1']")).click();
}

@Then("^Enter first name \"([^\"]*)\"last name \"([^\"]*)\"and password  \"([^\"]*)\"$")
public void enter_first_name_last_name_and_password(String first_name, String last_name, String password) 
{
	h.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys(first_name);
	h.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys(last_name);
	h.findElement(By.xpath("//input[@id='passwd']")).sendKeys(password);
}



@Then("^Enter DOB day \"([^\"]*)\"month \"([^\"]*)\"year \"([^\"]*)\">$")
public void enter_DOB_day_month_year(String day, String month, String year) 
{
	WebElement dayvalue= h.findElement(By.xpath("//select[@id='days']"));
  Select sd = new Select(dayvalue);
  sd.selectByVisibleText(day);
   WebElement monthvalue =h.findElement(By.xpath("//select[@id='months']"));
   Select sdm = new Select(monthvalue);
   sdm.selectByVisibleText(month);
   WebElement yearvalue =h.findElement(By.xpath("//select[@id='years']"));
   Select sdy = new Select(yearvalue);
   sdy.selectByVisibleText(year);
}

@Then("^check sign up and release special offer box$")
public void check_sign_up_and_release_special_offer_box() 
{
  h.findElement(By.xpath("//input[@id='newsletter' and @value='1']"));
  h.findElement(By.xpath("//input[@id='optin' and @value='1']"));
}

@Then("^Enter the address fields first name \"([^\"]*)\"last name \"([^\"]*)\"company \"([^\"]*)\"Address \"([^\"]*)\" Address line two \"([^\"]*)\" city \"([^\"]*)\"zipcode \"([^\"]*)\"additional information \"([^\"]*)\"home phone \"([^\"]*)\"mobile no \"([^\"]*)\"enter adress alias \"([^\"]*)\">$")
public void enter_the_address_fields_first_name_last_name_company_Address_Address_line_two_city_zipcode_additional_information_home_phone_mobile_no_enter_adress_alias(String first_n, String last_n, String company, String Address, String Addline2, String city, String zipcode, String additional_info, String homephone, String mob_no, String add_alias) 
{
	h.findElement(By.xpath("//input[@id='firstname']")).sendKeys(first_n);
	
	h.findElement(By.xpath("//input[@id='lastname']")).sendKeys(last_n);
	h.findElement(By.xpath("//input[@id='company']")).sendKeys(company);
	h.findElement(By.xpath("//input[@id='address1']")).sendKeys(Address);
	h.findElement(By.xpath("//input[@id='address2']")).sendKeys(Addline2);
	h.findElement(By.xpath("//input[@id='city']")).sendKeys(city);
	h.findElement(By.xpath("//input[@id='postcode']")).sendKeys(zipcode);
	h.findElement(By.xpath("//textarea[@id='other']")).sendKeys(additional_info);
	h.findElement(By.xpath("//input[@id='phone']")).sendKeys(homephone);
	h.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys(mob_no);
	h.findElement(By.xpath("//input[@id='alias']")).sendKeys(add_alias);
}


@Then("^Select the value from state \"([^\"]*)\"and country dropdown \"([^\"]*)\">$")
public void select_the_value_from_state_and_country_dropdown(String state_dropdown, String country_dropdown) 
{
	WebElement state= h.findElement(By.xpath("//select[@id='id_state']"));
	  Select sstate = new Select(state);
	  sstate.selectByVisibleText(state_dropdown);
	   WebElement country =h.findElement(By.xpath("//select[@id='id_country']"));
	   Select scountry = new Select(country);
	   scountry.selectByVisibleText(country_dropdown);
}

@Then("^click on register button and display the successfully registration message$")
public void click_on_register_button_and_display_the_successfully_registration_message() 
{
h.findElement(By.xpath("//button[@id='submitAccount']/span")).click();
System.out.println("register successful");
	
}

@Then("^quit the browser$")
public void quit_the_browser() 
{
    h.quit();
    System.out.println("quit successful");
    
}


}	
	
	
	
	
	
	
	
	
	
	


