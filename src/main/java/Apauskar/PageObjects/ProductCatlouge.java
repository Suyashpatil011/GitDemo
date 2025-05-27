package Apauskar.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Apauskar.AbstractComponents.AbstractComponents;

public class ProductCatlouge extends AbstractComponents {


	WebDriver driver;


	public ProductCatlouge(WebDriver driver) {

		super(driver); //to send the driver knowledge to the parent class
		this.driver = driver;

		//initElements methods will take care of constructing that using driver what send in method
		PageFactory.initElements(driver, this);
	}


	//Listing all the products
	@FindBy(css=".mb-3")
	List<WebElement> products;

	@FindBy(css=".ng-animating")
	WebElement spinner;

	//Creating the variable
	By productBy = By.cssSelector(".mb-3");
	By addtocart = By.cssSelector(".card-body button:last-of-type");
	By message = By.cssSelector(".ng-animating");


	public List<WebElement> GetProductList()
	{
		//Wait untill products loads
		WaitForElementsToAppear(productBy);
		//return product list to the method
		return products;
	}


	public WebElement GetProductByName(String productName)
	{
		WebElement prod = GetProductList().stream().filter(product->		
		product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
		return prod;
	}


	public void AddProductToCart(String productName) throws InterruptedException
	{
		WebElement prod = GetProductByName(productName);
		prod.findElement(addtocart).click();
		WaitForElementsToAppear(message);
		WaitForElementsToDisapper(spinner);
	}





}
