package test_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Demo_automation {
    public static void main(String args[]) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();

        String Title = driver.getTitle();
        System.out.println(Title);
        String url = driver.getCurrentUrl();
        System.out.println(url);

        driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
        driver.navigate().back();
        
        WebElement tagclassandattributes=driver.findElement(By.cssSelector("div.ui-autocomplete-multiselect.ui-state-default.ui-widget[id='msdd']"));
        System.out.println(tagclassandattributes);
      //  WebElement tagclassandattributes2=driver.findElement(By.cssSelector("select.form-controlng-pristine ng-valid ng-touched[id='Skills']"));
       
        WebElement tagandid=driver.findElement(By.cssSelector("input#secondpassword"));
        System.out.println(tagandid);
       
        WebElement tagandclass=driver.findElement(By.cssSelector("span.select2-selection.select2-selection--single"));
        System.out.println(tagandclass);
        
        WebElement tagandattributes=driver.findElement(By.cssSelector("select[id='Skills']"));
        System.out.println(tagandattributes);
        
        WebElement id=driver.findElement(By.id("checkbox1"));
        System.out.println(id);
        
       // WebElement classs=driver.findElement(By.className("select2-selection select2-selection--single"));
     //  System.out.println(classs);
         
        driver.quit();
    }
}
