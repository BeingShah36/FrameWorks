package mainModule;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ModuleD {

	
	@Test
	public void d1()
	{
		System.out.println("Dabbang");
	}
	
	@DataProvider
	
	
	@BeforeTest
	public void before()
	{
		System.out.println("I will execute first");
	}
}
