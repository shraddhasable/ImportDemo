import org.junit.Test;

import junit.framework.TestCase;

public class Demotest extends TestCase {
	Method m=new Method();
	@Test
	public void testadd() {
		double x=m.addition(100,200);
		assertEquals(300,x,x);
		
	}
	public void testsub() {
		double x=m.subtraction(50,30);
		assertEquals(20,x,x);
		
	}
	public void testmul() {
		double x=m.multiply(10,20);
		assertEquals(200,x,x);
		
	}
	public void testdiv() {
		double x=m.division(200,200);
		assertEquals(1,x,x);
		
	}
	

}
