package customstatmnt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mngr 
{
	
	public WebDriver driver;
	public WebDriverWait wait;
	By mngr = By.xpath("//*[text()='Customised Statement']");
	public Mngr(WebDriver driver) 
	{
		this.driver=driver;
		wait = new WebDriverWait(driver, 10);
		}
	public void mngr()
	{
		WebElement menu=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Customised Statement']")));
		if(menu.isDisplayed())
		{
			System.out.println("menu is displayed");
		}
		else
		{
			System.out.println("menu not displayed");
		}
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(mngr)).click();
	}
}
