package MyCabs_scripts;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class EasemytripBaseClass {
	public WebDriver Driver;
	Logger logger;
	

	@Parameters({"browser","Url"})
	@BeforeMethod
	public void setup(String browser, String Url) {
		
		if(browser.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\ashvith\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			Driver = new EdgeDriver();
		}
		
		else if (browser.equalsIgnoreCase("chrome")) {		
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ashvith\\Downloads\\chromedriver_win32\\chromedriver.exe");
			Driver = new ChromeDriver();
		
		}
		
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\ashvith\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe/");
			Driver = new FirefoxDriver();
		}
		logger=Logger.getLogger("EasemytripBaseClass.class");
		PropertyConfigurator.configure(" log4j.properties");
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		Driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);	
	    Driver.get(Url);
	}
	@AfterMethod
	public void Exit()
	{
		Driver.close();
		logger.info("browser closed");
	}
}
