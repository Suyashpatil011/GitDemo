package Apauskar.Tests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class BrokenLinks {
	
	
	public static void main(String[] args) throws MalformedURLException, IOException
	{
		
		
		WebDriverManager.chromedriver().setup();
		SoftAssert a = new SoftAssert();
		
		WebDriver driver =  new ChromeDriver();
		driver.get("http://rahulshettyacademy.com/AutomationPractice/");
		
		
		//Step 1  - get all the URL's tied up to the the page 
		List<WebElement> links =  driver.findElements(By.cssSelector("li[class=\"gf-li\"] a"));
		
		for(WebElement link :links)
		{
			
			//Will fetch the href id for all the URL
			String url = link.getAttribute("href");
			
			//Will URL class to the open Connection ech return the HttpURLConnection
			HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
			//We are requesting  the call for the above url by HEAD method
			con.setRequestMethod("HEAD");
			//call the url and will return resonse(Code, body, headers)
			con.connect();
			//fetching the code and storing in variable 
			int code = con.getResponseCode();
			
			a.assertTrue(code < 400, "The link with text " +link.getText() + "With status code " +code );
			
		}
		a.assertAll();
	
		
		
		
		
	}

}
