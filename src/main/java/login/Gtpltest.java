package login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Gtpltest {
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
		loadurl obj = new loadurl(driver);
		obj.userID(ID);
	}

	@Test(priority = 1)
	@Parameters("password")
	public void passWord(String password) {
		loadurl obj = new loadurl(driver);
		obj.PassWord(password);
	}

	@Test(priority = 2)
	public void checkTheUrl() {
		loadurl obj = new loadurl(driver);
		obj.checkURL();
	}
	@Test(priority = 3)
	public void TitlePage() {
		loadurl obj = new loadurl(driver);
		obj.TitlePage();
	}

	@Test(priority = 0)
	public void DispalyLoginButton() {
		loadurl obj = new loadurl(driver);
		obj.DispalyLoginButton();
	}
	
	@Test(priority = 0)
	public void DispalyUserid() {
		loadurl obj = new loadurl(driver);
		obj.DispalyUserid();
	}
	@Test(priority = 0)
	public void Displaypassword() {
		loadurl obj = new loadurl(driver);
		obj.Displaypassword();
	}
	
	@Test(priority = 0)
	public void  DisplayReset() {
		loadurl obj = new loadurl(driver);
		obj. DisplayReset();
	}
	 
	
	@Test(priority = 0)
	public void  Mandatoryfield() {
		loadurl obj = new loadurl(driver);
		obj.Mandatoryfield1();
	}
	 


	@Test(priority = 2) 
	public void DisplayMangerpage() {
		Mangerpage obj = new Mangerpage(driver);
		obj.DisplayMangerpage();
	}
	
	@AfterClass
	public void stop() {
		driver.quit();
	}
}