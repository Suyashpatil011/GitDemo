package Apauskar.AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Apauskar.PageObjects.CartPage;
import Apauskar.PageObjects.OrderPage;

public class AbstractComponents {

	WebDriver driver;

	//Constructor
	public AbstractComponents(WebDriver driver) 
	{
		this.driver =driver;

		//initElements methods will take care of constructing that using driver what send in method
		PageFactory.initElements(driver, this);
	}


	@FindBy(css="[routerlink*='cart']")
	WebElement gotocart;
	
	@FindBy(css="[routerlink*='order']")
	WebElement gotoorder;
	
	
	
	
	

	public void WaitForElementsToAppear(By findBy)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}
	
	public void WaitForWebElementsToAppear(WebElement findBy)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(findBy));
	}
	
	
	


	public void WaitForElementsToDisapper(WebElement ele) throws InterruptedException
	{
		Thread.sleep(1000);
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5)); //
		//wait.until(ExpectedConditions.invisibilityOf(ele));

	}
	

	public CartPage GoTocCartPage()
	{
		gotocart.click();
		CartPage cartpage = new CartPage(driver);
		return cartpage;
	}
	
	public OrderPage GoToOrderPage()
	{
		gotoorder.click();
		OrderPage orderpage = new OrderPage(driver);
		return orderpage;
	}



}
