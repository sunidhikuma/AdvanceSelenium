package sample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC05_Test {
	@DataProvider(name = "testData")
	public Object[] MethodName()
	{
			 Object[] val={"hello","demo"};
	       return val;
	}
	@Test(dataProvider ="testData")
	public void tessCase(String oneVar) {
		System.out.println(oneVar);
	}
}
