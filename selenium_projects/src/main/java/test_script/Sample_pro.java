package test_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.Scanner;
public class Sample_pro {
	public WebDriver driver;
	public void initializerbrowser(String browsertype)
	{
	try {
		switch(browsertype)
		{
		case "chrome":
			driver=new ChromeDriver();
	    break;
			
		case "edge":
			driver=new EdgeDriver();
		break;
			
		default:
			throw new IllegalArgumentException("invalid web browser"+browsertype);
		}
		driver.manage().window().maximize();
		driver.get("https://www.toyota.com/grsupra/");
		driver.get("https://www.netflix.com/in/");
		driver.get("https://www.facebook.com/");
		driver.get("https://www.formula1.com/");
		
	}
	catch(Exception e)
	{
		System.out.println("error initializing we browser"+e.getMessage());
		
	}
	}
	public void quitandclose(String modeofexit)

	{
	if(modeofexit=="closelastwindow")	
	{
		driver.close();
	}
	else
	{
		driver.quit();
	}


}
public static void main(String args[])
{  


	Sample_pro obj=new Sample_pro();
	Scanner s=new Scanner(System.in);
	System.out.println("Input the browser type :");
	String BT=s.nextLine();
	System.out.println("Web browser loading......");
	obj.initializerbrowser(BT);
	obj.quitandclose("closelastwindow");
	
}
}
