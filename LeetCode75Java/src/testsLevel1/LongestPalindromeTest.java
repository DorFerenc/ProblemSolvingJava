package testsLevel1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import level1.LongestPalindrome;

class LongestPalindromeTest {

	LongestPalindrome temp = new LongestPalindrome();
	
	@Test
	void test1() {
		String s = "abccccdd";
		int expRes = 7;
		int res = temp.longestPalindrome(s);
		System.out.println(res);
		assertEquals(expRes, res);
	}
	
	@Test
	void test2() {
		String s = "a";
		int expRes = 1;
		int res = temp.longestPalindrome(s);
		System.out.println(res);
		assertEquals(expRes, res);
	}
	
	@Test
	void test3() {
		String s = "bananas";
		int expRes = 5;
		int res = temp.longestPalindrome(s);
		System.out.println(res);
		assertEquals(expRes, res);
	}
	
	@Test
	void test4() {
		String s = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
		int expRes = 983;
		int res = temp.longestPalindrome(s);
		System.out.println(res);
		assertEquals(expRes, res);
	}

}
