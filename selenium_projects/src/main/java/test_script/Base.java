package test_script;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Base {
	public WebDriver driver;// this is globally declared because we can access all methods and use in another class
	public void initializerBrowser()
	{
		 driver=new ChromeDriver(); //driver loading //can change web browser from here
		driver.get("https://selenium.qabible.in/");// to launch url
		driver.manage().window().maximize(); // to maximize web window
		
	}
	
	
	public void driverquitandclose()
	{
	driver.quit();  // eathelm orenam call cheyanam at a time // will close all windows
	//driver.close(); // will close the last window
	}
		public static void main(String args[])
		{
			Base obj=new Base();
			obj.initializerBrowser();
			obj.driverquitandclose();
	}
	

}
