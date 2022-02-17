package Test_Scenario;

import java.io.File;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GTPL_Auto.GTPL_EditAccountPage;
import GTPL_Auto.GTPL_HomePage;
import GTPL_Auto.GTPL_LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GTPL_Test {
	WebDriver driver;

	@BeforeClass
	@Parameters("url")
	public void start(String url) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
//		options.addExtensions(new File("C:\\Users\\91735\\eclipse-workspace\\GTPL_Auto\\blocker")); 
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//		options.merge(capabilities);
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------------------------");
		System.out.println("Select a browser");
		System.out.println("1.Google Chrome");
		System.out.println("2.Mozilla Firefox");
		System.out.println("3.Microsoft Edge");
		int brwoser = sc.nextInt();
		switch (brwoser) {
		case 1:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);
			driver.navigate().to(url);
			break;
		case 2:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.navigate().to(url);
			break;
		case 3:
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.navigate().to(url);
			break;
		default:
			System.out.println("Invalid Browser");
			System.exit(0);
		}
	}

	@Test(priority = 0)
	@Parameters("ID")
	public void user(String ID) {
		GTPL_LoginPage obj = new GTPL_LoginPage(driver);
		obj.userID(ID);
	}

	@Test(priority = 1)
	@Parameters("password")
	public void passWord(String password) {
		GTPL_LoginPage obj = new GTPL_LoginPage(driver);
		obj.PassWord(password);
	}

	@Test(priority = 2)
	public void checkTheUrl() {
		GTPL_HomePage obj = new GTPL_HomePage(driver);
		obj.checkURL();
	}

	@Test(priority = 3)
	public void clickEditAccount() {
		GTPL_HomePage obj = new GTPL_HomePage(driver);
		obj.checkModule();
	}

	@Test(priority = 4)
	public void editPageDetails() {
		GTPL_EditAccountPage obj = new GTPL_EditAccountPage(driver);
		obj.display();
	}
	@Test(priority = 5)
	public void editAccountPage() {
		GTPL_EditAccountPage obj = new GTPL_EditAccountPage(driver);
		obj.editAccount();
	}

	@AfterClass
	public void stop() {
		//driver.quit();

	}
}
