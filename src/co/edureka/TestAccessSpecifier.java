package co.edureka;

public class TestAccessSpecifier {
	protected void testMethod(){
		// This method can be accessed within package co.edureka and its subclasses but not by other packages
	}

  public void publicTest(){
	//This method can be accessed by all the packages 
}
}
