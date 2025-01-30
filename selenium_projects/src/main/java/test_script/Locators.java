package test_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	//WebElement elementname=driver.findElement(By.Locator("locator value"));//syntax
	public void id()
	{
		WebElement id1=driver.findElement(By.id("single-input-field"));
		//id1.sendKeys("stig");
		WebElement id2=driver.findElement(By.id("value-a"));
		//id2.sendKeys("haha");
		WebElement id3=driver.findElement(By.id("button-one"));
		WebElement id4=driver.findElement(By.id("validationCustom05"));
		WebElement id5=driver.findElement(By.id("button-two"));
	}
	public void classname()
	{
		WebElement class1=driver.findElement(By.className("mb-sec"));
		WebElement class2=driver.findElement(By.className("col-lg-3 col-md-3 col-sm-12 col-xs-12"));
		WebElement class3=driver.findElement(By.className("col-lg-9 col-md-9 col-sm-12 col-xs-12"));
		//WebElement class1=driver.findElement(By.className(""));
	}
	public void name()
	{
		WebElement name1=driver.findElement(By.name("viewport"));
		WebElement name2=driver.findElement(By.name("keywords"));
		WebElement name3=driver.findElement(By.name("author"));
		WebElement name4=driver.findElement(By.name("description"));
		
	}
	public void linktext()
	{
	WebElement link1=driver.findElement(By.linkText("Checkbox Demo"));
	WebElement link2=driver.findElement(By.linkText("Radio Buttons Demo"));	
	WebElement link3=driver.findElement(By.linkText("Ajax Form Submit"));	
		
	}
	public void partiallinktext()
	{
		WebElement partiallink1=driver.findElement(By.partialLinkText("Radio But"));
		WebElement partiallink2=driver.findElement(By.partialLinkText("Bootstrap Da"));
		WebElement partiallink3=driver.findElement(By.partialLinkText("Jquery Da"));
		WebElement partiallink4=driver.findElement(By.partialLinkText("Window Po"));
		
	}
public static void main(String args[])
{
	Locators locators=new Locators();
	locators.id();
	locators.classname();
	locators.name();
	locators.linktext();
	locators.partiallinktext();
	
}
}
