package Test_GTPLBank;

import org.testng.annotations.Test;

import GTPLBank.LoginGTPL;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_LoginGTPL {
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
	@Parameters("Userid")
	public void UserID(String Userid) {
	  LoginGTPL obj = new LoginGTPL(driver);
		obj.UserID(Userid);
	}

	@Test(priority = 1)
	@Parameters("Password")
	public void password(String Password) {
		LoginGTPL obj = new LoginGTPL(driver);
		obj.Password(Password);
	}
	@Test(priority = 2)
	public void checkURLstatus() {
		LoginGTPL obj = new LoginGTPL(driver);
		obj.checkURLstatus();
		driver.quit();
		
	}

}
