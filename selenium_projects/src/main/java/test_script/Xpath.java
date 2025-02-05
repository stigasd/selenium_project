package test_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath extends Base {
	public void xpath()
	{
		//tag[@attribute='value']
		
		WebElement path=driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement path2=driver.findElement(By.xpath("//button[@id='button-two']"));
	
	}
	public void contains()
	{
		//tag[contains(@attribute,'value')]
		
		WebElement contain=driver.findElement(By.xpath("//button[contains(@id,'button-o')]"));
		WebElement contain2=driver.findElement(By.xpath("//input[contains(@id,'button-two')]"));
		WebElement contain3=driver.findElement(By.xpath("//button[contains(@class,'btn btn-pr')]"));
		WebElement contain4=driver.findElement(By.xpath("//button[contains(@id,'tton-first')]"));
		
	}
	public void startswith()
	{
		//tag[starts-with(@id,'value')]
		
		WebElement start=driver.findElement(By.xpath("//button[starts-with(@id,'button-all')]"));
		WebElement start2=driver.findElement(By.xpath("//button[starts-with(@id,'button-one')]"));
		WebElement start3=driver.findElement(By.xpath("//button[starts-with(@id,'button-two')]"));
		
	}
	public void text()
	{
		 //tag[text()='text']
		
		WebElement text1=driver.findElement(By.xpath("//a[text()='Simple Form Demo']"));
		WebElement text2=driver.findElement(By.xpath("//a[text()='Radio Buttons Demo']"));
		WebElement text3=driver.findElement(By.xpath("//a[text()='Ajax Form Submit']"));
		WebElement text4=driver.findElement(By.xpath("//a[text()='Form Submit']"));
		
	}
	public void or()
	{
		//tag[@attribute='value'
		
		WebElement or1=driver.findElement(By.xpath("//input[@class='btn btn-primary' or  @type='submit']"));
		WebElement or2=driver.findElement(By.xpath("//input[@id='subject' or  @class='form-control']"));
		WebElement or3=driver.findElement(By.xpath("//textarea[@id='description' or  @class='form-control']"));
		WebElement or4=driver.findElement(By.xpath("//button[@type='submit' or  @class='btn btn-primary']"));
		
		
	}
	public void and()
	{
		//tag[@attribute='value'
		
		WebElement and1=driver.findElement(By.xpath("//button[@id='downloadButton'  and  @class='ui-button ui-corner-all ui-widget']"));
		WebElement and2=driver.findElement(By.xpath("//button[@id='button-one'  and   @class='btn btn-primary']"));
		WebElement and3=driver.findElement(By.xpath("//input[@id='single-input-field2'  and  @class='form-control']"));
		WebElement and4=driver.findElement(By.xpath("//input[@id='single-input-field'  and  @class='form-control datepicker']"));
		
		
		
		
	}


public static void main(String args[])
{
	
}
}