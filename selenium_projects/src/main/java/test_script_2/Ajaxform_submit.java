package test_script_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test_script.Base;

public class Ajaxform_submit extends Base {
	
	public void ajaxform()
	{   
		driver.navigate().to("https://selenium.qabible.in/ajax-form-submit.php");
		WebElement subject=driver.findElement(By.cssSelector("input[placeholder=\"Subject\"]"));
		subject.sendKeys("haha");
		
		WebElement description=driver.findElement(By.id("description"));
		
		description.sendKeys("hehe");
		WebElement submit=driver.findElement(By.cssSelector("input[value=\"Submit\"]"));
		submit.click();
	

}
public static void main(String args[])
{
	Ajaxform_submit submit=new Ajaxform_submit();
	submit.initializerBrowser();
	submit.ajaxform();
	//submit.driverquitandclose();
}
}
