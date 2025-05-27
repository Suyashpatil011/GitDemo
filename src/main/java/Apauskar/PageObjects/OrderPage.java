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

public class OrderPage extends AbstractComponents {


	WebDriver driver;


	public OrderPage(WebDriver driver) {

		super(driver); //to send the driver knowledge to the parent class
		this.driver = driver;

		//initElements methods will take care of constructing that using driver what send in method
		PageFactory.initElements(driver, this);
	}


	//Listing all the products from cart page
	@FindBy(css="tr td:nth-child(3)")
	List<WebElement> orderProducts;



	public Boolean VerifyProductInOrder(String productName)
	{		
		Boolean match = orderProducts.stream().anyMatch(orderProduct-> orderProduct.getText().equalsIgnoreCase(productName));
		return match;
	}

	

		




}
