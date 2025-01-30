package test_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_test {
	public static void main(String args[]) {
		WebDriver driver=new ChromeDriver();// to set webdriver
		
		driver.get("https://selenium.qabible.in/simple-form-demo.php");// to open the page
		driver.manage().window().maximize();
		WebElement id=driver.findElement(By.id("value-a"));
		id.sendKeys("The Stig"); //sending input
		
		driver.quit();
	}

}
