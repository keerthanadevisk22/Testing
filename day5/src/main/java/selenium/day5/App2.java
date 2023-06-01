package selenium.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App2 {
	public static void main(String args[]) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		WebElement find = driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a"));
		System.out.println();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(2000);
		find.click();
		WebElement clothone=driver.findElement(By.xpath("//*[@id=\"akeeba-renderjoomla\"]/div/div/div[1]/div[1]/div[1]/div/h2/a"));
		String nameofone=clothone.getText();
		System.out.println(nameofone);
		WebElement clothtwo=driver.findElement(By.xpath("//*[@id=\"akeeba-renderjoomla\"]/div/div/div[1]/div[1]/div[2]/div/h2/a"));
		String nameoftwo=clothtwo.getText();
		System.out.println(nameoftwo);
		WebElement cloththree=driver.findElement(By.xpath("//*[@id=\"akeeba-renderjoomla\"]/div/div/div[1]/div[1]/div[3]/div/h2/a"));
		String nameofthree=cloththree.getText();
		System.out.println(nameofthree);
		driver.quit();
	}
}
