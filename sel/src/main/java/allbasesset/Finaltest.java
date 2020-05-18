package allbasesset;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Finaltest {

	public	Properties p;
	public WebDriver b;
		
	
		public void prop() throws IOException

	{
		p = new Properties();
		File src = new File("C:\\Users\\Akash\\git\\practiceform\\sel\\congig.properties");
		FileInputStream rd= new FileInputStream(src);
		p.load(rd);
	}
		
	public void launchwebdriver()

	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium project\\Selenium webdriver\\chromedriver_win32 (2)\\chromedriver.exe");
		b= new ChromeDriver();
		b.get(p.getProperty("url"));
		//b.get("https://www.techlistic.com/p/selenium-practice-form.html");
		b.manage().deleteAllCookies();
		b.manage().window().maximize();
		b.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	
	}
	
	public void Continents_dropdown()
	{
		WebElement web= b.findElement(By.xpath("//select[@id='continents']"));
		Select s = new Select(web);
	//	s.selectByValue("Australia");
		s.selectByVisibleText("Australia");
		
	}

	public static void main(String[] args) throws IOException {
		
		Finaltest g = new Finaltest();
		g.prop();
		g.launchwebdriver();
		g.Continents_dropdown();

	}

}
