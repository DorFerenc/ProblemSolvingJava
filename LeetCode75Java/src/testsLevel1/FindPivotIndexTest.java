package testsLevel1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import level1.FindPivotIndex;
import level1.RunningSumJava;

class FindPivotIndexTest {

	@Test
	void test() {
		FindPivotIndex temp = new FindPivotIndex();
		int[] nums = {1,7,3,6,5,6};
		int numsRes = 3;
		int res = temp.pivotIndex(nums);
		System.out.println(res);
		assertEquals("" + res, "" + numsRes);
	}
	
	@Test
	void test2() {
		FindPivotIndex temp = new FindPivotIndex();
		int[] nums = {1, 2, 3};
		int numsRes = -1;
		int res = temp.pivotIndex(nums);
		System.out.println(res);
		assertEquals("" + res, "" + numsRes);
	}
	
	@Test
	void test3() {
		FindPivotIndex temp = new FindPivotIndex();
		int[] nums = {2, 1, -1};
		int numsRes = 0;
		int res = temp.pivotIndex(nums);
		System.out.println(res);
		assertEquals("" + res, "" + numsRes);
	}
	
	@Test
	void test4() {
		FindPivotIndex temp = new FindPivotIndex();
		int[] nums = {-1,-1,0,1,1,0};
		int numsRes = 5;
		int res = temp.pivotIndex(nums);
		System.out.println(res);
		assertEquals("" + res, "" + numsRes);
	}
}
