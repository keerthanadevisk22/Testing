package selenium.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class question4 {
	WebDriver driver;
	@BeforeTest
  public void beforeMethod() 
  {
	  WebDriverManager.edgedriver().setup();
	  driver=new EdgeDriver();
	  String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	  driver.manage().window().maximize();
	  driver.get(url);
  }
  
  @Test
  public void Login() throws InterruptedException
  {
	  Thread.sleep(2000);
	  WebElement username= driver.findElement(By.name("username"));
	  username.sendKeys("Admin");
	  WebElement password= driver.findElement(By.name("password"));
	  password.sendKeys("admin123");
	  Thread.sleep(1000);
	  WebElement login= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	  login.click();
	  Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
  }
  
  @Test(dependsOnMethods="Login")
  public void Logout() throws InterruptedException 
  {
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).click(); 
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
	 String actualURL=driver.getCurrentUrl();
	 Assert.assertEquals(actualURL, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 driver.close();
  }
}
