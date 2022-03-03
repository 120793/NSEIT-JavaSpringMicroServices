package junitexamples;
import static org.junit.Assert.*;

import org.junit.Test;

public class SanityTest {

	@Test
	public void test() {
		assertEquals(10,0);
	}
	@Test
	public void test1() {
		Calculator c=new Calculator();
		assertEquals(3,c.sum(1,2));
	}
	@Test
	public void test2() {
		Calculator c=new Calculator();
		assertEquals(5,c.sum(1,2));
	}
	@Test
	public void test3() {
		String str="Hello";
		assertNotNull(str);
	}

}
