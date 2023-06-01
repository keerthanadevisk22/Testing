package selenium.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App1 {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		String CurUrl = driver.getCurrentUrl();
		String url = "https://j2store.net/free/";
		System.out.println(url);
		if(CurUrl.equals(url))
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}
		WebElement find = driver.findElement(By.partialLinkText("Clothing (5)"));
//		find.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		find.click();
		System.out.println();
		String url1 = "https://j2store.net/free/index.php/shop?filter_catid=11";
		String CurUrl1 = driver.getCurrentUrl();
		System.out.println(CurUrl1);
		if(CurUrl1.equals(url1))
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
