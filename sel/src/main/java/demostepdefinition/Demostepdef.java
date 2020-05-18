package demostepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demostepdef
{
	WebDriver c;

@Given("^Navigate to site$")
public void navigate_to_site() 
{
	System.setProperty("webdriver.chrome.driver", "C:\\selenium project\\Selenium webdriver\\chromedriver_win32 (2)\\chromedriver.exe");
	c =new ChromeDriver();
	c.get("http://automationpractice.com/index.php");
	c.manage().window().maximize();
	
}

@When("^click on sign in button$")
public void click_on_sign_in_button() 
{
	c.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
}

@When("^enter email address \"([^\"]*)\"$")
public void enter_email_address(String emailid1) 
{
	c.findElement(By.xpath("//input[@data-validate='isEmail' and @id='email']")).sendKeys(emailid1);
	c.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
@When("^enter security password \"([^\"]*)\"$")
public void enter_security_password(String pass) 
{
	c.findElement(By.xpath("//input[@type='password' and @name='passwd']")).sendKeys(pass);
}

@Then("^click on sgin in button again$")
public void click_on_sgin_in_button_again() 
{
	c.findElement(By.xpath("//button[@type='submit' and @id='SubmitLogin']")).click();
}

@Then("^display the message$")
public void display_the_message() 
{
 System.out.println("sign in successful");
}	
@Then("^quit the only browser$")
public void quit_the_only_browser() 
{
 c.quit();
 System.out.println("quit successful");
}	
	

}











	

