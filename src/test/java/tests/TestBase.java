package tests;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class TestBase extends AbstractTestNGCucumberTests {
	
	
	public static WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeSuite
	@Parameters({"browser"})
	public void driverStart(@Optional("chrome") String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome")) {
			String chromepath = System.getProperty("user.dir")+"/drivers/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chromepath);
			driver = new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("firefox")) {
			String chromepath = System.getProperty("user.dir")+"/drivers/geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", chromepath);
			driver = new FirefoxDriver();
		}
		
		else if (browsername.equalsIgnoreCase("IE")) {
			String chromepath = System.getProperty("user.dir")+"/drivers/IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver", chromepath);
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://demo.nopcommerce.com/");
	}
	
	
	@AfterSuite
	public void driverEnd() {
		driver.quit();
	}


}
