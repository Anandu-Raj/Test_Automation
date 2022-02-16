package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GTPLEditCustomerPage;
import pages.GTPLHomePage;
import pages.GTPLLoginPage;

public class TestGTPL {
	WebDriver driver;
	
	@BeforeClass
	@Parameters("url")
	public void driverInstance1(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);
	}
	
	@Test(priority = 0)
	@Parameters("LPTitle")
	public void loginPageTitleTest(String LPTitle) {
		GTPLLoginPage page1=new GTPLLoginPage(driver);
		page1.loginPageTitle(LPTitle);
	}
	
	@Test(priority = 1)
	@Parameters({"uid", "pword"})
	public void EnterCredentialsTest(String uid, String pword) {
		GTPLLoginPage page2=new GTPLLoginPage(driver);
		page2.EnterCredentials(uid, pword);
	}
	
	@Test(priority = 2)
	public void submitCredentialsTest() {
		GTPLLoginPage page3=new GTPLLoginPage(driver);
		page3.submitCredentials();
	}
	
	@Test(priority = 3)
	@Parameters("HPTitle")
	public void homePageTitleTest(String HPTitle) {
		GTPLHomePage page4=new GTPLHomePage(driver);
		page4.homePageTitle(HPTitle);
	}
	
	@Test(priority = 4)
	public void editCustomerPageTest() {
		GTPLHomePage page5=new GTPLHomePage(driver);
		page5.editCustomerPage();
	}
	
	@Test(priority = 5)
	@Parameters("ECPTitle")
	public void editCustomerPageTitleTest(String ECPTitle) {
		GTPLEditCustomerPage page6=new GTPLEditCustomerPage(driver);
		page6.editCustomerPageTitle(ECPTitle);
	}
	
	@AfterClass
	public void driverInstance2() {
		driver.quit();
	}
}
