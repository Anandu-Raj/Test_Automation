package login;

import org.openqa.selenium.Alert;
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
		String actualUrl = "https://demo.guru99.com/V1/index.php";
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
		WebElement Password1 = wait.until(ExpectedConditions.visibilityOfElementLocated(Password));
		 Password1.sendKeys(password);
		 WebElement login1 = wait.until(ExpectedConditions.visibilityOfElementLocated(LOGIN));
		 login1.click();
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
	
	public void ResetFunction() {
		wait = new WebDriverWait(driver, 20);

		WebElement UserID1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='uid']")));
		UserID1.sendKeys("abcd@gmail.com");
		WebElement password1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='password']")));
		password1.sendKeys("abcdefghlkjl");

		WebElement Resetfunction = wait.until(ExpectedConditions.visibilityOfElementLocated(Reset));
		Resetfunction.click();
		Assert.assertEquals(true, Resetfunction.isDisplayed());
		System.out.println("All Values are cleared ,Reset is working fine");
	}
	
	
	
	
	public void  invalidPassworduserid() {
		
		driver.findElement(By.xpath("//*[@name='uid']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("abcdefghlkjl");
		driver.findElement(By.xpath("//*[@name='btnLogin']")).click();
		Alert a= driver.switchTo().alert();
		String x=a.getText();
		System.out.println(x); a.accept(); 
	
		
	}

	public void  validPasswordinvaliduserid()  {
		
		driver.findElement(By.xpath("//*[@name='uid']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("pUnEteq");
		driver.findElement(By.xpath("//*[@name='btnLogin']")).click();
		Alert a= driver.switchTo().alert();
		String x=a.getText();
		System.out.println(x); a.accept(); 
		
	
		
	}
	
	public void  invalidPasswordvaliduserid() {
		
		driver.findElement(By.xpath("//*[@name='uid']")).sendKeys("mngr384160");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("abcdefghlkjl");
		driver.findElement(By.xpath("//*[@name='btnLogin']")).click();
		Alert a= driver.switchTo().alert();
		String x=a.getText();
		System.out.println(x); a.accept(); 
	
		
	}
	
	
	
	}
	

	
