package test_script;

public class BrowserCommands extends Base {
	public void browsercommands()
	{
		
		String Title=driver.getTitle();// to get title
		System.out.println(Title);
		String url=driver.getCurrentUrl();// to get current url
		System.out.println(url);
		String page=driver.getPageSource();//to get html code
		System.out.println(page);
	}
public static void main(String args[])
{
	BrowserCommands browsercommands=new BrowserCommands();
	browsercommands.initializerBrowser();
	browsercommands.browsercommands();
	//browsercommands.driverquitandclose();
}
}
