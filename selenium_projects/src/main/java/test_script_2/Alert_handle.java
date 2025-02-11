package test_script_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test_script.Base;

public class Alert_handle extends Base {  //Alert is a interface in selenium
	
	public void simple_alert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		
		WebElement click1=driver.findElement(By.cssSelector("button[onclick=\"jsAlert()\"]"));
		click1.click();
		driver.switchTo().alert().accept();
		
	}
	
	
	public void confirmation_alert()
	{
		WebElement confirmclick=driver.findElement(By.cssSelector("button[onclick=\"jsConfirm()\"]"));
		confirmclick.click();
		driver.switchTo().alert().dismiss();  //to cancel driver.switchTo.alert.dismiss
	}
	
	
	//prompt
	public void prompt_alert()
	{
		WebElement promptclick=driver.findElement(By.cssSelector("button[onclick=\"jsPrompt()\"]"));
		promptclick.click();
		driver.switchTo().alert().sendKeys("Rio");
		driver.switchTo().alert().accept();
	}
	
	
	


public static void main(String args[])
{
	Alert_handle alert=new Alert_handle();
	alert.initializerBrowser();
	alert.simple_alert();
	alert.confirmation_alert();
	alert.prompt_alert();
}
}
