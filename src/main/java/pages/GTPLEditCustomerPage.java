package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GTPLEditCustomerPage {
	WebDriver driver;
	WebDriverWait wait;
	
	public GTPLEditCustomerPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void editCustomerPageTitle(String ECPtitle) {
		String actualtitle = ECPtitle; 
		String expectedtitle = driver.getTitle(); 
		Assert.assertEquals(expectedtitle,actualtitle ); 
		System.out.println("You entered Gtpl Bank Edit Customer Page");
	}
}
