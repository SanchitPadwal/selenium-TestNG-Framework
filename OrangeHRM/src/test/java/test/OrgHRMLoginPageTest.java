package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.ChromeBrowser;
import pom.OrgHRMLoginPage;
import utility.Excel;

public class OrgHRMLoginPageTest {
	WebDriver  driver;
	@BeforeMethod
	public void launchBrowser()
	{
		driver = ChromeBrowser.openBrowser("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	public void orgHRMTest() throws EncryptedDocumentException, IOException
	{
		OrgHRMLoginPage orghrmlogin = new OrgHRMLoginPage(driver);
		String user =  Excel.getData("orgHRM", 0, 0);
		String pass = Excel.getData("orgHRM", 1, 0);
		orghrmlogin.enterUsername(user);
		orghrmlogin.enterPassword(pass);
		orghrmlogin.enterSubmit();
		
	}

}
