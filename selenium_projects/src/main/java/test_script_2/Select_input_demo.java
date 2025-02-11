package test_script_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import test_script.Base;

public class Select_input_demo extends Base {
	
	public void selectcolour()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		
		
			
		
		WebElement colour=driver.findElement(By.id("single-input-field"));  //locate  dropdown element
		Select dropdown=new Select(colour);                  //creat object of select
		//dropdown.selectByContainsVisibleText("Red");
		WebElement twoinput=driver.findElement(By.cssSelector("select[multiple=\"multiple\"]"));
		Select dropdown2=new Select(twoinput);
		if(dropdown2.isMultiple())
		{
		dropdown2.selectByContainsVisibleText("Yellow");
		dropdown2.selectByContainsVisibleText("Green");
		dropdown2.selectByContainsVisibleText("Red");
		}
		
		
		
		WebElement firstselected=driver.findElement(By.id("button-first"));
		firstselected.click();
		
		WebElement allselected=driver.findElement(By.id("button-all"));
		allselected.click();
		
	}

public static void main(String args[])
{
	Select_input_demo inputdemo=new Select_input_demo();
	inputdemo.initializerBrowser();
	inputdemo.selectcolour();
	
	
	
	
	
	
	
}
}