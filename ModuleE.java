package mainModule;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ModuleE {

	
	@Test
	public void e1()
	{
		System.out.println("Ek tha tiger");
	}
	
	@BeforeSuite
	public void start()
	{
		System.out.println("infinity war");
	}
}
