package test_script;

public class Practice_browsercommands extends Practice_base 
{
	public void browsercommands()
	{   
		String Title=driver.getTitle();// to get the title
		System.out.println(Title);
		String Url=driver.getCurrentUrl();//to get current url
		System.out.println(Url);
		String Page=driver.getPageSource();//to get  html code
		System.out.println(Page);
		
	}
public static void main(String args[])
{
	Practice_browsercommands practice_browsercommands=new Practice_browsercommands();
	practice_browsercommands.initializerBrowser();
	practice_browsercommands.browsercommands();
	practice_browsercommands.driverquitandclose();
}
}
