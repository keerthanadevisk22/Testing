package selenium.day9;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CalculatorData {
	CalculatorLogic c1=new CalculatorLogic();
  @Test(dataProvider = "testData1")
  public void addmethod(int a, int b, int exp) 
  {
	  int res=c1.add(a, b);
	  Assert.assertEquals(exp, res);
  }
  
  @DataProvider
  public Object[][] testData1()
  {
	  return new Object[][] {
		  {1,2,3},{2,2,5}
	  };
  }
  
  @Test(dataProvider = "testData2")
  public void submethod(int a, int b, int exp)
  {
	  int res=c1.sub(a, b);
	  Assert.assertEquals(exp, res);
  }
  @DataProvider
  public Object[][] testData2()
  {
	  return new Object[][] {
		  {8,4,4},{7,5,3}
	  };
  }
  
  @Test(dataProvider = "testData3")
  public void mulmethod(int e, int f, int exp)
  {
	  int res=c1.mul(e, f);
	  Assert.assertEquals(exp, res);
  }
  @DataProvider
  public Object[][] testData3()
  {
	  return new Object[][] {
		  {4,5,20},{2,2,8}
	  };
  }
  @Test(dataProvider = "testData4")
  public void divmethod(int g, int h, int exp)
  {
	  int res=c1.div(g, h);
	  Assert.assertEquals(exp, res);
  }
  @DataProvider
  public Object[][] testData4()
  {
	  return new Object[][] {
		  {6,3,2},{10,5,3}
	  };
  }
}
