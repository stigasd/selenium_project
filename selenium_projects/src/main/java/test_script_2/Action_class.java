package test_script_2;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import test_script.Base;

public class Action_class extends Base {
	public void action()
	{
	driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
	WebElement drag=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
	WebElement drop=driver.findElement(By.cssSelector("div[id=\"mydropzone\"]"));
	
	Actions action=new Actions(driver);
	//drag and drop
	action.dragAndDrop(drag, drop).build().perform(); 
	
	WebElement drag2=driver.findElement(By.xpath("//span[text()='Draggable n°4']")); 
	//right click
	action.contextClick(drag2).build().perform();

	WebElement drag3=driver.findElement(By.xpath("//span[text()='Draggable n°3']")); 
	//mouse hover
	action.moveToElement(drag3).build().perform();

		
	}
	
	


public static void main(String args[])
{
	Action_class actionobj  = new Action_class();
	actionobj.initializerBrowser();
	actionobj.action();
	
	
}
}
