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

public class StandAloneTest extends BaseTest {

	// String productName = "ZARA COAT 3";

	// for DataProvider -> Submitorder(String email, String password, String productName)
	@Test(dataProvider = "getData", groups = { "Purchase"})
	public void Submitorder(HashMap<String,String> input)
			throws InterruptedException, IOException 
	{
		
		// Providing the ID and Password
		ProductCatlouge productcatlouge = landingpage.LandingApllication(input.get("email"), input.get("password"));
		// fetching the list of products
		List<WebElement> products = productcatlouge.GetProductList();
		// Adding product to cat
		productcatlouge.AddProductToCart(input.get("product"));
		// Clicking on add to cart button

		CartPage cartpage = productcatlouge.GoTocCartPage();

		// Verifing the cart product
		Boolean match = cartpage.VerifyProductInCart(input.get("product"));
		Assert.assertTrue(match);

		CheckoutPage checkoutpage = cartpage.GoToCheckoutCartPage();
		checkoutpage.SelectCountry("India");

		ConfirmationPage cormfirmatiopage = checkoutpage.SumitOrder();
		String confirmMessage = cormfirmatiopage.GetConfirmMessage();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("Thankyou for the order."));

	}

	@Test(dependsOnMethods = { "Submitorder" })
	public void OrderHistoryTest() throws InterruptedException, IOException {
		String productName = "ZARA COAT 3";
		// Providing the ID and Password
		ProductCatlouge productcatlouge = landingpage.LandingApllication("AKAK@gmail.com", "Minikey9686!");
		OrderPage ordepage = productcatlouge.GoToOrderPage();
		ordepage.VerifyProductInOrder(productName);

	}

	/*	//Parameretrizing using dataprovider
	 * //@DataProvider
	 * 
	 * public Object[][] getData() { return new Object[][] {
	 * {"AKAK@gmail.com","Minikey9686!","ZARA COAT 3"},
	 * {"surajvpatil49@gmail.com","Sap@123","IPHONE 13 PRO"} }; }
	 */

	
		// Parameterizing using Hashmap
	@DataProvider
	public Object[][] getData() 
	{
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("email", "AKAK@gmail.com");
		map.put("password", "Minikey9686!");
		map.put("product", "ZARA COAT 3");
		
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("email", "surajvpatil49@gmail.com");
		map1.put("password", "Sap@123");
		map1.put("product", "IPHONE 13 PRO");
		
		
		return new Object[][] { {map},{map1}};
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
