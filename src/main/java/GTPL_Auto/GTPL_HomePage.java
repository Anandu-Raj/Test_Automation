package GTPL_Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class GTPL_HomePage {
	WebDriver driver;
	WebDriverWait wait;

	public GTPL_HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By EditAccount = By.xpath("//*[text()='Edit Account']");
	
	public void checkURL() {
		String actualUrl = "https://demo.guru99.com/V1/html/Managerhomepage.php";
		String expectedUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
		System.out.println("------------------------------------------------");
		System.out.println("Title Matched " + driver.getCurrentUrl());
	}

	public void checkModule() {
		wait = new WebDriverWait(driver, 20);
		WebElement Editaccount = wait.until(ExpectedConditions.visibilityOfElementLocated(EditAccount));
		String actualText = "Edit Account";
		String expectedText = Editaccount.getText();
		Assert.assertEquals(expectedText, actualText);
		System.out.println("------------------------------------------------");
		System.out.println("Text Matched " + Editaccount.getText());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Editaccount);
		//driver.switchTo().alert().dismiss();
		WebElement ads = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='dismiss-button']")));
		ads.click();
	}
}

