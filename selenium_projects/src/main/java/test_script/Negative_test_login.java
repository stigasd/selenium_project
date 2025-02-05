package test_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Negative_test_login {
	
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
		try {
			String Title=driver.getTitle();
			System.out.println(Title);
			String url=driver.getCurrentUrl();
			System.out.println(url);
			WebElement user=driver.findElement(By.id("username"));
			user.sendKeys("incorrectuser");
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("Password123");
			
			WebElement submit=driver.findElement(By.className("btn"));
			submit.click();
			
		/*	WebElement invalidmsg=driver.findElement(By.linkText("Your username is invalid!"));	
			String check=invalidmsg.getText();
			System.out.println(check);
			if(check=="Your username is invalid!");
			{
				System.out.println("Error message verified");
				System.out.println("Error message is:"+check);
			}
			*/
		
			
		}catch(Exception e)
		{
			System.out.println("Error testing" +e.getMessage());
		}finally
		{
			System.out.println("closing browser");
			driver.quit();
		}
		
	}

}
