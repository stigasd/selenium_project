package test_script_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import test_script.Base;

public class Dropdown extends Base {
	public void dropdown_handling()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		
		WebElement colour=driver.findElement(By.id("single-input-field"));
		Select dropdown=new Select(colour);   //select is a class so mouseover and import
		dropdown.selectByValue("Red");
		dropdown.selectByVisibleText("Red");
		dropdown.selectByIndex(2);
		
		
		
		
		WebElement twoinput=driver.findElement(By.cssSelector("select[multiple=\"multiple\"]"));
		
		
		WebElement firstselected=driver.findElement(By.id("button-first"));
		firstselected.click();
		
		WebElement allselected=driver.findElement(By.id("button-all"));
		allselected.click();
	}

	public static void main(String[] args) {
		Dropdown drop=new Dropdown();
		drop.initializerBrowser();
		drop.dropdown_handling();
		//drop.driverquitandclose();
		

	}

}
