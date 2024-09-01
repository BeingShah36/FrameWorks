package mainModule;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data {
	
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0]  = "apple";
		data[0][1]  = "ball";
		data[1][0]  = "cat";
		data[1][1]  = "dog";
		data[2][0]  = "enemy";
		data[2][1]  = "fish";
		
		return data;	
		
	}
	
	@Test(dataProvider="getData")
	public void Okjaanu(String a, String b)
	{
		System.out.println(a+b);
	}

}
