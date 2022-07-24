package testsLevel1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import Level1.RunningSumJava;

class RunningSumJavaTest {

	@Test
	void testGetNumsS() {
		RunningSumJava rsj = new RunningSumJava();
		int[] nums = {1, 2, 3, 4};
		int[] numsRes = {1, 3, 6, 10};
		int[] res = rsj.runningSum(nums);
		assertEquals(Arrays.toString(res), Arrays.toString(numsRes));
	}
	
	@Test
	void testGetNumsS2() {
		RunningSumJava rsj = new RunningSumJava();
		int[] nums = {1, 1, 1, 1, 1};
		int[] numsRes = {1, 2, 3, 4, 5};
		int[] res = rsj.runningSum(nums);
		assertEquals(Arrays.toString(res), Arrays.toString(numsRes));
	}
	
	@Test
	void testGetNumsS3() {
		RunningSumJava rsj = new RunningSumJava();
		int[] nums = {3, 1, 2, 10, 1};
		int[] numsRes = {3, 4, 6, 16, 17};
		int[] res = rsj.runningSum(nums);
		assertEquals(Arrays.toString(res), Arrays.toString(numsRes));
	}
}
