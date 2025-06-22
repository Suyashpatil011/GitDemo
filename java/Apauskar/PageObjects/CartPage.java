package Apauskar.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import Apauskar.AbstractComponents.AbstractComponents;

public class CartPage extends AbstractComponents {


	WebDriver driver;


	public CartPage(WebDriver driver) {

		super(driver); //to send the driver knowledge to the parent class
		this.driver = driver;

		//initElements methods will take care of constructing that using driver what send in method
		PageFactory.initElements(driver, this);
	}


	//Listing all the products from cart page
	@FindBy(css=".cartSection h3")
	List<WebElement> cartProducts;
	
	@FindBy(css=".totalRow button")
	WebElement checkout;



	public Boolean VerifyProductInCart(String productName)
	{		
		Boolean match = cartProducts.stream().anyMatch(cartProduct-> cartProduct.getText().equalsIgnoreCase(productName));
		return match;
	}

	
	public CheckoutPage GoToCheckoutCartPage()
	{
		checkout.click();
		CheckoutPage checkoutpage = new CheckoutPage(driver);
		return checkoutpage;
		
	}
		




}
