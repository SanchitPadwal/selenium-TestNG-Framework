package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgHRMLoginPage {
	
	@FindBy (xpath="//input[@name=\"username\"]") private WebElement username;
	@FindBy (xpath="//input[@name=\"password\"]") private WebElement password;
	@FindBy (xpath="//button[@type=\"submit\"]") private WebElement submit;
	@FindBy (xpath="//p[text()='Forgot your password? ']") private WebElement forgot;

	public OrgHRMLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String user)
	{
		username.sendKeys(user);
	}
	
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void enterSubmit()
	{
		submit.click();
	}
	
	public void enterForgot()
	{
		forgot.click();
	}
}
