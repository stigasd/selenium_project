package test_script_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test_script.Base;

public class Formsubmit_demo extends Base {
	
	public void userdetails()
	{
		
		driver.navigate().to("https://selenium.qabible.in/form-submit.php");
		
		
		try {
			
		
		WebElement firstname=driver.findElement(By.id("validationCustom01"));
		firstname.sendKeys("Arun");
		WebElement secondname=driver.findElement(By.id("validationCustom02"));
		secondname.sendKeys("Darsh");
		WebElement userid=driver.findElement(By.id("validationCustomUsername"));
		userid.sendKeys("stigASD@gmail.com");
		WebElement city=driver.findElement(By.id("validationCustom03"));
		city.sendKeys("Thiruvanathapuram");
		WebElement state=driver.findElement(By.id("validationCustom04"));
		state.sendKeys("Kerala");
		WebElement zip=driver.findElement(By.id("validationCustom05"));
		zip.sendKeys("695033");
		WebElement termsagreement=driver.findElement(By.id("invalidCheck"));
		termsagreement.click();
		WebElement submit=driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		submit.click();
		
		
		
		}catch(Exception e)
		{
			System.out.println("error program interupted"+e.getMessage());
		}finally
		{
			System.out.println("program executed without errors");
		}
				
		

}
public static void main(String args[])
{
	Formsubmit_demo form=new Formsubmit_demo();
	form.initializerBrowser();
	form.userdetails();
	//form.driverquitandclose();
}

}