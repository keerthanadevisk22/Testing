package selenium.day10.excel;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestingUsingExcelsheet {
	@Test(dataProvider = "td")
	public void addmethod(double num1, double num2)
	{
		double result=num1+num2;
	}
	
	
	@DataProvider(name="td")
	public Object[][] testData() throws IOException
	{
		Object[][] data = ExcelUtility.readExcel();
		return data;
	}
}
