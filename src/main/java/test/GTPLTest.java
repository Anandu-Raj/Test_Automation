package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objects.GTPLHomePage;
import objects.GTPLLoginPage;
import objects.GTPLNewCustomerEntryPage;

public class GTPLTest {
	WebDriver driver;

	@BeforeClass
	@Parameters("url")
	public void start(String url) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		driver.navigate().to(url);
	}

	@Test(priority = 0)
	@Parameters("ID")
	public void user(String ID) {
		GTPLLoginPage obj = new GTPLLoginPage(driver);
		obj.userID(ID);
	}

	@Test(priority = 1)
	@Parameters("password")
	public void passWord(String password) {
		GTPLLoginPage obj = new GTPLLoginPage(driver);
		obj.PassWord(password);
	}

	@Test(priority = 2)
	public void checkTheUrl() {
		GTPLHomePage obj = new GTPLHomePage(driver);
		obj.checkURL();
	}

	@Test(priority = 3)
	public void clickNewCustomer() {
		GTPLHomePage obj = new GTPLHomePage(driver);
		obj.menuDisplay();
	}
	
	@Test(priority = 4)
	public void titleNewCustomerEntryPage() {
		GTPLNewCustomerEntryPage obj = new GTPLNewCustomerEntryPage(driver);
		obj.NewCustomerEntryPageTitle();
	}
	
	@Test(priority = 5)
	public void displayNewCustomerEntryPage() {
		GTPLNewCustomerEntryPage obj = new GTPLNewCustomerEntryPage(driver);
		obj.NewCustomerEntryPageDisplay();
	}

//	@AfterClass
//	public void stop() {
//		driver.quit();
//	}
}
