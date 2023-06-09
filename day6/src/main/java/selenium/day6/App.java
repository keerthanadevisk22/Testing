package selenium.day6;


import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	WebDriverManager.edgedriver().setup();
    	WebDriver driver=new EdgeDriver();
    	driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
    	driver.manage().window().maximize();
    	driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Keerthana");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Devi");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("keerthu@gmail.com");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Keerthu@22");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();    	
    }
}
