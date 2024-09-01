package mainModule;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ModuleC {

	@Parameters({"url"})
	@Test
	public void c1( String d)
	{
		System.out.println("chamatkar");
		System.out.println(d);
	}
}
