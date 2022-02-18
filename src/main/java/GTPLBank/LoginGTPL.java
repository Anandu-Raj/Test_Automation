package GTPLBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class LoginGTPL {
	WebDriver driver;
	WebDriverWait wait;
	
	By UserID = By.xpath("//*[@name='uid']");
	By Password = By.xpath("//*[@name='password']");
	By LOGIN = By.xpath("//*[@name='btnLogin']");
	
	public LoginGTPL(WebDriver driver) {
		this.driver = driver;
	}
	public void UserID(String UID) {
		wait = new WebDriverWait(driver, 10);
		WebElement UserID1 = wait.until(ExpectedConditions.visibilityOfElementLocated(UserID));
		UserID1.sendKeys(UID);
	}
	public void Password(String pswd) {
		wait = new WebDriverWait(driver, 10);
		WebElement pswd1 = wait.until(ExpectedConditions.visibilityOfElementLocated(Password));
		pswd1.sendKeys(pswd);
//	}
//	public void LOGIN(String Login) {
//		wait = new WebDriverWait(driver, 10);
		WebElement submit = wait.until(ExpectedConditions.visibilityOfElementLocated(LOGIN));
		submit.click();
	}
	public void checkURLstatus() {
		driver.navigate().to("https://demo.guru99.com/V1/html/MiniStatementInput.php");
		String ActualUrl = driver.getCurrentUrl();
		String ExpectedUrl = "URL is loaded";
		Assert.assertEquals(ExpectedUrl, ActualUrl);
	}
}
