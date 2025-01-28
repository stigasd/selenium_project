package test_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public WebDriver testing;
	
	//globally declare web driver
	public void initializerbrowser()//method to initialize browser
	{
		testing=new ChromeDriver(); //to choose browser
		testing.get("https://www.youtube.com/"); // to open url
		testing.manage().window().maximize();// maximize window
	}
	public void driverquitandclose()// method to quit browser
	{
		testing.quit();
		
	}
public static void main(String args[])
{
	Sample obj=new Sample();
	obj.initializerbrowser();
	obj.driverquitandclose();
}
}

