package junitexamples;

import org.junit.Test;

 public class TestCase2 {

	@Test(timeout=1000)
	public void test() {
		System.out.print("inside the test case2");
		try {
			Thread.sleep(500);
		}catch(Exception e){
			System.out.println(e);
			
		}

	}

}
