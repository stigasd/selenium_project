package test_script_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test_script.Base;

public class Table_handling extends Base {
	
	public void tableprinting()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tableprint=driver.findElement(By.xpath("//table[@id=\"dtBasicExample\"]"));
		System.out.println(tableprint.getText());
		
		
	}
	public void printrow()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement rowprint=driver.findElement(By.xpath("//table[@id=\"dtBasicExample\"]/tbody/tr[2]"));
		System.out.println(rowprint.getText());
		
	}
	public void cellprint()
	{   driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement cellprint=driver.findElement(By.xpath("//table[@id=\"dtBasicExample\"]/tbody/tr[2]/td[3]"));
		System.out.println(cellprint.getText());
		
		
	}
	public void columnprint()
	{   driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> columnprint=driver.findElements(By.xpath("//table[@id=\"dtBasicExample\"]/tbody/tr/td[5]"));
		for(WebElement list:columnprint) //for each loop
		{
			System.out.println(list.getText());
		}
		
		
	}
	


public static void main(String args[])
{
	Table_handling table=new Table_handling();
	table.initializerBrowser();
	table.tableprinting();
	table.printrow();
	table.cellprint();
	table.columnprint();
	
	
}
}
