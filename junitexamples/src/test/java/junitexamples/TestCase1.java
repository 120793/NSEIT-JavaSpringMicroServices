package junitexamples;
import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class TestCase1 {

	@Test
	
	public void test1() {
	System.out.println("inside the test case1");
	}
	
	@Test
	@Ignore
	public void test2() {
	System.out.print("inside the test case2");
	}
	
	@Test(expected=NullPointerException.class)
	public void test3() {
	System.out.println("inside the test case3");
	int a=10/2;
	String str=null;
	str.equals("heloo");
	}

}
