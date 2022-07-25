package testsLevel1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import level1.IsomorphicStrings;

@SuppressWarnings("unused")
class IsomorphicStringsTest {

	private IsomorphicStrings temp = new IsomorphicStrings();
	
	@Test
	void test1() {
		String s = "egg", t = "add";
		boolean expRes = true, res = temp.IsIsomorphic(s, t);
		assertEquals(expRes, res);
	}
	
	@Test
	void test2() {
		String s = "foo", t = "bar";
		boolean expRes = false, res = temp.IsIsomorphic(s, t);
		assertEquals(expRes, res);
	}
	
	@Test
	void test3() {
		String s = "paper", t = "title";
		boolean expRes = true, res = temp.IsIsomorphic(s, t);
		assertEquals(expRes, res);
	}
	
	@Test
	void test4() {
		String s = "badc", t = "baba";
		boolean expRes = false, res = temp.IsIsomorphic(s, t);
		assertEquals(expRes, res);
	}	
	
	@Test
	void test5() {
		String s = "egcd", t = "adfd";
		boolean expRes = false, res = temp.IsIsomorphic(s, t);
		assertEquals(expRes, res);
	}
	
	@Test
	void test6() {
		String s = "a", t = "a";
		boolean expRes = true, res = temp.IsIsomorphic(s, t);
		assertEquals(expRes, res);
	}
	
	@Test
	void test7() {
		String s = "abab", t = "baba";
		boolean expRes = true, res = temp.IsIsomorphic(s, t);
		assertEquals(expRes, res);
	}
}
