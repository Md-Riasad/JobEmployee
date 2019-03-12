import static org.junit.Assert.*;

import org.junit.Test;

public class HumanTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		Human h = new Human("Riasad",01,23,"Male","Banasree","Good","Nice ","Good");
		String n = h.study();
	    assertEquals("Riasad",n);
	}

}
