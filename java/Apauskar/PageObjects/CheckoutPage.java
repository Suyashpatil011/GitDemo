package Apauskar.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import Apauskar.AbstractComponents.AbstractComponents;

public class CheckoutPage extends AbstractComponents {


	WebDriver driver;


	public CheckoutPage(WebDriver driver) {

		super(driver); //to send the driver knowledge to the parent class
		this.driver = driver;

		//initElements methods will take care of constructing that using driver what send in method
		PageFactory.initElements(driver, this);
	}


	@FindBy(css="[placeholder='Select Country']")
	WebElement country;
	
	@FindBy(css=".action__submit")
	WebElement submitbutton;
	
	@FindBy(css=".ta-item:nth-of-type(2)")
	WebElement selectcountry;

	By availableOptions = By.cssSelector(".ta-results");
	
	
	public void SelectCountry(String countryName)
	{
		Actions a = new Actions(driver);
		a.sendKeys(country, countryName).build().perform();
		WaitForElementsToAppear(availableOptions);
		selectcountry.click();
	}
	
	public ConfirmationPage SumitOrder()
	{
		submitbutton.click();
		return new ConfirmationPage(driver);
		
	}



}
