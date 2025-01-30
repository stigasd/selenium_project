package test_script;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nike_website_test {
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();//to set webdriver
		driver.get("https://www.nike.com/in/");
		driver.manage().window().maximize();
		WebElement id= driver.findElement(By.id("gn-search-input"));
		id.sendKeys("Nike Zoom Mercurial Superfly 9 Elite");
		id.sendKeys(Keys.ENTER);
		driver.navigate().to("https://www.nike.com/in/w/mens-football-shoes-1gdj0znik1zy7ok");
		driver.navigate().back();

		driver.quit();
		
		
		
	}

}
