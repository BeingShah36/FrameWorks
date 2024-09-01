package mainModule;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ModuleB {
	
	@Parameters({"url"})
	@Test
	public void b1(String c)
	{
		System.out.println("bamar");
		System.out.println(c);
	}
	
	@Parameters({"url"})
	@Test
	public void b2(String d)
	{
		System.out.println("bakbar");
		System.out.println(d);
	}
	
    @Test
	public void b3()
	{
		System.out.println("banthoney");
	}
	
	@Test(groups= {"smoke"})
	public void b4()
	{
		System.out.println("baaa");
	}

}
