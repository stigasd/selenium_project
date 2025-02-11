package test_script_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test_script.Base;

public class Bootstrap_datepicker extends Base {
	public void datepicker()
	{
		driver.navigate().to("https://selenium.qabible.in/date-picker.php");
		WebElement datefield=driver.findElement(By.xpath("//input[contains(@class,'form-control datepicker')]"));
		datefield.click();
		
		WebElement daypick=driver.findElement(By.cssSelector("td[data-date=\"1739145600000\"]"));
		daypick.click();
		
		
		
		
		WebElement showdate=driver.findElement(By.id("button-one"));
		showdate.click();
		
	

}
public static void main(String args[])
{
	
}
}