package test_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Positive_test_login {
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
		try {
			WebElement username=driver.findElement(By.name("username"));
			username.sendKeys("student");
			
			WebElement password =driver.findElement(By.id("password"));
			password.sendKeys("Password123");
			
			WebElement submit=driver.findElement(By.id("submit"));
			submit.click();
			
			String url=driver.getCurrentUrl();
			if(url=="practicetestautomation.com/logged-in-successfully/")
			{
				System.out.println("url verification passed");
			}else
			{
				System.out.println("url verification failed ");
				
			}
			WebElement successmsg=driver.findElement(By.className("post-title"));
			String content=successmsg.getText();
			if (content=="Congratulations"|| content=="successfully logged in");
			{
				System.out.println("success message verified");
			}
		/*else
			{
				System.out.println("success message verification failed");
			}
	/*	WebElement logout=driver.findElement(By.linkText("logout"));
	
		{
			System.out.println("log out button passed");
		}else
		{
			System.out.println("logout button failed");
		}*/
			            
		
			
		}catch(Exception e)
		{
			System.out.println("Test failed:"+e.getMessage());
		}finally
		{
			System.out.println(" this always executes");
			driver.quit();
		}
	

		
	}
}

