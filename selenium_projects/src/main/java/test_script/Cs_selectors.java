package test_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Cs_selectors extends Base {
	
	public void tagandid()
	{
		//syntax : tag#id
		WebElement tagid=driver.findElement(By.cssSelector("button#button-one"));
		WebElement tag1d2=driver.findElement(By.cssSelector("button#button-two"));
		WebElement tagid3=driver.findElement(By.cssSelector("button#button-two"));
		
	}
	public void tagandclass()
	{
		//syntax: tag.class
		WebElement tagclass1=driver.findElement(By.cssSelector("input.form-control"));
		WebElement tagclass2=driver.findElement(By.cssSelector("textarea.form-control"));
		
	}
	public void tagandattribute()
	{
		//syntax: tag[attribute=value]
		WebElement tagandattri1=driver.findElement(By.cssSelector("button[id=\'button-one\']"));
		WebElement tagandattri2=driver.findElement(By.cssSelector("button[id=\'button-two\']"));
		WebElement tagandattri3=driver.findElement(By.cssSelector("select.[id=\'single-input-field\']"));
	}
	public void tagclassandattribute()
	{
		//syntax: tag.classname[attribute=value]
		WebElement tagcal1=driver.findElement(By.cssSelector("input.form-control[id='subject']"));
		WebElement tagcal2=driver.findElement(By.cssSelector("input.form-control[id='subject']"));
	}
	public static void main(String args[])
	{
		Cs_selectors selectors=new Cs_selectors();
		selectors.tagandid();
		selectors.tagandclass();
		selectors.tagandattribute();
		selectors.tagclassandattribute();
		
	}

}
