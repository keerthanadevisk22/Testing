package selenium.day7;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
  @Test
  public void VerifyTitle() 
  {
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver=new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
	  String actualTitle= driver.getTitle();
	  AssertJUnit.assertEquals(actualTitle, driver.getTitle());
  }
}
