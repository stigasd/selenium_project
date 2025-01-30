package test_script;

public class Practice_navigators extends Practice_base
{
	public void navigationcommands()
	{
		driver.navigate().to("https://www.nike.com/in/");//to navigate from current page to another
		driver.navigate().back();// to go back to adidas from nike
		driver.navigate().forward();// to again come back to nike
		driver.navigate().refresh();// to refresh the page nike
	}


public static void main(String args[])
{
	Practice_navigators navigators=new Practice_navigators();
	navigators.initializerBrowser();
	navigators.navigationcommands();
	navigators.driverquitandclose();
}

}