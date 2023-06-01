package selenium.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		WebDriver driver = new EdgeDriver();
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		String OriTitle = "Home";
		System.out.println(title);
		if(OriTitle.equals(title))
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}
		WebElement find = driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a"));
		System.out.println();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(2000);
		find.click();
		String CurTitle = "Shop";
		String t1 = driver.getTitle();
		System.out.println(t1);
		if(CurTitle.equals(t1))
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}
		Thread.sleep(5000);
		driver.quit();
    }
}
