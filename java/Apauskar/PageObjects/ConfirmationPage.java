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

public class ConfirmationPage extends AbstractComponents {


	WebDriver driver;


	public ConfirmationPage(WebDriver driver) {

		super(driver); //to send the driver knowledge to the parent class
		this.driver = driver;

		//initElements methods will take care of constructing that using driver what send in method
		PageFactory.initElements(driver, this);
	}

	@FindBy(css=".hero-primary")
	WebElement confirm;
	
	By corfirmmessage = By.cssSelector(".hero-primary");
	
	
	public String GetConfirmMessage()
	{
		WaitForElementsToAppear(corfirmmessage);
		return confirm.getText();
	}


		




}
