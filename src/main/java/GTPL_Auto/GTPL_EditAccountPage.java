package GTPL_Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class GTPL_EditAccountPage {

	WebDriver driver;
	WebDriverWait wait;

	public GTPL_EditAccountPage(WebDriver driver) {
		this.driver = driver;
	}

	By Heading = By.xpath("//*[text()='Edit Account Form']");
	By AccountNo = By.xpath("//*[text()='Account No']");
	By SubmitButton = By.xpath("//*[@name='AccSubmit']");
	By ResetButton = By.xpath("//*[@name='res']");
	By HomeLink = By.xpath("//*[text()='Home']");

	public void display() {
		// TODO Auto-generated method stub
		wait = new WebDriverWait(driver, 20);

		WebElement heading = wait.until(ExpectedConditions.visibilityOfElementLocated(Heading));
		String expectedHeading = "Edit Account Form";
		String actualHeading = heading.getText();
		Assert.assertEquals(expectedHeading, actualHeading);
		System.out.println("------------------------------------------------");
		System.out.println("Heading Matched " + heading.getText());

		WebElement accountNo = wait.until(ExpectedConditions.visibilityOfElementLocated(AccountNo));
		String expectedAccountNo = "Edit Account Form";
		String actualAccountNo = accountNo.getText();
		Assert.assertEquals(expectedAccountNo, actualAccountNo);
		System.out.println("------------------------------------------------");
		System.out.println("Account No found " + accountNo.getText());

		WebElement submitButton = wait.until(ExpectedConditions.visibilityOfElementLocated(SubmitButton));
		String expectedSubmitButton = "Edit Account Form";
		String actualSubmitButton = submitButton.getText();
		Assert.assertEquals(expectedSubmitButton, actualSubmitButton);
		System.out.println("------------------------------------------------");
		System.out.println("Button Found " + submitButton.getText());

		WebElement resetButton = wait.until(ExpectedConditions.visibilityOfElementLocated(ResetButton));
		String expectedResetButton = "Edit Account Form";
		String actualResetButton = resetButton.getText();
		Assert.assertEquals(expectedResetButton, actualResetButton);
		System.out.println("------------------------------------------------");
		System.out.println("Rest Found " + resetButton.getText());

		WebElement homeLink = wait.until(ExpectedConditions.visibilityOfElementLocated(HomeLink));
		String expectedHomeLink = "Edit Account Form";
		String actualHomeLink = homeLink.getText();
		Assert.assertEquals(expectedHomeLink, actualHomeLink);
		System.out.println("------------------------------------------------");
		System.out.println("Rest Found " + homeLink.getText());
	}

}
