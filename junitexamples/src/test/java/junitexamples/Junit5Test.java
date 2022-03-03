package junitexamples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class Junit5Test {

	@RepeatedTest(5)
	void test() {
		System.out.println("inside the test");
	}

}
