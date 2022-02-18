package GTPLBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class MiniStatement {
	WebDriver driver;
	WebDriverWait wait;
	
	By MiniStatement = By.xpath("//*[text()='Mini Statement']");
	
	public MiniStatement(WebDriver driver) {
		this.driver = driver;
	}
	public void checkURLstatus() {
		driver.navigate().to("https://demo.guru99.com/V1/html/MiniStatementInput.php");
		String ActualUrl = driver.getCurrentUrl();
		String ExpectedUrl = "URL id loaded";
		Assert.assertEquals(ExpectedUrl, ActualUrl);
	}
}

}
