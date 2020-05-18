package testNG_sel_app_form;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import allbasesset.Baseclass;
public class Test_sel_app_form {
	
 Baseclass bs= new Baseclass();
	
@BeforeTest 
	public void launching_webbrowser() throws IOException
	
	{
	  bs.prop();
	  bs.launchwebdriver();
	 bs.takescreenshotmy(bs.b, "launch");
	}
	
	@Test(priority=1)
	public void Enter_first_FirstName_lastname() throws InterruptedException
	{
	  bs.b.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Akash");
      bs.b.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Yesankar");
      bs.takescreenshotmy(bs.b, "ENTER_first_and_last_name");
      Thread.sleep(5000);
     }
	
	@Test(priority=2)
	
	public void gettitle()
	
	{    
		
		String t= bs.b.getTitle();
	    String ex="Selenium Practice Form";
	    Assert.assertEquals(t,ex);
	    bs.takescreenshotmy(bs.b, "gettitle");
	}
	
	@Test(priority=3)
	public void check_radio_button_male()
	{
		Boolean bl1= bs.b.findElement(By.xpath("//input[@id='sex-0']")).isDisplayed();
		System.out.println("radio male button is displayed="+bl1);
		Boolean bl2= bs.b.findElement(By.xpath("//input[@id='sex-0']")).isSelected();
		System.out.println("radio male button is selected="+bl2);
		Boolean bl3=bs.b.findElement(By.xpath("//input[@id='sex-0']")).isEnabled();;
		System.out.println("radio male button is enabled="+bl3);
		bs.b.findElement(By.xpath("//input[@id='sex-0']")).click();
		 bs.takescreenshotmy(bs.b, "check_radio_button_male");
	}
	
	@Test(priority=4)
	public void check_radio_button_female()
	{
	Boolean bl4=bs.b.findElement(By.xpath("//input[@id='sex-1']")).isDisplayed();
	System.out.println("radio male button is displayed="+bl4);
	Boolean bl5=bs.b.findElement(By.xpath("//input[@id='sex-1']")).isSelected();
	System.out.println("radio male button is selected="+bl5);
	Boolean bl6=bs.b.findElement(By.xpath("//input[@id='sex-1']")).isEnabled();
	System.out.println("radio male button is enbled="+bl6);
	bs.b.findElement(By.xpath("//input[@id='sex-1']")).click();
	 bs.takescreenshotmy(bs.b, "check_radio_button_female");
	}
	
	@Test(priority=5)
	public void check_radio_exp_button()
	{
		bs.b.findElement(By.xpath("//input[@id='exp-0']")).click();
		 bs.takescreenshotmy(bs.b, "check_radio_exp_button");
	}
	
	@Test(priority=6)
	public void date()
	{
		bs.b.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("12-APR-2020");
		 bs.takescreenshotmy(bs.b, "date");
	}
	
	@Test(priority=7)
	public void prof_check_b0x()
	{
		bs.b.findElement(By.xpath("//input[@id='profession-0']")).click();
		 bs.takescreenshotmy(bs.b, "prof_check_b0x");
	}
	
	@Test(priority=8)
	public void Continents_dropdown()
	{
		WebElement web= bs.b.findElement(By.xpath("//select[@id='continents']"));
		Select s = new Select(web);
		//s.selectByValue("Australia");
		s.selectByVisibleText("Australia");
		bs.takescreenshotmy(bs.b, "Continents_dropdown");
	}
	
	@Test(priority=9)
	public void click_on_selnoum_menu()
	{
		bs.b.findElement(By.xpath("//div[@class='overflowable-contents']//a[contains(text(),'Selenium')]")).click();
		 bs.takescreenshotmy(bs.b, "click_on_selnoum_menu");
	}
	
	
	@AfterTest
	public void quitingbrowser()
	{
		bs.b.quit();
		
	}
	
}
