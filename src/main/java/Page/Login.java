package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	WebDriver driver;
	WebDriverWait wait;

	public Login(WebDriver driver) {
		this.driver = driver;
	}

	By uid = By.xpath("//*[@name=\"uid\"]");
	By pass = By.xpath("//*[@name=\"password\"]");
	By sub = By.xpath("//*[@name=\"btnLogin\"]");
	

	public void logingtpl(String email, String password) {
		wait = new WebDriverWait(driver, 20);

		WebElement we1 = wait.until(ExpectedConditions.visibilityOfElementLocated(uid));
		we1.click();
		we1.sendKeys(email);
		WebElement we2 = wait.until(ExpectedConditions.visibilityOfElementLocated(pass));
		we2.click();
		we2.sendKeys(password);
		WebElement we3 = wait.until(ExpectedConditions.visibilityOfElementLocated(sub));
		we3.click();
}
//	public void tittleverify()
//	{
//		String title=driver.getTitle();
//		String acltitle="GTPL Bank Home Page";
//		Assert.assertEquals(title, acltitle);
//	}
}
