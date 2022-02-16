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
	By Reset=By.xpath("//input[@name='btnReset']");
	
	
	public void TitlePage()
	{

		String actualtitle = "GTPL Bank Manager HomePage";
		String expectedtitle = driver.getTitle();
		Assert.assertEquals(expectedtitle,actualtitle );
		System.out.println("Actual tittle = Expected title");
		
	}
	public void checkURL()
	{
		String actualUrl = "https://demo.guru99.com/V1/html/Managerhomepage.php";
		String expectedUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
		System.out.println("Actual URL = Expected URL");
	}
	
	public void Display()
	{
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
	//next page tittle ayo ennu checkcheyannam
}