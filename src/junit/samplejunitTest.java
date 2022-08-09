package junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class samplejunitTest {

	@Test
	public void test() {
		samplejunit sj = new samplejunit();
		int value=sj.calc(10,20);
		assertEquals(20, value);
	}
}
