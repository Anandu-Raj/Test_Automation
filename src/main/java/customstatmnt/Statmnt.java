package customstatmnt;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class Statmnt
{
	
	public WebDriver driver;
	public WebDriverWait wait;
	By title=By.xpath("//*[text()='Customized Statement Form']");
	By accnt = By.xpath("//*[@name='accountno']");
	By alert1=By.xpath("//*[@id='message2']");
	By alert2=By.xpath("//*[text()='Account Number must not be blank']");
	By fromDate=By.xpath("//*[text()='From Date ']");
	By fromDate1=By.xpath("//*[@name='fdate']");
	
	
	public Statmnt(WebDriver driver) 
	{
		this.driver=driver;
		wait = new WebDriverWait(driver, 10);
	}
	public void title()
	{
		Assert.assertTrue(driver.findElement(title).isDisplayed());
		System.out.println("Title is displayed");
	}
	public void accnt()
	{
		Assert.assertTrue(driver.findElement(accnt).isDisplayed());
		System.out.println("Account Number field is displayed");
		wait = new WebDriverWait(driver, 10); 
	    Scanner sc = new Scanner(System.in);  //@SuppressWarnings("resource") 
		System.out.println("Enter the Account Number : ");
		String account = sc.nextLine();
		String regex = "[0-9]{1,10}";    //^\\d{9,18}$,,,,//[0-9]+
		
		if(account.matches(regex) &&  (account.length()<=10) )
		{
			WebElement accNo = wait.until(ExpectedConditions.visibilityOfElementLocated(accnt)); 
			accNo.sendKeys(account); 
		}
		else if(account.length()>10)
		{
			System.out.println("Account Number can not exceed 10 digits");
		}
		else if(account.isBlank())
		{
			WebElement accNo = wait.until(ExpectedConditions.visibilityOfElementLocated(accnt)); 
			accNo.sendKeys(account); 
			WebElement alertnull = wait.until(ExpectedConditions.visibilityOfElementLocated(alert2)); 
	  		System.out.println(alertnull.getText());
		}
		else if (!account.matches(regex)) 
		{
		WebElement accNo = wait.until(ExpectedConditions.visibilityOfElementLocated(accnt)); 
		accNo.sendKeys(account); 
		WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(alert1)); 
  		System.out.println(alert.getText());
		}}
	public void fromdt()
	{
		Assert.assertTrue(driver.findElement(fromDate).isDisplayed());
		System.out.println("From Date is displayed");
//		wait = new WebDriverWait(driver, 10); 
//	    Scanner sc = new Scanner(System.in);  //@SuppressWarnings("resource") 
//		System.out.println("Enter the From Date: ");
//		String fromD = sc.nextLine();
//		String regex = "[0-9]{1,10}";
//		
	}
	}
