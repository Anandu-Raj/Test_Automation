package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Home {
	WebDriver driver;
	WebDriverWait wait;

	public Home(WebDriver driver) {
		this.driver = driver;
	}

	By newcustomer = By.xpath("//*[text()='New Account']");

	public void newcusdisplay() {
		
		wait = new WebDriverWait(driver, 20);
		WebElement newcustomermenu = wait.until(ExpectedConditions.visibilityOfElementLocated(newcustomer));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",  newcustomermenu);
		
		String text =  newcustomermenu.getText();
		System.out.println("Tittle=" + text);
		String acltitle = "New Account";
		System.out.println(acltitle);
		Assert.assertEquals(text, acltitle);
		System.out.println("New Account menu icon verification passed");
		if ( newcustomermenu.isDisplayed()) {
			System.out.println("New customer icon displayed");
		} else {
			System.out.println("New customer icon not displayed");
		}



	}

}
