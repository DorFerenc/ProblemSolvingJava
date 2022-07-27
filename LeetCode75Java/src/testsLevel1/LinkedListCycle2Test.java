package testsLevel1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import level1.ListNode;
import level1.LinkedListCycle2;

class LinkedListCycle2Test {
	
	private LinkedListCycle2 temp = new LinkedListCycle2();
	private ListNode list1 = new ListNode();
	private ListNode expRes = new ListNode();;
	private ListNode res;
	
	@Test
	void test1() {
		int[] arr1 = {3, 2, 0, -4};
		list1 = list1.getHeadFromArray(arr1);
		list1 = list1.makeACycle(list1, 1, 3);
		int[] arrExpRes = {2, 0, -4};
		expRes = expRes.getHeadFromArray(arrExpRes);
		res = temp.detectCycle(list1);
		
		System.out.println("res:" + res.toString() + " expRes:" + expRes.toString());
		assertEquals(expRes.toString(), res.toString());
	}
	
	@Test
	void test2() {
		int[] arr1 = {1, 2};
		list1 = list1.getHeadFromArray(arr1);
		list1 = list1.makeACycle(list1, 0, 1);
		int[] arrExpRes = {1, 2};
		expRes = expRes.getHeadFromArray(arrExpRes);
		res = temp.detectCycle(list1);
		
		System.out.println("res:" + res.toString() + " expRes:" + expRes.toString());
		assertEquals(expRes.toString(), res.toString());
	}
	
	
	@Test
	void test3() {
		int[] arr1 = {1};
		list1 = list1.getHeadFromArray(arr1);
		int[] arrExpRes = null;
		expRes = expRes.getHeadFromArray(arrExpRes);
		res = temp.detectCycle(list1);
		
		System.out.println("res:" + res.toString() + " expRes:" + expRes.toString());
		assertEquals(expRes.toString(), res.toString());
	}
}
