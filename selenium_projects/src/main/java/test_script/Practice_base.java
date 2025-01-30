package test_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_base {
	public WebDriver driver; //this is globally declared to get access to all methods
	public void initializerBrowser() //method
	{
		driver=new ChromeDriver();//driver loading
		driver.get("https://www.adidas.co.in/");// to launch url
	    driver.manage().window().maximize();//to maximize the web window
	}
	public void driverquitandclose()
	{
		driver.quit();//to quit the window
	}
	public static void main(String args[])
	{
		Practice_base practice_base=new Practice_base();
		practice_base.initializerBrowser();
		practice_base.driverquitandclose();
	}
}