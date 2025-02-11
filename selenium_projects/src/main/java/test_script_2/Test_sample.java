package test_script_2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import test_script.Base;

public class Test_sample extends Base {
	public void showmsg()
	{   try {
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement input=driver.findElement(By.id("single-input-field"));
		input.sendKeys("Hello");
		WebElement show=driver.findElement(By.id("button-one"));
		show.click();
		
	}catch(Exception e)
	{
		System.out.println("error program method show msg interupted"+e.getMessage());
		
	}finally
	{
		System.out.println("program_1 executed without any error");
	}
	}
		
		public void sum()
		{
			try {
			
		WebElement id1= driver.findElement(By.id("value-a"));
		id1.sendKeys("10");
		WebElement id2= driver.findElement(By.id("value-b"));
		id2.sendKeys("4");
		WebElement id3= driver.findElement(By.id("button-two"));
		id3.click();
	}catch(Exception e)
	{
		System.out.println("Error program interupted "+e.getMessage());
	}finally
	{
		System.out.println("program_2 executed  without any error");
	}
	
	}
	
	
	public static void main(String args[])
	{
Test_sample obj1 =new Test_sample();
obj1.initializerBrowser();
obj1.showmsg();
obj1.sum();
//obj1.driverquitandclose();
	
	}
}
