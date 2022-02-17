package GTPL_Auto;

import java.util.Scanner;
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

	By accountNo = By.xpath("//*[@name='accountno']");
	By alert = By.xpath("//*[@id='message2']");

	public void display() {
		// TODO Auto-generated method stub
		wait = new WebDriverWait(driver, 20);

		WebElement heading = wait.until(ExpectedConditions.visibilityOfElementLocated(Heading));
		Assert.assertEquals(true, heading.isDisplayed());
		System.out.println("------------------------------------------------");
		System.out.println(" > Heading is displayed" + heading.getText());

		WebElement accountNo = wait.until(ExpectedConditions.visibilityOfElementLocated(AccountNo));
		Assert.assertEquals(true, accountNo.isDisplayed());
		System.out.println("------------------------------------------------");
		System.out.println(" > Account No is displayed");

		WebElement submitButton = wait.until(ExpectedConditions.visibilityOfElementLocated(SubmitButton));
		Assert.assertEquals(true, submitButton.isDisplayed());
		System.out.println("------------------------------------------------");
		System.out.println(" > Submit Button is displayed");

		WebElement resetButton = wait.until(ExpectedConditions.visibilityOfElementLocated(ResetButton));
		Assert.assertEquals(true, resetButton.isDisplayed());
		System.out.println("------------------------------------------------");
		System.out.println(" > Reset Button is displayed");

		WebElement homeLink = wait.until(ExpectedConditions.visibilityOfElementLocated(HomeLink));
		Assert.assertEquals(true, homeLink.isDisplayed());
		System.out.println("------------------------------------------------");
		System.out.println(" > Home Link is displayed");
	}

	public void editAccount() {
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter Account No > ");

		String accno = reader.next();
		String regex = "[0-9]+";

		if (accno.matches(regex)) {
			WebElement AccountNo = wait.until(ExpectedConditions.visibilityOfElementLocated(accountNo));
			AccountNo.sendKeys(accno);
			WebElement submitButton = wait.until(ExpectedConditions.visibilityOfElementLocated(SubmitButton));
			submitButton.click();
		} else {
			WebElement AccountNo = wait.until(ExpectedConditions.visibilityOfElementLocated(accountNo));
			AccountNo.sendKeys(accno);
			WebElement Alert = wait.until(ExpectedConditions.visibilityOfElementLocated(alert));
			System.out.println("------------------------------------------------");
			System.out.println(" >" + Alert.getText());
		}
	}

	public void resetButton(String accNo) {
		WebElement AccountNo = wait.until(ExpectedConditions.visibilityOfElementLocated(accountNo));
		AccountNo.sendKeys(accNo);
		WebElement resetButton = wait.until(ExpectedConditions.visibilityOfElementLocated(ResetButton));
		resetButton.click();
		System.out.println("------------------------------------------------");
		System.out.println(" > Fields cleared");
	}

	public void homeLink() {
		WebElement homeLink = wait.until(ExpectedConditions.visibilityOfElementLocated(HomeLink));
		homeLink.click();
		System.out.println("------------------------------------------------");
		System.out.println(" > " + driver.getTitle());
	}
}
