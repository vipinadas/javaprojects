package buildPathProject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestcaseChecking {
TestCaseCheck  a=new  TestCaseCheck ();
	@Test
	void test() {
		assertEquals(-200,a.sub(-100, 100));
		
	}
	@Test
	void test1() {
		assertEquals(0,a.sub(-100, -100));	
	}
	@Test
	void test2() {
		assertEquals(0,a.sub(100, 100));	
	}
}