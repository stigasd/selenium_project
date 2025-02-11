package test_script_2;

import test_script.Base;

public class Automating_obsqura_site extends Base
{
	public void auto()
	{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	
	
	

}
public static void main(String args[])
{
	Automating_obsqura_site automate=new Automating_obsqura_site();
	automate.initializerBrowser();
	automate.auto();
	automate.driverquitandclose();
	
}
}