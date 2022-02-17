package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

public class loadurl {
	WebDriver driver;
	WebDriverWait wait;

	public loadurl(WebDriver driver) {
		this.driver = driver;
	}

	By UserID = By.xpath("//*[@name='uid']");
	By Password = By.xpath("//*[@name='password']");
	By LOGIN = By.xpath("//*[@name='btnLogin']");
	By Reset = By.xpath("//input[@name='btnReset']");
	By Mandatoryfield = By.xpath("//*[text()='* mandatory field']");

	public void TitlePage() {

		String actualtitle = "GTPL Bank Manager HomePage";
		String expectedtitle = driver.getTitle();
		Assert.assertEquals(expectedtitle, actualtitle);
		System.out.println("Actual tittle = Expected title");

	}

	public void checkURL() {
		String actualUrl = "https://demo.guru99.com/V1/html/Managerhomepage.php";
		String expectedUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
		System.out.println("Actual URL = Expected URL");
	}

	public void Display() {
		String actualUrl = "https://demo.guru99.com/V1/html/Managerhomepage.php";
		String expectedUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
		System.out.println("Actual URL = Expected URL");
	}

	public void userID(String ID) {
		wait = new WebDriverWait(driver, 20);
		WebElement UserId = wait.until(ExpectedConditions.visibilityOfElementLocated(UserID));
		UserId.sendKeys(ID);
	}

	public void PassWord(String password) {
		wait = new WebDriverWait(driver, 20);
		WebElement passWord = wait.until(ExpectedConditions.visibilityOfElementLocated(Password));
		passWord.sendKeys(password);
		WebElement login = wait.until(ExpectedConditions.visibilityOfElementLocated(LOGIN));
		login.click();
	}

	public void DispalyLoginButton() {
		wait = new WebDriverWait(driver, 20);
		WebElement LoginButton = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='btnLogin']")));
		Assert.assertEquals(true, LoginButton.isDisplayed());
		System.out.println("LoginButton menu is displayed");
	}

	public void DispalyUserid() {
		wait = new WebDriverWait(driver, 20);
		WebElement DispalyUserid = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='uid']")));
		Assert.assertEquals(true, DispalyUserid.isDisplayed());
		System.out.println("UserID  is displayed");
	}

	public void Displaypassword() {
		wait = new WebDriverWait(driver, 20);
		WebElement DispalyUserid = wait.until(ExpectedConditions.visibilityOfElementLocated(Password));
		Assert.assertEquals(true, DispalyUserid.isDisplayed());
		System.out.println("Password  is displayed");
	}

	public void DisplayReset() {
		wait = new WebDriverWait(driver, 20);
		WebElement DispalyUserid = wait.until(ExpectedConditions.visibilityOfElementLocated(Reset));
		Assert.assertEquals(true, DispalyUserid.isDisplayed());
		System.out.println("Reset is displayed");
	}

	public void Mandatoryfield1() {
		wait = new WebDriverWait(driver, 20);
		WebElement DispalyUserid = wait.until(ExpectedConditions.visibilityOfElementLocated(Mandatoryfield));
		Assert.assertEquals(true, DispalyUserid.isDisplayed());
		System.out.println("MandatoryField  is displayed");
	}

	
	public void blank()
	{
		WebElement inputBox = driver.findElement(By.id("inputBoxId"));
		String textInsideInputBox = inputBox.getAttribute("value");
		if(textInsideInputBox.isEmpty()) 
		{ 
			System.out.println("Input field is empty"); 
		}
	}
//	wait = new WebDriverWait(driver, 20);
//	@SuppressWarnings("resource") Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the Customer Name : ");
//	String Customername = sc.nextLine(); 
//	String regex = "[a-zA-Z]+"; 
//	if (!Customername.matches(regex)) 
//	{ WebElement customerName = wait.until(ExpectedConditions.visibilityOfElementLocated(CustomerName));
//	customerName.sendKeys(Customername); 
//	WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(Alert));
//	System.out.println(alert.getText());
	}
	
	
