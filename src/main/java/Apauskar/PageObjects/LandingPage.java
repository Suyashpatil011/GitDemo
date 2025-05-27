package Apauskar.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Apauskar.AbstractComponents.AbstractComponents;

public class LandingPage extends AbstractComponents {


	WebDriver driver;

	//Constructor
	public LandingPage(WebDriver driver) 
	{
		super(driver); //to send the driver knowledge to the parent class
		this.driver = driver;
		//initElements methods will take care of constructing that using driver what send in method
		PageFactory.initElements(driver, this);
	}

	//PageFactory
	//WebElement userid = driver.findElement(By.id("userEmail"));
	//Same above method

	@FindBy(id="userEmail")
	WebElement userid;


	@FindBy(id="userPassword")
	WebElement password;


	@FindBy(id="login")
	WebElement sumit;
	
	@FindBy(css="[class*='flyInOut']")
	WebElement errorMessage;






	public void Application()
	{
		driver.get("https://rahulshettyacademy.com/client");
	}
	
	public String GetErrorMessage()
	{
		WaitForWebElementsToAppear(errorMessage);
		return errorMessage.getText();
	}


	public ProductCatlouge LandingApllication(String email, String pass)
	{
		userid.sendKeys(email);
		password.sendKeys(pass);
		sumit.click();
		ProductCatlouge productcatlouge = new ProductCatlouge(driver);
		return productcatlouge;
	}


}
