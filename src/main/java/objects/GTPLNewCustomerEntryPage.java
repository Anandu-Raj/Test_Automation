package objects;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GTPLNewCustomerEntryPage {
	WebDriver driver;
	WebDriverWait wait;

	public GTPLNewCustomerEntryPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By CustomerName = By.xpath("//*[text()='Customer Name']");
	By Gender = By.xpath("//*[text()='Gender']");
	By DateOfBirth = By.xpath("//*[text()='Date of Birth ']");
	By Address = By.xpath("//*[text()='Address']");
	By City = By.xpath("//*[text()='City']");
	By State = By.xpath("//*[text()='State']");
	By PIN = By.xpath("//*[text()='PIN']");
	By TelephoneNumber = By.xpath("//*[text()='Telephone Number']");
	By Email = By.xpath("//*[text()='E-mail']");
	By SubmitButton = By.xpath("//*[@name='sub']");
	By Reset = By.xpath("//*[@name='res']");
	By Home = By.xpath("//*[text()='Home']");
	
	public void NewCustomerEntryPageDisplay() {
		wait = new WebDriverWait(driver, 20);
		WebElement customerName = wait.until(ExpectedConditions.visibilityOfElementLocated(CustomerName));
		String actualCustomerNameText = "Customer Name*";
		String expectedCustomerNameText = customerName.getText();
		Assert.assertEquals(expectedCustomerNameText, actualCustomerNameText);
		System.out.println("Customer Name field is displayed");
		
		WebElement gender = wait.until(ExpectedConditions.visibilityOfElementLocated(Gender));
		String actualGenderText = "Gender*";
		String expectedGenderText = gender.getText();
		Assert.assertEquals(expectedGenderText, actualGenderText);
		System.out.println("Gender field is displayed");
		
		WebElement dateOfBirth = wait.until(ExpectedConditions.visibilityOfElementLocated(DateOfBirth));
		String actualDateOfBirthText = "Date of Birth *";
		String expectedDateOfBirthText = dateOfBirth.getText();
		Assert.assertEquals(expectedDateOfBirthText, actualDateOfBirthText);
		System.out.println("Date of Birth field is displayed");
		
		WebElement address = wait.until(ExpectedConditions.visibilityOfElementLocated(Address));
		String actualAddressText = "Address*";
		String expectedAddressText = address.getText();
		Assert.assertEquals(expectedAddressText, actualAddressText);
		System.out.println("Address field is displayed");
		
		WebElement city = wait.until(ExpectedConditions.visibilityOfElementLocated(City));
		String actualCityText = "City*";
		String expectedCityText = city.getText();
		Assert.assertEquals(expectedCityText, actualCityText);
		System.out.println("City field is displayed");
		
		WebElement state = wait.until(ExpectedConditions.visibilityOfElementLocated(State));
		String actualStateText = "State*";
		String expectedStateText = state.getText();
		Assert.assertEquals(expectedStateText, actualStateText);
		System.out.println("State field is displayed");
		
		WebElement pin = wait.until(ExpectedConditions.visibilityOfElementLocated(PIN));
		String actualPinText = "PIN*";
		String expectedPinText = pin.getText();
		Assert.assertEquals(expectedPinText, actualPinText);
		System.out.println("PIN field is displayed");
		
		WebElement telephoneNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(TelephoneNumber));
		String actualTelephoneNumberText = "Telephone Number";
		String expectedTelephoneNumberText = telephoneNumber.getText();
		Assert.assertEquals(expectedTelephoneNumberText, actualTelephoneNumberText);
		System.out.println("Telephone Number field is displayed");
		
		WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(Email));
		String actualEmailText = "E-mail*";
		String expectedEmailText = email.getText();
		Assert.assertEquals(expectedEmailText, actualEmailText);
		System.out.println("E-mail field is displayed");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement submit = wait.until(ExpectedConditions.visibilityOfElementLocated(SubmitButton));
		js.executeScript("arguments[0].scrollIntoView();", submit);
		String actualSubmitText = "Submit";
		String expectedSubmitText = submit.getText();
		System.out.println(expectedSubmitText);
		//Assert.assertEquals(expectedSubmitText, actualSubmitText);
		//System.out.println("Submit button is displayed");
		
		WebElement reset = wait.until(ExpectedConditions.visibilityOfElementLocated(Reset));
		String actualResetText = "Reset";
		String expectedResetText = reset.getText();
		Assert.assertEquals(expectedResetText, actualResetText);
		System.out.println("Reset button is displayed");
		
		WebElement home = wait.until(ExpectedConditions.visibilityOfElementLocated(Home));
		String actualHomeText = "Home";
		String expectedHomeText = home.getText();
		Assert.assertEquals(expectedHomeText, actualHomeText);
		System.out.println("Home link is displayed");
		
		
	}
	
	public void NewCustomerEntryPageTitle() {
		String actualTitle = "Gtpl Bank New Customer Entry Page";
		String expectedTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println("The title of the page is displayed as Gtpl Bank New Customer Entry Page");
	}
}
