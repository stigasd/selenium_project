package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import test_script.Base;

public class Actions_practice extends Base {
	public void action()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		
		WebElement dragN01=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement dropN01=driver.findElement(By.cssSelector("div[id=\"mydropzone\"]"));
		Actions actobj=new Actions(driver);
		//drag and drop
		actobj.dragAndDrop(dragN01, dropN01).build().perform();
		
		
		WebElement rightclick=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
		actobj.contextClick(rightclick).build().perform();
		// rightclick
		
		WebElement mousehover=driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
		actobj.moveToElement(mousehover).build().perform();
		//mouse hover
		
		actobj.doubleClick(mousehover).build().perform();
		//double click
		
		
		
	}

	public static void main(String[] args) {
		Actions_practice obj1=new Actions_practice();
		obj1.initializerBrowser();
		obj1.action();
		
	

	}

}
