package Page;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Addaccount 
{
	WebDriver driver;
	WebDriverWait wait;

	public Addaccount(WebDriver driver)
	{
		this.driver = driver;
	}
	By customerid = By.xpath("//*[@name=\"cusid\"]");
	By accounttype = By.xpath("//*[@name=\"selaccount\"]");
	By initialdeposit = By.xpath("//*[@name=\"inideposit\"]");
	By submit = By.xpath("//*[@name=\"button2\"]");
	By reset = By.xpath("//*[@name=\"reset\"]");
	By homelink = By.xpath("//*[text()=\"home\"]");
	public void Customerid_display()
	{
		wait = new WebDriverWait(driver, 20);
		//String regex = "^[A-Z+$]";
        WebElement custid = wait.until(ExpectedConditions.visibilityOfElementLocated(customerid));
        custid.sendKeys("87185");
        String fieldText = custid.getAttribute("value");
        System.out.println(fieldText);
        Assert.assertEquals(true, custid.isDisplayed());
		System.out.println("Customer ID field displayed");
//        assertTrue(fieldText.matches("[a-zA-Z0-9]+")); 
//        System.out.println("Invalid input in ID field");
         if (fieldText.matches("[0-9]+"))
        {
            System.out.println("valid");
        }
        else
        {
        	 System.out.println("Invalid input in ID field ");
        }
        
	}
	
	public void Accounttype_display()
	{
		wait = new WebDriverWait(driver, 20);
        WebElement acctype = wait.until(ExpectedConditions.visibilityOfElementLocated(accounttype));
		Select type =new Select(acctype);
		type.selectByVisibleText("current");
		Assert.assertEquals(true, acctype.isDisplayed());
		System.out.println("Account type field displayed");
		boolean status = type.isMultiple();
		
		if(status){
			System.out.println("Allows multiple selection");
		} else {
			System.out.println("*************Does not allow multiple selection");
		}

	}
	public void Initialdeposit_display()
	{
		wait = new WebDriverWait(driver, 20);
        WebElement inideposit = wait.until(ExpectedConditions.visibilityOfElementLocated(initialdeposit));
        inideposit.sendKeys("500");
        Assert.assertEquals(true, inideposit.isDisplayed());
		System.out.println("Initial deposit field displayed");

        
    }
	public void Submit_display()
	{
		wait = new WebDriverWait(driver, 20);
        WebElement submitbtn = wait.until(ExpectedConditions.visibilityOfElementLocated(submit));
        submitbtn.click();
        Assert.assertEquals(true, submitbtn.isDisplayed());
		System.out.println("Submitt button displayed");
    }
	public void Reset_display()
	{
		wait = new WebDriverWait(driver, 20);
        WebElement clear = wait.until(ExpectedConditions.visibilityOfElementLocated(reset));
        clear.click();
        Assert.assertEquals(true, clear.isDisplayed());
		System.out.println("Clear button displayed");
    }
	
}
