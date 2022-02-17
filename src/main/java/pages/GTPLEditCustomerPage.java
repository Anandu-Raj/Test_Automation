package pages;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GTPLEditCustomerPage {
	WebDriver driver;
	WebDriverWait wait;

	public GTPLEditCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	By edCusForm = By.xpath("//*[text()='Edit Customer Form']");
	By cusID = By.xpath("//*[text()='Customer ID']");
	By cusIDInput = By.xpath("//*[@name='cusid']");
	By submit = By.xpath("//*[@name='AccSubmit']");
	By reset = By.xpath("//*[@name='res']");
	By alert = By.xpath("//*[@id='message14']");

	public void editCustomerPageTitle(String ECPtitle) {
		String actualtitle = ECPtitle;
		String expectedtitle = driver.getTitle();
		Assert.assertEquals(expectedtitle, actualtitle);
		System.out.println("You entered Gtpl Bank Edit Customer Page (TC_EC_003)");
	}

	public void editCustomerFormTitle() {
		wait = new WebDriverWait(driver, 20);
		WebElement editCustomerForm = wait.until(ExpectedConditions.visibilityOfElementLocated(edCusForm));
		Assert.assertEquals(true, editCustomerForm.isDisplayed());
		System.out.println(editCustomerForm.getText() + " title is displayed. (TC_EC_004)");
	}

	public void customerIDTitleAndInput() {
		wait = new WebDriverWait(driver, 20);
		WebElement customerID = wait.until(ExpectedConditions.visibilityOfElementLocated(cusID));
		Assert.assertEquals(true, customerID.isDisplayed());

		WebElement customerIDInput = wait.until(ExpectedConditions.visibilityOfElementLocated(cusIDInput));
		Assert.assertEquals(true, customerIDInput.isDisplayed());

		System.out.println(customerID.getText() + " title and input field for customer ID is displayed. (TC_EC_005)");

		customerIDInput.sendKeys("123");
		System.out.println("User able to click on input field and to enter the value (TC_EC_006)");
	}

	public void SubmitButton() {
		wait = new WebDriverWait(driver, 20);
		WebElement sub = wait.until(ExpectedConditions.visibilityOfElementLocated(submit));
		Assert.assertEquals(true, sub.isDisplayed());
		System.out.println("Submit button is displayed. (TC_EC_007)");

		sub.click();
		System.out.println("User able to click on Submit button. (TC_EC_008)");
		driver.navigate().back();
	}

	public void ResetButton() {
		wait = new WebDriverWait(driver, 20);
		WebElement res = wait.until(ExpectedConditions.visibilityOfElementLocated(reset));
		Assert.assertEquals(true, res.isDisplayed());
		System.out.println("Reset button is displayed. (TC_EC_009)");

		res.click();
		System.out.println("User able to click on Reset button and able to clear the input field. (TC_EC_010)");
	}

	public void inputFormat() {
		wait = new WebDriverWait(driver, 20);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Customer ID : ");
		String id = sc.nextLine();
		String regex = "[0-9]+";

		if (id.matches(regex)) {
			WebElement customerIDInput = wait.until(ExpectedConditions.visibilityOfElementLocated(cusIDInput));
			customerIDInput.sendKeys(id);
		} else if (!id.matches(regex)) {
			WebElement customerIDInput = wait.until(ExpectedConditions.visibilityOfElementLocated(cusIDInput));
			customerIDInput.sendKeys(id);
			WebElement ErrorMsg1 = wait.until(ExpectedConditions.visibilityOfElementLocated(alert));
			System.out.println(ErrorMsg1.getText() + " (TC_EC_011)");
		} else if(!id.matches("\\s")) {
			WebElement customerIDInput = wait.until(ExpectedConditions.visibilityOfElementLocated(cusIDInput));
			customerIDInput.sendKeys(id);
			WebElement ErrorMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(alert));
			System.out.println("Test failed - Error message bot displaying (TC_EC_011)");
		}
	}
}
