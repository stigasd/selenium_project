package test_script;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Obsqura_testing_addition {
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();//to set webdriver
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement id1= driver.findElement(By.id("value-a"));
		id1.sendKeys("10");
		WebElement id2= driver.findElement(By.id("value-b"));
		id2.sendKeys("4");
		WebElement id3= driver.findElement(By.id("button-two"));
		
		id3.sendKeys(Keys.ENTER);


		//driver.quit();
	}

}
