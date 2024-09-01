package mainModule;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
public class ModuleA {
	
	@Test
	public void a1()
	{
		System.out.println("amar");
	}
	
	@AfterMethod
	public void last()
	{
		System.out.println("ham hi mantri");
	}
	
	@Test
	public void a2()
	{
		System.out.println("akbar");
		Assert.assertTrue(false);
	}
	
	@BeforeMethod
	public void first()
	{
		System.out.println("ham hi raja");
	}
	
	@AfterSuite
	public void end()
	{
		System.out.println("endgame");
	}
	
	@Parameters({"abc"})
	@Test
	public void a3(String a)
	{
		System.out.println("anthoney");
		System.out.println(a);
	}
	
	@AfterTest
	public void after()
	{
		System.out.println("i will execute last");
	}
	
	@Test
	public void a4()
	{
		System.out.println("aaa");
	}

}
