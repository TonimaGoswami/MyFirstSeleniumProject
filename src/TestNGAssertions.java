import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestNGAssertions {
	TestNGAssertionMethods testNG = new TestNGAssertionMethods();
	@Test
	public void checkTitle(){
		testNG.setUp();
		assertEquals(testNG.PageTitle(), "Facebook - Log In or Sign Up" );
		
	}
	@Test
	public void TestSum(){
		assertEquals(testNG.Sum(5, 6), 11);
		
		
	}
	@Test
	public void CheckTrue(){
		assertTrue(testNG.StateTrue());
	}
	@Test
	
	public void CheckNull(){
		assertNull(testNG.StateNull());
	}
	
		
	}


