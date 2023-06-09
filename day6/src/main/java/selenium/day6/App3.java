package selenium.day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App3 {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.wpeverest.com/user-registration/paypal-integration-form/");
		driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("keerthanadevi224@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("Hello@222");
		driver.findElement(By.xpath("//*[@id=\"multiple_choice_1641271687_Keyboard\"]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-310\"]/form/div[2]/button")).click();
	}
}
