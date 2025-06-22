package Apauskar.TestComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import Apauskar.PageObjects.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {



	public WebDriver driver;
	public LandingPage landingpage;

	public WebDriver initializeDriver() throws IOException
	{

		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\suypatil\\Desktop\\Selenium\\New folder\\selenium\\src\\test\\java\\Apauskar\\Resources\\GlobalData.properties");
		//user.dir = C:\Users\apauskar\OneDrive - Capgemini\Desktop\Work stuff\Selenium\SeleniumFramework
		prop.load(file);
		String browserName = prop.getProperty("browser");


		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = (WebDriver) new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{

		}
		else if(browserName.equalsIgnoreCase("edge"))
		{

		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;

	}	
	
	@BeforeMethod(alwaysRun=true)
	public LandingPage LaunchApplication() throws IOException
	{
		driver = initializeDriver();
		landingpage = new LandingPage(driver);
		landingpage.Application();
		return landingpage;
	}
	
	@AfterMethod(alwaysRun=true)
	public void tearDown()
	{
		driver.close();
	}
	

}
