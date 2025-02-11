package test_script_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test_script.Base;

public class Checkbox_demo extends Base{
	
public void checkbox()
{


	    driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement check=driver.findElement(By.id("gridCheck"));
		if(check.isSelected())
		{
			System.out.println("check box is selected");
		}else
		{
			
			System.out.println("Selecting check box");
			check.click();
		}
		
		
	
		WebElement checkall=driver.findElement(By.xpath("//input[contains(@id,'button-two')]"));
		checkall.click();
		
		
		
}
public static void main(String args[])
{
	Checkbox_demo check=new Checkbox_demo();
	check.initializerBrowser();
	check.checkbox();
	//check.driverquitandclose();
}
}
