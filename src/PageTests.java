
import org.testng.annotations.Test;

public class PageTests   {
	
	PageObjects POM = new PageObjects();
	
	@Test
	public void testcase(){
		POM.setup();
		POM.login();
	}

}
