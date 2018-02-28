import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyTest {

	@Test
	public void test() {
		TestMult tester =new TestMult();
		 assertEquals(0, tester.mult(10, 0), "10 x 0 must be 0");
		 assertEquals(2, tester.add(1, 1), "1 x 1 must be 1");
		//fail("Not yet implemented");
	}

}
