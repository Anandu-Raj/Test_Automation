package customstatmnt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Statmnt
{
	
	public WebDriver driver;
	public WebDriverWait wait;
	By accnt = By.xpath("//*[@name='accountno']");
//	By pass = By.xpath("//*[@name='password']");
//	By sbmt = By.xpath("//*[@name='btnLogin']");

	public Statmnt(WebDriver driver) 
	{
		this.driver=driver;
		wait = new WebDriverWait(driver, 10);
	}
	public void accnt(String acc)
	{
		
		WebElement title=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Customized Statement Form']")));
		if(title.isDisplayed())
		{
			System.out.println("title is displayed");
		}
		else
		{
			System.out.println("title not displayed");
		}
		WebElement account=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Account No']")));
		if(account.isDisplayed())
		{
			System.out.println("Account filed is displayed");
		}
		else
		{
			System.out.println("Account filed not displayed");
		}
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(accnt)).sendKeys(acc);
	}
	
}
