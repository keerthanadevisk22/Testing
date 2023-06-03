package selenium.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class question3 {
	WebDriver driver;
	
	@BeforeMethod
  public void beforemethod() 
  {
	  WebDriverManager.edgedriver().setup();
	  driver= new EdgeDriver();
	  driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
  }
  
 @Test
  public void test() throws InterruptedException
  {
	  Thread.sleep(2000);
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  Thread.sleep(4000);
	  String login= "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	  Thread.sleep(1000);
	  Assert.assertEquals(login, driver.getCurrentUrl());
  }
  
 @AfterMethod
  public void afterMethod()
  {
	  driver.quit();
  }
}
