package test_script;

public class NavigationCommands extends Base {
	public void navigationcommands()
	{
		driver.navigate().to("https://www.facebook.com/");// to navigate from current page to another page
		driver.navigate().back();// to navigate back to page
		driver.navigate().forward();// to again go to facbook page
		driver.navigate().refresh();//to refresh the facebook page
	}
public static void main(String args[])
{
	NavigationCommands navigationcommands=new NavigationCommands();
	navigationcommands.initializerBrowser();
	navigationcommands.navigationcommands();
	navigationcommands.driverquitandclose();
}
}
