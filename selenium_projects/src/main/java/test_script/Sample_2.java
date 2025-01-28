package test_script;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sample_2 {
public WebDriver driver;// globally declaring 

public void initializebrowser(String browsertype)//method for browser initializing
{
	try {
		switch(browsertype)
		{
		case "chrome":
			driver=new ChromeDriver();
		break;
		
		case "edge":
			driver= new EdgeDriver();
		break;
		
		default:
			throw new IllegalArgumentException("invalid browser type"+browsertype);
		}
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();
	}catch(Exception e) {
		System.out.println("error initializing web browser"+e.getMessage());
	}
		
	
}
public void quitandclose(String modeofexit)

{
if(modeofexit=="closelastwindow")	
{
	driver.close();
	
}else
{
	driver.quit();
	
}
	

}
public static void main(String args[])
{
	Sample_2 obj=new Sample_2();
	Scanner s=new Scanner(System.in);
	System.out.println("Input the browser type :");
	String BT=s.nextLine();
	System.out.println("Web browser loading......");
	obj.initializebrowser(BT);
	obj.quitandclose("closelastwindow");

	
}
}