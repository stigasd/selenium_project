package test_script_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test_script.Base;

public class Radiobuttons_demo extends Base {
	
	
	
	public void radiobutton()
	{
		
			
			
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radio=driver.findElement(By.cssSelector("input#inlineRadio1"));
		
		
		if(radio.isSelected())
		{
			System.out.println("Radio button is selected");
		}
		else
		{
			
			System.out.println("Selecting Radio button");
			radio.click();
	
		}
		
		WebElement pressbutton=driver.findElement(By.id("button-one"));
		pressbutton.click();
		
	}
	
		public void groupradiobutton()
		{
			
			
				
				WebElement groupradio=driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
				groupradio.click();
				WebElement age=driver.findElement(By.id("inlineRadio24"));
				age.click();
				WebElement press=driver.findElement(By.id("button-two"));
				press.click();
		}
				
				
	

public static void main(String args[])
{
	Radiobuttons_demo radiobutton=new Radiobuttons_demo();
	radiobutton.initializerBrowser();
	radiobutton.radiobutton();
	radiobutton.groupradiobutton();
	//radiobutton.driverquitandclose();
	
	
	
}
}