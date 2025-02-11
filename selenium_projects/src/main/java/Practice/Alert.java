package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test_script.Base;

public class Alert extends Base{

	public void alertbox()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alertboxclick1=driver.findElement(By.cssSelector("button[class=\"btn btn-success\"]"));
		alertboxclick1.click();
		driver.switchTo().alert().accept();
		
		
	}
	public void alertboxconfirm()
	{
		WebElement confirm=driver.findElement(By.cssSelector("button[onclick=\"jsConfirm()\"]"));
		confirm.click();
		driver.switchTo().alert().accept();
		
	}
	public void prompt()
	{
	
		WebElement promptclick=driver.findElement(By.cssSelector("button[onclick=\"jsPrompt()\"]"));
		promptclick.click();
		
		driver.switchTo().alert().sendKeys("stig");
		driver.switchTo().alert().accept();
		
		
	}
public static void main(String args[])
{
	
	Alert obj=new Alert();
	obj.initializerBrowser();
	obj.alertbox();
	obj.alertboxconfirm();
	obj.prompt();
	
}

}
