package selenium.day9;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Question5 {
  @Test
  public void test01() {
	  Assert.assertEquals(true, false);
  }
  
  public void test02() {
	  Assert.assertEquals(true, true);
  }
}
