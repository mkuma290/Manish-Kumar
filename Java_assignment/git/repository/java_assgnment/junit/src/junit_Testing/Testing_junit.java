package junit_Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testing_junit {

	@Test
	void test() {
		junit_Testing ju=new junit_Testing();
		int output=ju.array();
		assertEquals(6,output);
		
	}

}
