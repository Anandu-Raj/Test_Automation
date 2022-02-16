package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GTPLHomePage {
	WebDriver driver;
	WebDriverWait wait;

	public GTPLHomePage(WebDriver driver) {
		this.driver = driver;
	}

	By NewCustomer = By.xpath("//*[text()='New Customer']");

	public void checkURL() {
		String actualUrl = "https://demo.guru99.com/V1/html/Managerhomepage.php";
		String expectedUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
		System.out.println("Actual URL = Expected URL");
	}

	public void menuDisplay() {
		wait = new WebDriverWait(driver, 20);
		WebElement Newcustomer = wait.until(ExpectedConditions.visibilityOfElementLocated(NewCustomer));
		String actualText = "New Customer";
		String expectedText = Newcustomer.getText();
		Assert.assertEquals(expectedText, actualText);
		System.out.println("Name of the menu is New Customer");
		WebElement NewcustomerClick = wait.until(ExpectedConditions.visibilityOfElementLocated(NewCustomer));
		NewcustomerClick.click();
	}
}
