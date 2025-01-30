package test_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Practice_locators extends Practice_base
{
	public void id()
	{
		WebElement id1=driver.findElement(By.id("validationCustom01"));
	
	}
	public void classname()
	{
		
		
	}
public void name()
{
	
}
public void linktext()
{
	
}
public void partiallinktext()
{
	
}
public static void main(String args[])
{
	Practice_locators locators=new Practice_locators();
	locators.id();
	locators.classname();
	locators.name();
	locators.linktext();
	locators.partiallinktext();
	
	
}
}
