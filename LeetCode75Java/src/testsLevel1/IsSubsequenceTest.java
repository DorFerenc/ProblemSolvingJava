package testsLevel1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import level1.IsSubsequence;

class IsSubsequenceTest {

	private IsSubsequence temp = new IsSubsequence();
	
	@Test
	void test1() {
		String s = "abc", t = "ahbgdc";
		boolean expRes = true, res = temp.isSubsequence(s, t);
		assertEquals(expRes, res);
	}
	
	@Test
	void test2() {
		String s = "axc", t = "ahbgdc";
		boolean expRes = false, res = temp.isSubsequence(s, t);
		assertEquals(expRes, res);
	}

}
