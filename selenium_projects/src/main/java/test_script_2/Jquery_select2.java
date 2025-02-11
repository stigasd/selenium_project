package test_script_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test_script.Base;

public class Jquery_select2 extends Base {
	public void dropdown_select2()
	{
		driver.navigate().to("https://selenium.qabible.in/jquery-select.php");
		WebElement searchbox_dropdown=driver.findElement(By.cssSelector("span[id=\"select2-uyyw-container\"]"));
		
		WebElement multiplevalues=driver.findElement(By.cssSelector("span[aria-activedescendant=\"select2-states-nb-result-77wm-AK\"]"));
		
		WebElement states=driver.findElement(By.id("select2-yr0w-container"));
		
		
	}
	
	


public static void main(String args[])
{
	Jquery_select2 obj1=new Jquery_select2();
	obj1.initializerBrowser();
	obj1.dropdown_select2();
	//obj1.driverquitandclose();
	
}
}
