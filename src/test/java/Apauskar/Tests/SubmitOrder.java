package Apauskar.Tests;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Apauskar.PageObjects.CartPage;
import Apauskar.PageObjects.CheckoutPage;
import Apauskar.PageObjects.ConfirmationPage;
import Apauskar.PageObjects.LandingPage;
import Apauskar.PageObjects.OrderPage;
import Apauskar.PageObjects.ProductCatlouge;
import Apauskar.TestComponents.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class SubmitOrder extends BaseTest {



	@Test(dependsOnMethods = { "Submitorder" })
	public void OrderHistoryTest() throws InterruptedException, IOException {
		String productName = "ZARA COAT 3";
		// Providing the ID and Password
		ProductCatlouge productcatlouge = landingpage.LandingApllication("AKAK@gmail.com", "Minikey9686!");
		OrderPage ordepage = productcatlouge.GoToOrderPage();
		ordepage.VerifyProductInOrder(productName);

	}

	
	//Taking the screenshot and storing at below path
	public String getScreenshots(String testCaseName) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir")+ "//reports//" + testCaseName + ".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir")+ "//reports//" + testCaseName + ".png";
	}
}
