package Apauskar.Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Apauskar.PageObjects.ProductCatlouge;
import Apauskar.TestComponents.BaseTest;

public class ErrorValidation extends BaseTest {

	
	@Test(groups = {"ErrorHandling"})
	public void submitorder() throws InterruptedException, IOException
	{
		

        String path = System.getProperty("user.dir") + "//reports/index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("WebAutomationResult");
        reporter.config().setDocumentTitle("MyFirstDocument");
        extend.attachReporter(reporter);
        
        
        
	
		String productName = "ZARA COAT 3";
		//Lunching Application 
		landingpage.Application();
		//Providing the ID and Password
		landingpage.LandingApllication("AKAK@gmail.com", "Minikey966!");
		Assert.assertEquals("Incorrect email or password.", landingpage.GetErrorMessage());


	}

}
