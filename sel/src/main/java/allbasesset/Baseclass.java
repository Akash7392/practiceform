package allbasesset;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass  {
	
public	Properties p;
public WebDriver b;
	int i;
	
	
	
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
	System.out.println("check git connect disconnect");
	
	
}
		
public void takescreenshotmy(WebDriver b, String scrName)

{
	TakesScreenshot srn = (TakesScreenshot)b;
	
	File fl = srn.getScreenshotAs(OutputType.FILE);
	File tr = new File("C:\\Users\\Akash\\git\\practiceform\\sel\\selallscreenshots\\"+scrName+".png");
     try {
		FileUtils.copyFile(fl, tr);
	
	} catch (IOException e) {
		e.printStackTrace();
	
	}
}
	














	
	

}
