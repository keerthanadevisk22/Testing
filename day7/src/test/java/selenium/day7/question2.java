package selenium.day7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class question2 {
	int num1=20;
	int num2=10;
  @Test(priority=1)
  public void addition() 
  {
	  int num=num1+num2;
	  Assert.assertEquals(num, 30);
  }
  
  @Test(priority=2)
  public void subtraction()
  {
	  int num=num1-num2;
	  Assert.assertEquals(num, 10);
  }
  
  @Test(priority=3)
  public void multiplication()
  {
	  int num=num1*num2;
	  Assert.assertEquals(num, 200);
  }
  
  @Test(priority=4)
  public void divition()
  {
	  int num=num1/num2;
	  Assert.assertEquals(num, 2);
  }
}
